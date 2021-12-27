/*
    SELECT
    FROM
    
    DUAL -> 가상테이블, 임시테이블
*/

SELECT 1, 'A' FROM DUAL;
SELECT 'A' FROM DUAL;
SELECT TO_DATE('20211222', 'YYYYMMDD') FROM DUAL;

/*
    SELECT
    FROM
    WHERE -> 조건절 if
    
    비교연산자( > < <= >= != = <> )
    NULL, IS NULL, IS NOT NULL
    && -> AND, || -> OR, ( )
*/

SELECT first_name, last_name, SALARY
FROM employees
WHERE first_name = 'Julia';

-- 급여가 9000 이상인 사원
SELECT first_name, salary
FROM employees
WHERE salary >= 9000;

-- 이름이 shanta보다 큰 이름
SELECT first_name
FROM employees
WHERE first_name > 'Shanta';

-- 이름의 첫 스펠링이 J보다 큰 이름
SELECT first_name
FROM employees
WHERE first_name > 'J';

-- 매니저(상사)가 없는 사원
SELECT first_name
FROM employees
WHERE manager_id is NULL;

-- 보너스가 있는 사람
SELECT first_name, commission_pct
FROM employees
WHERE commission_pct IS NOT NULL;

-- AND
SELECT first_name, last_name
FROM employees
WHERE first_name = 'Shanta'
    AND last_name = 'Vollman';
    
-- 이름 John이고 월급이 5000 이상
SELECT first_name, salary
FROM employees
WHERE first_name = 'John'
    AND salary >= 5000;
    
-- 2007년 12월 31일 이후에 입사한 사원을 출력
SELECT first_name, hire_date
FROM employees
WHERE hire_date > TO_DATE('20071231' , 'YYYYMMDD'); -- 정석
--WHERE hire_date > '07/12/31'; -- 되긴 됨

-- ALL(=AND), ANY(=OR)
SELECT *
FROM employees
WHERE first_name = ALL('Julia', 'John');
-- WHERE first_name = 'Julia' AND first_name = 'John';

SELECT *
FROM employees
WHERE first_name = ANY('Julia', 'John');

SELECT first_name, salary
FROM employees
WHERE salary = ANY(8000, 3200, 6000);

-- IN, NOT IN
SELECT first_name, salary
FROM employees
WHERE salary IN(8000, 3200, 6000);

SELECT first_name
FROM employees
WHERE first_name IN('Julia', 'John');

-- BETWEEN 범위 연산자 ( AND가 들어가므로 괄로로 묶어주는 것이 좋음 )
SELECT first_name, salary
FROM employees
WHERE salary BETWEEN 3200 AND 9000;
-- WHERE salary >= 3200 AND saraly <= 9000;

SELECT first_name, salary
FROM employees
WHERE salary NOT BETWEEN 3200 AND 9000;

SELECT first_name, salary
FROM employees
WHERE salary <> 9000;

SELECT first_name, commission_pct
FROM employees
WHERE commission_pct IS NULL;

-- LIKE
SELECT first_name
FROM employees
WHERE first_name LIKE 'G_ra_d'; -- _는 한글자를 의미

SELECT first_name
FROM employees
WHERE first_name LIKE 'K%y'; -- %는 글자 수에 관계없이 모두

SELECT first_name
FROM employees
WHERE first_name LIKE 'A%';

SELECT first_name
FROM employees
WHERE first_name LIKE '%y';

SELECT first_name
FROM employees
WHERE first_name LIKE '%e%'; -- '%' || "투표" || '%'

-- 06년도에 입사한 사원을 검색
SELECT first_name, hire_date
FROM employees
WHERE hire_date > '05/12/31' AND hire_date < '07/01/01';

SELECT first_name, hire_date
FROM employees
WHERE hire_date LIKE '06%';

SELECT first_name, phone_number, salary
FROM employees
WHERE phone_number LIKE '590%' AND salary > 5000;

