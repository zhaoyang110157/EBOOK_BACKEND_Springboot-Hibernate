drop database ebook;
create database ebook;
use ebook;
create table book(
	title varchar(50),
    bid int auto_increment,
    state int,
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
    id int auto_increment,
    password varchar(50),
    allowed bool,
    role varchar(7),
    primary key (id)
);
CREATE TABLE orders (
    id INT,
    oid INT auto_increment,
    time DATETIME,
    PRIMARY KEY (oid),
    FOREIGN KEY (id)
        REFERENCES users (id)
        ON DELETE CASCADE
         ON UPDATE CASCADE
);
create table orderitem(
    iid int auto_increment,
	oid int,
    bid int,
    price float,
    sales int,
    primary key (iid),
    foreign key (oid) references orders(oid) on delete cascade ON UPDATE CASCADE,
    foreign key (bid) references book(bid) on delete cascade ON UPDATE CASCADE
);