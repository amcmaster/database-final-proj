CREATE TABLE bikes(
    BID int REFERENCES brands(BID),
    BNAME varchar REFERENCES brands(BNAME),
    COLOR varchar,
    PRICE numeric(1000000, 2),
    INSTOCK int NOT NULL,
    STYLE varchar,
    PRIMARY KEY(BID)
);

CREATE TABLE customers(
    CID int,
    FNAME varchar,
    LNAME varchar,
    BOD date,
    PHONE numeric(10),
    ADDRESS varchar NOT NULL,
    PRIMARY KEY(CID)
);

CREATE TABLE orders(
    ONUM int,
    CARDNUM int NOT NULL,
    PRIMARY KEY(ONUM)
);

CREATE TABLE brands(
    BID int,
    BIKEBRAND varchar,
    BNAME varchar,
    PRIMARY KEY(BID)
);

CREATE TABLE placeorder(
    CID int REFERENCES customers(CID),
    ONUM int REFERENCES orders(ONUM),
    ORDERDATE timestamp,
    PRIMARY KEY(CID, ONUM)
);

CREATE TABLE provide(
    BID int REFERENCES brands(BID),
    PRICE numeric(1000000,2) NOT NULL,
    QTY int,
    PRIMARY KEY(BID)
);

CREATE TABLE orderlist(
    BID int REFERENCES bikes(BID),
    ONUM int REFERENCES orders(ONUM),
    QTY int,
    SHIPDATE timestamp,
    PRIMARY KEY(BID, ONUM)
);





