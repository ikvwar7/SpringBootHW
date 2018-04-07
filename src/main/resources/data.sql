CREATE TABLE Account(
id NUMBER not null,
ownerId NUMBER not null,
name VARCHAR(255) not null,
rate NUMBER not null,
PRIMARY KEY (id)
);

CREATE TABLE Company(
id NUMBER not null,
title VARCHAR(255),
PRIMARY KEY (id)
);

CREATE TABLE Owner(
id NUMBER not null,
companyId NUMBER not null,
firstName VARCHAR(255),
lastName varchar(255),
PRIMARY KEY (id)
);

INSERT INTO Account (id,ownerId,name,rate) VALUES(1,1,'acc1',5.0);
INSERT INTO Account (id,ownerId,name,rate) VALUES(2,1,'acc2',10.0);
INSERT INTO Account (id,ownerId,name,rate) VALUES(3,2,'acc3',15.0);
INSERT INTO Account (id,ownerId,name,rate) VALUES(4,3,'acc4',20.0);

INSERT INTO Company (id,title) VALUES(1,'companyFirst');
INSERT INTO Company (id,title) VALUES(2,'companySecond');
INSERT INTO Company (id,title) VALUES(3,'companyThird');

INSERT INTO Owner (id,companyId,firstName,lastName) VALUES(1,1,'Petrov','Ivan');
INSERT INTO Owner (id,companyId,firstName,lastName) VALUES(2,2,'Sidorov','Kirill');
INSERT INTO Owner (id,companyId,firstName,lastName) VALUES(3,2,'Ivanov','Sergey');