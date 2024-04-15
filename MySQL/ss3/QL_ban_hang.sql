create database c1023i1_QL_ban_hang;
use c1023i1_QL_ban_hang;
create table customer (
cId int primary key  ,
cName varchar(50),
cAge int 
);
create table orderr (
oID int primary key ,
cid int ,
oDate datetime,
oTotal int,
foreign key (cid)references customer(cId)
);
create table product (
pID int primary key  ,
pName varchar (50),
pPrice float
);
create table orderdetail(
oId int ,
pId int ,
odQTY int ,
foreign key (oId) references orderr (oID),
foreign key (pId) references product (pID)
);