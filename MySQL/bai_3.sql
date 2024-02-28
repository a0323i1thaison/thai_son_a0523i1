create
database if not exists Quan_Ly_Sinh_Vien ;
use
Quan_Ly_Sinh_Vien;
create table Class
(
    ClassID   int primary key,
    ClassName varchar(60),
    StartDate Datetime,
    Status    Bit
);
create table Student
(
    StudentID   int primary key,
    StudentName varchar(30),
    Address     varchar(50),
    Phone       varchar(20),
    Status      Bit,
    Classid     int,
    foreign key (Classid) references Class (ClassID)
);
create table Subject
(
    SubID   int primary key,
    SubName varchar(30),
    Credit  Tinyint,
    Status  Bit
);
create table Mark
(
);
