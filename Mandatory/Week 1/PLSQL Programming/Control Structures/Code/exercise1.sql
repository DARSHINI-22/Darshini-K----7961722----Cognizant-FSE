-- Create Customers Table

CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

-- Create Loans Table

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE
);

-- Insert Customer Data

INSERT INTO Customers VALUES (1,'Ravi',65,15000,'FALSE');
INSERT INTO Customers VALUES (2,'Priya',45,8000,'FALSE');
INSERT INTO Customers VALUES (3,'Kumar',70,25000,'FALSE');

-- Insert Loan Data

INSERT INTO Loans VALUES (101,1,10,SYSDATE+20);
INSERT INTO Loans VALUES (102,2,12,SYSDATE+50);
INSERT INTO Loans VALUES (103,3,11,SYSDATE+10);

COMMIT;

SELECT * FROM Customers;

SELECT * FROM Loans;