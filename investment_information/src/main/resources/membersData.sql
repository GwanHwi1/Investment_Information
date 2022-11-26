CREATE TABLE MEMBERS(
                        ID VARCHAR(50) PRIMARY KEY ,
                        PWD VARCHAR(50),
                        NAME  VARCHAR(50),
                        EMAIL VARCHAR(50),
                        AUTH INTEGER
);


INSERT INTO MEMBERS
VALUES ('admin', 'admin', 'admin', 'admin@example.com', 1);