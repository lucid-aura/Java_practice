
-- employee_id = 105
SELECT * 
FROM employees
WHERE employee_id = 105;

/*
    Join
    �ΰ��̻��� ���̺��� �����ؼ� �����͸� �˻��ϴ� ����̴�.
    ���� �� �� �̻��� ��(row)���� ����� �� �⺻Ű, �ܷ�Ű�� ����ؼ� Join�Ѵ�.

    �⺻ Ű(Primary key) : ���̺��� �ߺ��� ���� �ʴ� Ű
    �ܷ� Ű(Foreign key) : �ٸ� ���̺��� PK, UK�� ��찡 ����.
    
    JOIN ����
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

-- left outer join + ������
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

-- self join : ������ ���̺��� join
SELECT a.employee_id, a.first_name,
    a.manager_id, b.employee_id,
    b.first_name
FROM employees a, employees b   -- a : ���  b : ���
WHERE a.manager_id = b.employee_id
    AND a.employee_id = 168;










