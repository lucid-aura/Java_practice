-- employee_id = 105
SELECT * 
FROM employees
WHERE employee_id = 105;

/*
    Join
    두개 이상의 테이블을 연결해서 데이터를 검색하는 방법이다.
    보통 두 개 이상의 행(row)들의 공통된 값 기본키, 외래키를 사용해서 Join한다.
    
    기본 키(Primary Key)
    외래 키(Foreign Key)
    
    JOIN 종류        사용빈도
    inner join      *****
    full outer join *
    cross join
    outer join
        left        ***
        right       ***
    self join       *****
    
*/

-- inner join
-- ansi SQL
-- 한쪽에만 있는 컬럼명은 alias 생략 가능
SELECT employee_id, first_name, e.department_id, d.department_id, department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id;

-- oracle
SELECT e.employee_id, e.first_name, e.department_id, d.department_id, d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id;

SELECT e.employee_id, e.first_name, e.job_id, j.job_id, j.job_title
FROM employees e, jobs j
WHERE e.job_id = j.job_id;


-- cross join 상호조인
-- ansi
SELECT employee_id, first_name, e.department_id, d.department_id, department_name
FROM employees e CROSS JOIN departments d;

-- full outer join null 도 포함
-- ansi
SELECT employee_id, first_name, e.department_id, d.department_id, department_name
FROM employees e FULL OUTER JOIN departments d
    ON e.department_id = d.department_id;
    
-- oracle X(편법으로 가능, 쿼리 합치기)
-- left
SELECT e.employee_id, e.first_name, e.department_id, d.department_id, d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id(+)

UNION

-- right
SELECT e.employee_id, e.first_name, e.department_id, d.department_id, d.department_name
FROM employees e, departments d
WHERE e.department_id(+) = d.department_id;

-- outer join
-- left
-- ansi
SELECT employee_id, first_name, e.department_id, d.department_id, department_name
FROM employees e LEFT OUTER JOIN departments d
    ON e.department_id = d.department_id;
    
-- right
SELECT employee_id, first_name, e.department_id, d.department_id, department_name
FROM employees e RIGHT OUTER JOIN departments d
    ON e.department_id = d.department_id;
    
-- oracle
-- left
SELECT e.employee_id, e.first_name, e.department_id, d.department_id, d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id(+);

-- left outer join + 차집합
SELECT e.employee_id, e.first_name, e.department_id, d.department_id, d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id(+) AND e.department_id IS NULL;

-- right
SELECT e.employee_id, e.first_name, e.department_id, d.department_id, d.department_name
FROM employees e, departments d
WHERE e.department_id(+) = d.department_id;

-- right outer join + 차집합
SELECT e.employee_id, e.first_name, e.department_id, d.department_id, d.department_name
FROM employees e, departments d
WHERE e.department_id(+) = d.department_id AND e.employee_id IS NULL;

-- full outer join
SELECT e.employee_id, e.first_name, e.department_id, d.department_id, d.department_name
FROM employees e FULL OUTER JOIN departments d
    ON e.department_id = d.department_id
WHERE e.department_id IS NULL
    OR d.department_id IS NULL;
    
-- self join : 동일한 테이블을 join 
-- a : 사원, b : 상사
SELECT a.employee_id, a.first_name, a.manager_id, b.employee_id, b.first_name 
FROM employees a, employees b
WHERE a.manager_id = b.employee_id
    AND a.employee_id = 168;