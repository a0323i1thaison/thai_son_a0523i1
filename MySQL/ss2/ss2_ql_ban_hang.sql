create database c1023i1_QL_ban_hang;
use c1023i1_QL_ban_hang;
create table customer (
cId int primary key  ,
cName varchar(50),
cAge datetime
);
create table orderr (
oId int primary key ,
cId int ,
oDate datetime,
oTotal float
);
create table product (
pID int primary key  ,
pName varchar (50),
pPrice float
);
create table orderdetail(
oId
);