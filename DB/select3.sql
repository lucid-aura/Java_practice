/*
    ORDER BY -- Sorting
    
    SELECT COLUMN VALUE SUBQUERY
    FROM TABLE SUBQUERY
    WHERE IF
    ORDER BY COLUMN ASC     오름(생략)
                    DESC    내림
                    
    DESC 테이블명 -> 명세
*/

SELECT first_name, salary
FROM employees
ORDER BY salary DESC;

-- ALIAS
SELECT employee_id, first_name, salary*12 AS annsal
FROM employees
ORDER BY annsal;

-- NULL FIRST
SELECT commission_pct, salary
FROM employees
ORDER BY commission_pct NULLS FIRST, salary DESC;

-- 입사순으로 정렬, 급여 역순
SELECT hire_date, salary, job_id
FROM employees
ORDER BY hire_date ASC, salary DESC;

-- 업무명으로 정렬, 급여 역순
SELECT job_id, salary
FROM employees
ORDER BY job_id ASC, salary DESC;

/*
    DISTINCT : 중복 생략
*/
SELECT DISTINCT job_id
FROM employees;

/*
    GROUP BY : 그룹으로 묶는 기능
    HAVING : 그룹으로 묶은 후의 조건
    묶는 순간 개개인을 나타낼 수 없음
*/
SELECT department_id
FROM employees
GROUP BY department_id
ORDER BY department_id ASC;

SELECT job_id
FROM employees
GROUP BY job_id
ORDER BY job_id ASC;

/*
    통계
    COUNT - 그룹함수
    SUM
    AVG
    MAX
    MIN
*/

SELECT job_id, COUNT(*), SUM(salary), AVG(salary), MAX(salary), MIN(salary) -- count(*)
FROM employees
GROUP BY job_id;

SELECT job_id, COUNT(*), SUM(salary), AVG(salary) -- count(*)
FROM employees
GROUP BY job_id
HAVING SUM(salary) >= 100000;

-- 급여가 5000 이상 받는 사원만으로 합계를 내서 job으로 그룹화하여
-- 급여의 합계가 20000을 초과하는 업무명을 구하라

SELECT job_id, SUM(salary)
FROM employees
WHERE salary >= 5000        -- 묶기 전 조건(필터링)
GROUP BY job_id
HAVING SUM(salary) > 20000; -- 묶은 후 조건
