select now();

show databases;

use mysql;

create database test;

use test;

create table member(
    id varchar(50) primary key,
    pwd varchar(50) not null,
    name varchar(50) not null,
    email varchar(50) not null,
    auth integer not null
);
    
    
DROP TABLE sequences;
DROP PROCEDURE create_sequence;
DROP FUNCTION NEXTVAL;

-- 시퀀스 테이블 생성
CREATE TABLE sequences(
    name varchar(32), 
    currval BIGINT UNSIGNED 
)ENGINE=InnoDB;

-- 시퀀스를 생성하는 프로시저 생성
CREATE PROCEDURE create_sequence(IN the_name text)
MODIFIES SQL DATA
DETERMINISTIC
BEGIN
    DELETE FROM sequences WHERE name=the_name;
    INSERT INTO sequences VALUES (the_name, 0);
END

-- nextval function 생성
CREATE FUNCTION NEXTVAL(the_name varchar(32)) 
RETURNS BIGINT UNSIGNED
MODIFIES SQL DATA
DETERMINISTIC
BEGIN
    DECLARE ret BIGINT UNSIGNED;
    UPDATE sequences SET currval=currval+1 WHERE name=the_name;
    SELECT currval INTO ret FROM sequences WHERE name=the_name limit 1;
RETURN ret;
END

-- 시퀀스명 입력 및 0값 넣기 ('Student_seq' 대신 원하는 시퀀스 명을 넣을 것)
INSERT INTO sequences 
VALUES('SEQ_BBS', 0);

DROP TABLE sequences;

-- nextval 값 가져오기(확인용)
select NEXTVAL('SEQ_BBS') as SEQ 
from dual;

COMMIT;