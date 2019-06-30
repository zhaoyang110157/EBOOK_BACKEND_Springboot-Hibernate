package com.zhaoyang.serviceImpl;

import com.zhaoyang.dao.BookDAO;
import com.zhaoyang.dao.OrderDAO;
import com.zhaoyang.entity.Orderitem;

import com.zhaoyang.entity.Book;
import com.zhaoyang.entity.Orders;
import com.zhaoyang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private BookDAO bookDAO;

    @Override
    public void addOrder(Integer id, String time,List<Integer> books, List<Integer> nums){
        Integer orderMoney=0;
        List<Book> bookList=new ArrayList<>();
        List<Integer> bookNumList;
        List<Orderitem> orderItemList=new ArrayList<>();
        Orderitem orderItem;
        bookNumList=nums;

        for(int i=0;i<books.size();++i)
        {
            bookList.add(bookDAO.getOne(books.get(i)));
        }

        int oid = (int)orderDAO.getOid();

        Orders orders=new Orders(id,oid,time,orderItemList);

        orderDAO.addOrder(orders);             //save后order主键得到更新，数据库自增

        orders.setOrderitems(orderItemList);
        int iid = (int)orderDAO.getIid();
        for(int i=0;i<books.size();++i)
        {
            orderItem=new Orderitem(orders,bookDAO.getOne(books.get(i)),iid+i,bookNumList.get(i),bookDAO.getOne(books.get(i)).getPrice());
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
    public List<Orders> getAllById(int id){ return orderDAO.getAllById(id);}

    @Override
    public long getOid(){return orderDAO.getOid();}

    @Override
    public long getIid(){return  orderDAO.getIid();}
}
