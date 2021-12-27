CREATE TABLE TEAM(
    "�� ���̵�" VARCHAR2(10), 
    "����" VARCHAR2(10), 
    "�� ��" VARCHAR2(20), 
    "���� ��¥" DATE, 
    ��ȭ��ȣ VARCHAR2(12),
    Ȩ������ VARCHAR2(50),
    CONSTRAINT PK_TEAM PRIMARY KEY("�� ���̵�")
);


CREATE TABLE PLAYER(
    ������ȣ INTEGER,
    "���� ��" VARCHAR2(20),
    ����� DATE,
    ������ VARCHAR(10),
    Ű NUMBER(5, 2),
    "�� ���̵�" VARCHAR2(10),
    CONSTRAINT FK_PLAYER FOREIGN KEY("�� ���̵�")
        REFERENCES TEAM("�� ���̵�"),
    CONSTRAINT PK_PLAYER PRIMARY KEY(������ȣ)
);

DROP TABLE TEAM
CASCADE CONSTRAINTS;

DROP TABLE PLAYER
CASCADE CONSTRAINTS;

    
INSERT INTO TEAM("�� ���̵�", ����, "�� ��", "���� ��¥", ��ȭ��ȣ, Ȩ������)
VALUES('001', '����', '����', '21/11/11', '123-4567', 'www.redteam.com');

INSERT INTO TEAM("�� ���̵�", ����, "�� ��", "���� ��¥", ��ȭ��ȣ, Ȩ������)
VALUES('002', '���', '���', '21/12/12', '234-5678', 'www.blueteam.com');

INSERT INTO PLAYER(������ȣ, "���� ��", �����, ������, Ű, "�� ���̵�")
VALUES(10, '������', '21/11/12', 'ž', 170.12, '001');

INSERT INTO PLAYER(������ȣ, "���� ��", �����, ������, Ű, "�� ���̵�")
VALUES(11, '������', '21/11/13', '�̵�', 175.16, '001');

INSERT INTO PLAYER(������ȣ, "���� ��", �����, ������, Ű, "�� ���̵�")
VALUES(12, '�����', '21/11/14', '����', 168.42, '001');

INSERT INTO PLAYER(������ȣ, "���� ��", �����, ������, Ű, "�� ���̵�")
VALUES(21, '�����', '21/12/20', 'ž', 180.02, '002');

INSERT INTO PLAYER(������ȣ, "���� ��", �����, ������, Ű, "�� ���̵�")
VALUES(22, '�����', '21/12/21', '�̵�', 175.68, '002');

INSERT INTO PLAYER(������ȣ, "���� ��", �����, ������, Ű, "�� ���̵�")
VALUES(23, '����', '21/12/22', '����', 166.22, '002');

select "�� ��", ��ȭ��ȣ, Ȩ������
from TEAM, PLAYER
where player."���� ��" = '�����' AND player."�� ���̵�" = team."�� ���̵�";



CREATE TABLE PRODUCT(
    ITEM_NO INTEGER, 
    ITEM_NAME VARCHAR2(10), 
    PRICE INTEGER, 
    MEMO VARCHAR2(100), 
    CONSTRAINT PK_PRODUCT PRIMARY KEY(ITEM_NO)
);

CREATE TABLE CONSUMER(
    CONSUMER_ID VARCHAR2(10), 
    CONSUMER_NAME VARCHAR2(10), 
    AGE INTEGER, 
    CONSTRAINT PK_CONSUMER PRIMARY KEY(CONSUMER_ID)
);

CREATE SEQUENCE CART_IDX
INCREMENT BY 1  -- 1�� ����
START WITH 1   -- ���� ����
MAXVALUE 100
MINVALUE 1;

DROP SEQUENCE CART_IDX;

DROP TABLE CART
CASCADE CONSTRAINTS;

CREATE TABLE CART(
    CART_NO INTEGER, 
    CONSUMER_ID VARCHAR2(10), 
    ITEM_NO INTEGER, 
    ITEM_COUNT INTEGER, 
    CONSTRAINT FK_CONSUMER_ID FOREIGN KEY(CONSUMER_ID)
        REFERENCES CONSUMER(CONSUMER_ID),
    CONSTRAINT FK_ITEM_NO FOREIGN KEY(ITEM_NO)
        REFERENCES PRODUCT(ITEM_NO),
    CONSTRAINT PK_CART PRIMARY KEY(CART_NO)
);

INSERT INTO PRODUCT(ITEM_NO, ITEM_NAME, PRICE, MEMO)
VALUES(1, '����', 300, '2B����');

INSERT INTO PRODUCT(ITEM_NO, ITEM_NAME, PRICE, MEMO)
VALUES(2, '���찳', 500, '������ ���찳');

INSERT INTO PRODUCT(ITEM_NO, ITEM_NAME, PRICE, MEMO)
VALUES(3, '��å', 2000, '�������� �޷��ֽ��ϴ�.');

INSERT INTO PRODUCT(ITEM_NO, ITEM_NAME, PRICE, MEMO)
VALUES(4, '����', 1000, '����, ����, �Ķ��� ���� ���� �ֽ��ϴ�.');

INSERT INTO PRODUCT(ITEM_NO, ITEM_NAME, PRICE, MEMO)
VALUES(5, '����', 5000, '�پ��� ���������� �����ϴ�.');

INSERT INTO CONSUMER(CONSUMER_ID, CONSUMER_NAME, AGE)
VALUES('STUDENT_1', '�л���', 17);

INSERT INTO CONSUMER(CONSUMER_ID, CONSUMER_NAME, AGE)
VALUES('STUDENT_2', '�л���', 15);

INSERT INTO CART( CART_NO, CONSUMER_ID,ITEM_NO, ITEM_COUNT)
VALUES(CART_IDX.NEXTVAL, 'STUDENT_1', 1, 2);

INSERT INTO CART( CART_NO, CONSUMER_ID,ITEM_NO, ITEM_COUNT)
VALUES(CART_IDX.NEXTVAL, 'STUDENT_1', 2, 1);

SELECT c.CONSUMER_NAME, p.ITEM_NAME, r.ITEM_COUNT
FROM PRODUCT p, CONSUMER c, CART r
    WHERE
    (p.ITEM_NO, r.ITEM_COUNT) IN
    (SELECT ITEM_NO, ITEM_COUNT FROM CART WHERE CONSUMER_ID = 'STUDENT_1')
    AND
    c.consumer_id = 'STUDENT_1';
    
SELECT c.CONSUMER_NAME, p.ITEM_NAME, r.ITEM_COUNT
FROM PRODUCT p, CONSUMER c, CART r
WHERE
c.consumer_id = 'STUDENT_1'
AND
r.item_no = p.item_no;