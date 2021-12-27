-- ����1) EMPLOYEES ���̺��� Kochhar�� �޿����� ���� ����� ������ �����ȣ,�̸�,������,�޿��� ����϶�.
select e.employee_id, e.first_name, e.job_id, e.salary
    from employees e,
        (select salary from employees where last_name = 'Kochhar') s
where s.salary < e.salary;

-- ����2) EMPLOYEES ���̺��� �޿��� ��պ��� ���� ����� ������ 
-- �����ȣ,�̸�,������,�޿�,�μ���ȣ�� ����Ͽ���.  
select e.employee_id, e.first_name, e.department_id, e.salary, e.job_id
from employees e, (select round(AVG(salary)) as avg from employees) a
where e.salary <= a.avg;


-- ����3) EMPLOYEES ���̺��� 100�� �μ��� �ּ� �޿����� �ּ� �޿��� ���� �ٸ� ��� �μ��� ����϶�
select t.department_id
from
(select min(salary) s1 from employees where department_id = 100) s,
(select min(salary) t1, department_id from employees group by department_id) t
where s.s1 < t.t1 and t.department_id != 100;

-- ����4) �������� �ּ� �޿��� �޴� ����� ������ �����ȣ,�̸�,����,�μ���ȣ�� ����Ͽ���. 
-- �� �������� �����Ͽ���.

select employee_id, first_name, job_id, department_id
from employees
where (department_id , salary) in (select department_id, min(salary) from employees group by department_id)
ORDER BY department_id;

-- ����5) EMPLOYEES �� DEPARTMENTS ���̺��� ������ SA_MAN ����� ������ �̸�,����,�μ���,�ٹ����� ����϶�.
-- FROM, WHERE�� �� �� �ۼ� 

-- �������� from������ ���
select a.first_name, a.job_id, b.department_name, c.city
from
    (SELECT first_name, job_id, department_id FROM employees) a,
    (SELECT department_id, department_name, location_id FROM departments) b,
    (SELECT location_id, city FROM locations) c
where a.job_id = 'SA_MAN' and a.department_id = b.department_id and b.location_id = c.location_id;

-- ���� ���� where������ ��� (������ �� �� ���� ������ ��)
select a.first_name, a.job_id, b.department_name,  c.city
from employees a, departments b, locations c
where
    (a.first_name, a.job_id, b.department_name, c.city) in
        (select i.first_name, i.job_id, j.department_name, k.city 
        from employees i, departments j, locations k 
        where i.department_id = j.department_id 
            and i.job_id = 'SA_MAN' 
            and j.location_id = k.location_id);
    
-- ���� ���� ���� ���
select e.first_name, e.job_id, d.department_name, l.city 
from employees e, departments d, locations l 
where e.job_id = 'SA_MAN' and e.department_id = d.department_id and d.location_id = l.location_id;

-- ����6) EMPLOYEES ���̺��� ���� ���� ����� ���� MANAGER�� �����ȣ�� ����϶�.
select e.employee_id
from employees e, (select count(*) as c, manager_id from employees  GROUP BY manager_id) s2
where s2.c = 
        (select max(c) from (select count(*) as c, manager_id from employees  GROUP BY manager_id) s)
        AND s2.manager_id = e.employee_id;

-- ����7) EMPLOYEES ���̺��� ���� ���� ����� ���� �ִ� �μ� ��ȣ�� �������  ����϶�.
select department_id, s.c as count
from (
select max(c) as m
    from (select department_id, count(*) as c from employees group by department_id)),
    (select department_id, count(*) as c from employees group by department_id) s
where s.c = m;

-- ����8) EMPLOYEES ���̺��� �����ȣ�� 123�� ����� ������ ���� 
--                           �����ȣ�� 192�� ����� �޿�(SAL)���� ���� ����� �����ȣ,�̸�,����,�޿��� ����϶�.
        
SELECT e.employee_id, e.first_name, e.job_id, e.salary 
from employees e
where (e.salary > (select salary from employees where employee_id = '192'))
    and (e.job_id = (select job_id ID from employees where employee_id = '123'));

-- ����9)����(JOB)���� �ּұ޿��� �޴� ����� ������ �����ȣ,�̸�,����,�μ����� ����϶�.
-- ����1 :�������� ������������
select distinct e.employee_id, e.first_name, e.job_id, d.department_name
from employees e, departments d
where (salary, job_id) in (SELECT min(salary), job_id FROM employees group by job_id)
and e.department_id = d.department_id
order by d.department_name desc;

-- ����10) EMPLOYEES ���̺��� (50�� �μ��� �ּ� �޿�)�� �޴� ������� ���� �޿��� �޴� 
-- ����� ������ �����ȣ,�̸�,����,�Ի�����,�޿�,�μ���ȣ�� ����϶�. 
-- �� 50���� ����
SELECT employee_id, first_name, job_id, hire_date, salary, department_id
FROM employees e,
(select salary as s, department_id as d
    from employees
    where (salary, department_id) in
        (select min(salary), department_id 
        from employees 
        group by department_id 
        having department_id = 50))
where e.salary > s and e.department_id != d;

-- ����11) EMPLOYEES ���̺��� 50�� �μ��� �ְ� �޿��� �޴� ��� ���� ���� �޿��� �޴� ����� ������ �����ȣ,�̸�,����,�Ի�����,�޿�,�μ���ȣ�� ����϶�. 
-- ��50���� ����
-- �����ȣ,�̸�,����,�Ի�����,�޿�,�μ���ȣ

SELECT employee_id, first_name, job_id, hire_date, salary, department_id
FROM employees e,
(select salary as s, department_id as d
    from employees
    where (salary, department_id) in
        (select max(salary), department_id 
        from employees 
        group by department_id 
        having department_id = 50))
where e.salary > s and e.department_id != d;
