package com.zhaoyang.serviceImpl;

import com.zhaoyang.dao.BookDAO;
import com.zhaoyang.dao.OrderDAO;
import com.zhaoyang.dao.UserDAO;
import com.zhaoyang.entity.Orderitem;

import com.zhaoyang.entity.Orders;
import com.zhaoyang.entity.Book;
import com.zhaoyang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private BookDAO bookDAO;

    @Override
    public void addOrder(Integer id, String time,List<Integer> books, List<Integer> nums){
        Integer orderMoney=0;
        List<Book> bookList = new ArrayList<>();
        List<Integer> bookNumList;
        List<Orderitem> orderItemList=new ArrayList<>();
        Orderitem orderItem;
        bookNumList=nums;
        Orders orders = new Orders(id,0,time,orderItemList);
        orderDAO.addOrder(orders);             //save后order主键得到更新，数据库自增
        orders.setOrderitems(orderItemList);
        for(int i=0;i<books.size();++i)
        {
            orderItem=new Orderitem(orders,(books.get(i)),bookNumList.get(i),bookDAO.getOne(books.get(i)).getPrice());
            orderItemList.add(orderItem);
        }
        orders.setOrderitems(orderItemList);
        orderDAO.addOrder(orders);              //增加order订单项属性,save again

        for(int i=0;i<books.size();++i)
        {
            bookDAO.buyBooks(books.get(i),nums.get(i));
        }
    }


    @Override
    public Orders getOne(int oid){ return orderDAO.getOne(oid);}

    @Override
    public List<Orders> getAllById(int id){
        List<Orders> tmp = orderDAO.getAll();
        System.out.println("findAll size = " + tmp.size());
        Iterator<Orders> iter = tmp.iterator();
        while(iter.hasNext()){  //执行过程中会执行数据锁定，性能稍差，若在循环过程中要去掉某个元素只能调用iter.remove()方法。
            Orders orders = iter.next();
            System.out.println(orders.toString());
            if(orders.getId() != id)
            {
                iter.remove();
            }
        }
        System.out.println("final size "+ tmp.size());
        return tmp;
        }

    @Override
    public long getOid(){return orderDAO.getOid();}

    @Override
    public long getIid(){return  orderDAO.getIid();}

    @Override
    public List<Orderitem> getItems(){return orderDAO.getItems();}
}
