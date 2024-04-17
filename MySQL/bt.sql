create database demo;
use  demo;
create table Products (
  Id int primary key auto_increment ,
  productCode varchar (50),
  productName varchar (100),
  productPrice decimal (10, 2),
  productAmount int ,
  productDescription text ,
  productStatus varchar (20)
);

insert into  Products (productCode, productName, productPrice, productAmount, productDescription, productStatus)
values  ('P1', 'Product 1', 10.99, 100, 'Description 1', 'Active'),
       ('P2', 'Product 2', 19.99, 50, 'Description 2', 'Active'),
       ('P3', 'Product 3', 5.99, 200, 'Description 3', 'Inactive');
       
create unique index  idx_productCode on  Products (productCode);
create index  idx_productName_productPrice on Products (productName, productPrice);
EXPLAIN SELECT * FROM Products WHERE productCode = 'P1';
CREATE VIEW ProductView AS
SELECT productCode, productName, productPrice, productStatus
FROM Products;
ALTER VIEW ProductView AS
SELECT productCode, productName, productPrice
FROM Products
WHERE productStatus = 'Active';
DROP VIEW IF EXISTS ProductView;
DELIMITER //
CREATE PROCEDURE GetAllProducts()
BEGIN
    SELECT *
    FROM Products;
END //
DELIMITER ;
DELIMITER //
