
-- employee_id = 105
SELECT * 
FROM employees
WHERE employee_id = 105;

/*
    Join
    두개이상의 테이블을 연결해서 데이터를 검색하는 방법이다.
    보통 두 개 이상의 행(row)들의 공통된 값 기본키, 외래키를 사용해서 Join한다.

    기본 키(Primary key) : 테이블에서 중복이 되지 않는 키
    외래 키(Foreign key) : 다른 테이블에서 PK, UK인 경우가 많다.
    
    JOIN 종류
    inner join          *****
    full outer join     *
    cross join          
    outer join
        left            ***
        right           ***
    self join           *****
*/

-- inner Join
-- ansi SQL
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id;

-- oracle
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id;

SELECT e.employee_id, e.first_name,
    e.job_id, j.job_id,
    j.job_title
FROM employees e, jobs j
WHERE e.job_id = j.job_id;
    

-- cross join
-- ansi
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name 
FROM employees e CROSS JOIN departments d;

-- oracle
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name
FROM employees e, departments d;

-- full outer join
-- ansi
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name     
FROM employees e FULL OUTER JOIN departments d
    ON e.department_id = d.department_id;

-- oracle 
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id(+)
UNION
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name
FROM employees e, departments d
WHERE e.department_id(+) = d.department_id;



-- outer
-- left
-- ansi
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name 
FROM employees e LEFT OUTER JOIN departments d
    ON e.department_id = d.department_id;
    
-- oracle
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id(+);

-- left outer join + 차집합
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name
FROM employees e
WHERE e.department_id = d.department_id(+)
    AND e.department_id IS NULL;


-- right
-- ansi
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name 
FROM employees e RIGHT OUTER JOIN departments d
    ON e.department_id = d.department_id;

-- oracle
SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name
FROM employees e, departments d
WHERE e.department_id(+) = d.department_id;


SELECT e.employee_id, e.first_name,
    e.department_id, d.department_id,
    d.department_name     
FROM employees e FULL OUTER JOIN departments d
    ON e.department_id = d.department_id
WHERE e.department_id IS NULL
    OR d.department_id IS NULL;

-- self join : 동일한 테이블을 join
SELECT a.employee_id, a.first_name,
    a.manager_id, b.employee_id,
    b.first_name
FROM employees a, employees b   -- a : 사원  b : 상사
WHERE a.manager_id = b.employee_id
    AND a.employee_id = 168;










