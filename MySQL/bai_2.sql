create
database if not exists Quan_Ly_Ban_Hang;
use
Quan_Ly_Ban_Hang;
create table customer
(
    cID   int primary key,
    cName varchar(50),
    cAge  varchar(50)
);
create table product
(
    pID    int primary key,
    pName  varchar(50),
    pPrice varchar(50)
);
create table oder
(
    oID         int primary key,
    oDate       varchar(50),
    oTotalPrice varchar(50),
    ID          int,
    foreign key (ID) references customer (cID)
);
create table orderdetail
(
    IDo   int,
    IDp   int,
    foreign key (IDo) references oder (oID),
    foreign key (IDp) references product (pID),
    odQTY varchar(50)
);