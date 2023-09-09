# bootcoding-java-project



```
CREATE TABLE Customer (
id INT PRIMARY KEY,
name VARCHAR(255),
address VARCHAR(255),
phone BIGINT,
city VARCHAR(255)
);
CREATE TABLE Vendor (
id INT PRIMARY KEY,
name VARCHAR(255),
address VARCHAR(255),
contact BIGINT,
isVeg BOOLEAN
);
CREATE TABLE Menu_Item (
id INT PRIMARY KEY,
menuName VARCHAR(255),
isVeg BOOLEAN,
price BIGINT,
flavour VARCHAR(255)
);
CREATE TABLE Order_Table (
id INT PRIMARY KEY,
deliveryAddress VARCHAR(255),
orderDate DATE,
amount BIGINT,
restaurantName VARCHAR(255),
contact BIGINT,
customerName VARCHAR(255)
);
CREATE TABLE Order_Menu_Item (
id INT PRIMARY KEY,
numberOfMenus INT,
totalPrice BIGINT
);
```




Steps required to Create and Build Project


2 tier / 3 tier architecture

1) Presentation/ View Layer (UI / Frontent)
2) Business / Application Layer (Backend)
3) Persistence Layer (Database)














