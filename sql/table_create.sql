drop database ebook;
create database ebook;
use ebook;
create table book(
	title varchar(50),
    bid int,
    image varchar(50),
	ISBN varchar(20),
    author varchar(50),
    price float,
    inventory int,
    tranch varchar(15),
    introduction varchar(1000),
    primary key (bid)
);
create table users(
    account varchar(50),
    id int,
    password varchar(50),
    allowed bool,
    role varchar(7),
    primary key (id)
);
create table orders(
	id int,
    oid int,
    time datetime,
    primary key (oid),
    foreign key (id) references users(id) on delete cascade
);
create table orderitem(
    iid int,
	oid int,
    bid int,
    price float,
    sales int,
    primary key (iid),
    foreign key (oid) references orders(oid) on delete cascade,
    foreign key (bid) references book(bid) on delete cascade
);