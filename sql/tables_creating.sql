use ebook;
drop table if exists orderitem;
drop table if exists orders;
drop table if exists users;
drop table if exists book;
create table if not exists users 
	(
    account varchar(50),
    id		int,
    password varchar(50),
    allowed int default 1,
    role  varchar(7),
    primary key (id)
	);
create table if not exists book
	(
    title varchar(50),
	bid int,
    image varchar(50),
    ISBN varchar(20) ,
    writer varchar(50),
    price float,
    inventory int,
    tranch varchar(15),
    introduction varchar(1000),
    primary key (bid)
    );
create table if not exists orders
	(
		id int,
        oid int ,
        time  datetime,
        primary key (oid),
         foreign key (id) references users(id)
		
    );
create table if not exists orderitem
	(
        oid int ,
        bid int,
        sales int,
        price float,
        primary key (oid,bid)
    );