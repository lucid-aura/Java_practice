--온라인 마켓 TABLE을 작성하라.
-- PRODUCT(상품) : 상품번호, 상품명, 상품가격, 상품설명
CREATE TABLE PRODUCT(
    PRODUCTID NUMBER PRIMARY KEY,
    NAME VARCHAR2(50) NOT NULL,
    PRICE NUMBER NOT NULL,
    PRODUCT_DESC VARCHAR2(500)
);

-- CONSUMER(소비자) : 소비자 ID, 이름, 나이
CREATE TABLE CONSUMER(
    USERID VARCHAR2(50) CONSTRAINT PK_USER_ID PRIMARY KEY,
    NAME VARCHAR2(50) NOT NULL,
    AGE NUMBER(3) NOT NULL
);

-- CART(장바구니) : 장바구니 번호, 소비자 ID, 상품번호, 수량
CREATE TABLE CART(
    CARTID NUMBER CONSTRAINT PK_CART_ID PRIMARY KEY,
    USERID VARCHAR2(50),    -- 외래키
    PRODUCTID NUMBER,       -- 외래키
    AMOUNT NUMBER
);

ALTER TABLE CART
ADD
CONSTRAINT FK_PRODUCT_ID FOREIGN KEY(PRODUCTID)
REFERENCES PRODUCT(PRODUCTID);

ALTER TABLE CART
ADD
CONSTRAINT FK_USER_ID FOREIGN KEY(USERID)
REFERENCES CONSUMER(USERID);

-- 상품 테이블에 상품을 등록합니다(개수는 원하는 데로).
INSERT INTO PRODUCT(PRODUCTID, NAME, PRICE, PRODUCT_DESC)
VALUES(100, '새우깡', 1500, '새우가 들어 있지 않습니다');

INSERT INTO PRODUCT(PRODUCTID, NAME, PRICE, PRODUCT_DESC)
VALUES(101, '포테이토칩', 2300, '통감자');

INSERT INTO PRODUCT(PRODUCTID, NAME, PRICE, PRODUCT_DESC)
VALUES(102, '카누', 5000, '');

SELECT * FROM PRODUCT;

-- 소비자를 등록합니다.
INSERT INTO CONSUMER(USERID, NAME, AGE)
VALUES('hgd1001', '홍길동', 24);

INSERT INTO CONSUMER(USERID, NAME, AGE)
VALUES('sch2002', '성춘향', 16);

-- 소비자가 쇼핑한 상품을 추가합니다.(장바구니에 담는다)
INSERT INTO CART(CARTID, USERID, PRODUCTID, AMOUNT)
VALUES(1, 'sch2002', 101, 3);

INSERT INTO CART(CARTID, USERID, PRODUCTID, AMOUNT)
VALUES(2, 'sch2002', 102, 10);

INSERT INTO CART(CARTID, USERID, PRODUCTID, AMOUNT)
VALUES(3, 'hgd1001', 100, 1);

-- 쇼핑한 상품을 출력합니다.
SELECT *
FROM cart
WHERE userid = 'sch2002';

SELECT c.userid, c.productid, p.name, p.price
FROM cart c, product p
WHERE c.productid = p.productid
    AND c.userid = 'sch2002';


