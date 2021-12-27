-- SUB QUERY
/*
    QUERY 안의 QUERY
    
    SELECT 단일 ROW 단일 COLUMN(산출되는 데이터는 한개, 컬럼도 한개)
    FROM 다중 ROW 다중 COLUMN
    WHERE 다중 ROW 다중 COLUMN
*/

-- SELECT
SELECT employee_id, first_name,
    (SELECT first_name
        FROM employees
        WHERE employee_id = 100)
FROM employees;

-- 단일 행이 아닐 경우(다중행) 안된다.
SELECT employee_id, first_name,
    (SELECT first_name
        FROM employees
        WHERE salary > 10000)
FROM employees;

-- 단일 컬럼이 아닐 경우(다중열) 안된다.
SELECT employee_id, first_name,
    (SELECT first_name, salary
        FROM employees
        WHERE employee_id = 100)
FROM employees;

SELECT employee_id, first_name, (SELECT COUNT(*) FROM employees)
FROM employees;

-- FROM AND 없이 이런 식으로도 가능하다.
SELECT *
FROM ( SELECT employee_id, first_name, salary
        FROM employees
        WHERE department_id = 80)
WHERE salary > 10000;


-- 부서번호 50번, 급여가 6000 이상인 사원
SELECT employee_id, salary, department_id
FROM employees
WHERE salary >= 6000
    AND department_id = 50;

SELECT employee_id, salary, department_id
FROM (SELECT *
    FROM employees
    WHERE department_id = 50)
WHERE salary >= 6000;

-- 업무별 급여의 합계, 인원수, 사원명, 급여
SELECT e.employee_id, e.salary,  e.job_id, j.job_id, j."급여의 합계", j.인원수
FROM employees e, 
(SELECT job_id, SUM(salary) AS "급여의 합계", COUNT(*) AS 인원수 -- 이대로는 사원명 뽑을 수 없음
FROM employees
GROUP BY job_id) j
WHERE e.job_id = j.job_id;

(SELECT job_id, SUM(salary) AS "급여의 합계", COUNT(*) AS 인원수 -- 이대로는 사원명 뽑을 수 없음
FROM employees
GROUP BY job_id);

-- WHERE
-- 평균 급여보다 많이 받는 사원

SELECT first_name, salary
FROM employees
WHERE salary > (SELECT AVG(salary)FROM employees);

-- 부서별로 가장 급여를 많이 받는 사원과 같은 급여를 받는 사원을 산출하라
select department_id, salary, first_name
from employees
where (department_id, salary) IN(   SELECT department_id, MAX(SALARY)
                                    FROM employees
                                    GROUP BY department_id);

select e.first_name
FROM employees e,
(SELECT MAX(SALARY), department_id
FROM employees
GROUP BY department_id) s
WHERE e.department_id = s.department_id;




