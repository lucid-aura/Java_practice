-- ����
-- ����1) EMPLOYEES ���̺��� �Ի����� ������ �����Ͽ� �����ȣ, �̸�, ����, �޿�, �Ի�����,�μ���ȣ�� ����϶�.
SELECT employee_id, first_name, job_id, salary, hire_date, department_id
FROM employees
ORDER BY hire_date ASC;

-- ����2) EMPLOYEES ���̺��� ���� �ֱٿ� �Ի��� ������ �����ȣ, �̸�, ����, �޿�, �Ի�����,�μ���ȣ�� ����϶�.
SELECT employee_id, first_name, job_id, salary, hire_date, department_id
FROM employees
ORDER BY hire_date DESC;

-- ����3) EMPLOYEES ���̺��� �μ���ȣ�� ������ �� �μ���ȣ�� ���� ��� �޿��� ���� ������ �����Ͽ� 
-- �����ȣ, ����, ����, �μ���ȣ, �޿��� ����Ͽ���.
SELECT employee_id, last_name, first_name, job_id, department_id, salary
FROM employees
ORDER BY department_id, salary DESC;

-- ����4) EMPLOYEES ���̺��� ù��° ������ �μ���ȣ�� �ι�° ������ ������ ����° ������ �޿��� ���� ������ �����Ͽ� 
-- �����ȣ, ����, �Ի�����, �μ���ȣ, ����, �޿��� ����Ͽ���.
SELECT employee_id, last_name, first_name, hire_date, department_id, job_id, salary
FROM employees
ORDER BY department_id, job_id, salary DESC;

-- ǥ���Լ�
-- ����1) EMPLOYEES ���̺��� King�� ������ �빮�ڷ� �˻��ϰ� �����ȣ, ����, �������� �빮�ڷ� �׸��� �μ���ȣ�� ����϶�.
SELECT UPPER(employee_id), UPPER(last_name), UPPER(first_name), UPPER(job_id), department_id
FROM employees
where UPPER(last_name) = UPPER('King');

-- ����2) DEPARTMENTS ���̺��� �μ���ȣ�� �μ��̸�, �μ��̸��� ��ġ��ȣ�� ���Ͽ� ����ϵ��� �϶�.
SELECT CONCAT(CONCAT(department_id, department_name), location_id)
FROM departments;

-- ����3) EMPLOYEES ���̺��� �̸� �� ��e������ ��ġ�� ����϶�.
SELECT first_name, INSTR(first_name, 'e') -- ,1 ,2) ������ġ, ���۰���
FROM employees;


-- ����4) EMPLOYEES ���̺��� �μ���ȣ�� 80�� ����� �޿��� 30���� ���� �������� ���Ͽ� ����϶�.
SELECT MOD(salary,30)
FROM employees
WHERE department_id = 80;

-- ����5) EMPLOYEES ���̺��� ������� �ٹ��� ���� ���� ���� �ΰ��� ����Ͽ���. 
-- �� �ٹ� �ϼ��� ���� ��� ������ ����Ͽ���.
select trunc((SYSDATE - hire_date)/7.0) as weeks, ROUND(mod((sysdate-hire_date),7),0)-1 as days
from employees
ORDER BY SYSDATE-hire_date DESC;


-- ����6) EMPLOYEES ���̺��� �μ� 50���� �޿� �տ� $�� �����ϰ� 3�ڸ����� ,�� ����϶�
SELECT '$'||REGEXP_REPLACE(REVERSE(REGEXP_REPLACE( REVERSE(TO_CHAR(salary)), '([0-9]{3})','\1,')), '^,','')
-- SELECT  TO_CHAR( salary , '999,999,999,999,999')
FROM employees
WHERE department_id = '50';

-- �׷���
-- ����1) EMPLOYEES ���̺��� ��� SALESMAN(SA_)�� ���Ͽ� �޿��� ���, �ְ��, ������, �հ踦 ���Ͽ� ����Ͽ���.
SELECT job_id, AVG(salary), MAX(salary), MIN(salary), SUM(salary)
FROM employees
GROUP BY job_id
HAVING job_id LIKE 'SA_%';


-- ����2) EMPLOYEES ���̺� ��ϵǾ� �ִ� �ο���, 
-- ���ʽ��� NULL�� �ƴ� �ο���, ���ʽ��� ���, ��ϵǾ� �ִ� �μ��� ���� ���Ͽ� ����϶�.
SELECT COUNT(*), COUNT(commission_pct), round(AVG(commission_pct*salary)), count(department_id)
FROM employees;

-- HAVING commission_pct IS NOT NULL

-- ����3) EMPLOYEES ���̺��� �μ����� �ο���, ��� �޿�, �����޿�, �ְ� �޿�, �޿��� ���� ���Ͽ� ����϶�.
SELECT department_id, COUNT(*), round(AVG(salary)), MIN(salary), MAX(salary), SUM(salary)
FROM employees
GROUP BY department_id;

-- ����4) EMPLOYEES ���̺��� �� �μ����� �ο���,�޿��� ���, ���� �޿�, �ְ� �޿�, �޿��� ���� ���Ͽ� �޿��� ���� ���� ������ ����Ͽ���.
SELECT department_id, COUNT(*), round(AVG(salary)), MIN(salary), MAX(salary), SUM(salary)
FROM employees
GROUP BY department_id
ORDER BY SUM(salary) DESC;

-- ����5) EMPLOYEES ���̺��� �μ���, ������ �׷��Ͽ� ����� �μ���ȣ, ����, 
-- �ο���, �޿��� ���, �޿��� ���� ���Ͽ� ����Ͽ���.
SELECT department_id, job_id, COUNT(*), trunc(AVG(salary)), SUM(salary)
FROM employees
GROUP BY department_id, job_id;


-- ����6) EMPLOYEES ���̺��� �μ� �ο��� 4���� ���� �μ��� �μ���ȣ, �ο���, �޿��� ���� ���Ͽ� ����Ͽ���
SELECT department_id, count(department_id), sum(salary)
FROM employees
GROUP BY department_id
HAVING count(*) > 4;

-- ����7) EMPLOYEES ���̺��� �޿��� �ִ� 10000�̻��� �μ��� ���ؼ� �μ���ȣ, ��� �޿�, �޿��� ���� ���Ͽ� ����Ͽ���.
SELECT department_id, round(avg(salary)), max(salary), sum(salary)
FROM employees
GROUP BY department_id
HAVING max(salary) >= 10000;

-- ����8) EMPLOYEES ���̺��� ������ �޿��� ����� 10000 �̻��� ������ ���ؼ� ������,��� �޿�, �޿��� ���� ���Ͽ� ����϶�.
SELECT job_id, avg(salary), sum(salary)
FROM employees
GROUP BY job_id
HAVING avg(salary) >= 10000;

-- ����9) EMPLOYEES ���̺��� ��ü ������ 10000�� �ʰ��ϴ� �� ������ ���ؼ� ������ ���޿� �հ踦 ����϶�. 
-- �� �Ǹſ�(SA)�� �����ϰ�  �� �޿� �հ�� ����(��������)�϶�.
SELECT job_id, sum(salary)
FROM employees
WHERE job_id NOT LIKE 'SA_%'
GROUP BY job_id
HAVING sum(salary) > 10000
ORDER BY SUM(salary) DESC;





