-- Accounts Table

CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    AccountType VARCHAR2(20),
    Balance NUMBER
);

-- Employees Table

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER
);

-- Sample Accounts

INSERT INTO Accounts VALUES (101,'Ravi','SAVINGS',10000);
INSERT INTO Accounts VALUES (102,'Priya','SAVINGS',20000);
INSERT INTO Accounts VALUES (103,'Kumar','CURRENT',15000);

-- Sample Employees

INSERT INTO Employees VALUES (1,'Arun','IT',50000);
INSERT INTO Employees VALUES (2,'Divya','IT',60000);
INSERT INTO Employees VALUES (3,'Karthik','HR',45000);

COMMIT;

SELECT * FROM Accounts;

SELECT * FROM Employees;