/*
TABLE DATA들
    INSERT
    DELETE
    SELECT - 90%
    UPDATE
    
    형식:
        SELECT (값, 컬럼명, 함수, SUB QUERY)
        FROM (테이블명, SUBQUERY)
*/
SELECT * FROM employees;

SELECT * FROM TAB; -- hr 계정에 있는 모든 테이블을 볼 수 있는 명령어

DESC EMPLOYEES; -- 디벨롭만 가능한 기능 명세가 나온다.

SELECT EMPLOYEE_ID, FIRST_NAME, SALARY
FROM EMPLOYEES;

SELECT LAST_NAME, SALARY, SALARY + 300
FROM EMPLOYEES;

SELECT LAST_NAME, SALARY * 12
FROM EMPLOYEES;

-- String str = "hello", str1 = "world" str = str + str
--                                            str || str1

SELECT FIRST_NAME || ' ' || SALARY
FROM EMPLOYEES;

-- ALIAS (별명) AS 생략 가능, 띄워쓰기 불가(큰따옴표로 해결)
SELECT employee_id AS "사원 번호", SALARY AS 월급, first_name 이름
FROM EMPLOYEES;

-- DISTINCT : 중복행을 삭제
SELECT DISTINCT JOB_ID
FROM EMPLOYEES;

--