-- ����1) ������� �̸�, �μ���ȣ, �μ����� ����϶�
select e.first_name, e.department_id, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id;

-- ����2) 30�� �μ��� ������� �̸�,����,�μ����� ����϶�
select e.first_name, e.job_id, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE d.department_id = 30;

-- ����3) Ŀ�̼��� �޴� ����� �̸�, ����, �μ���ȣ,�μ����� ����϶�
select e.first_name, e.job_id, d.department_id, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE e.commission_pct IS NOT NULL;

-- ����4) ������ȣ 2500 ���� �ٹ��ϴ� ����� �̸�, ����,�μ���ȣ,�μ����� ����϶�
select e.first_name, e.job_id, d.department_id, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE d.location_id = 2500;

-- ����5) �̸��� A�� ���� ������� �̸��� �μ��̸��� ����϶�
select e.first_name, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE e.first_name LIKE '%A%';

-- ����6) ����̸��� �� ����� ������ �̸��� ����϶�
-- oracle
SELECT a.first_name, b.first_name
FROM employees a, employees b
WHERE a.manager_id = b.employee_id;

-- ansi
SELECT a.first_name, b.first_name
FROM employees a JOIN employees b
    ON a.manager_id = b.employee_id;


-- ����7) ����̸��� �μ���� ������ ����ϴµ� ������ 3000 �̻��� ����� ����϶�
select e.first_name, d.department_name, e.salary
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE e.salary >= 3000;

-- ����8) TJ �̶� ������� �ʰ� �Ի��� ����� �̸��� �Ի����� ����϶�
-- oracle
SELECT b.first_name, b.hire_date
FROM employees a, employees b
WHERE a.first_name = 'TJ' and a.hire_date < b.hire_date;

-- ansi
SELECT b.first_name, b.hire_date
FROM employees a JOIN employees b
    ON a.first_name = 'TJ' and a.hire_date < b.hire_date;

-- ����9) �޿��� 3000���� 5000������ ����� �̸��� �ҼӺμ��� ����϶�
select e.first_name, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE e.salary BETWEEN 3000 AND 5000;

-- ����10) ACCOUNTING �μ� �Ҽ� ����� �̸��� �Ի��� ����϶�
select e.first_name, e.hire_date
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE d.department_name = 'Accounting';

-- ����11) �޿��� 3000������ ����� �̸��� �޿�, �ٹ����� ����϶�.
select e.first_name, e.salary, l.city
FROM employees e INNER JOIN departments d 
    ON e.department_id = d.department_id
    INNER JOIN locations l
    ON d.location_id = l.location_id
WHERE e.salary <= 3000;