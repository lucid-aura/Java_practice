/*
    ORDER BY -- Sorting
    
    SELECT COLUMN VALUE SUBQUERY
    FROM TABLE SUBQUERY
    WHERE IF
    ORDER BY COLUMN ASC     ����(����)
                    DESC    ����
                    
    DESC ���̺�� -> ��
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

-- �Ի������ ����, �޿� ����
SELECT hire_date, salary, job_id
FROM employees
ORDER BY hire_date ASC, salary DESC;

-- ���������� ����, �޿� ����
SELECT job_id, salary
FROM employees
ORDER BY job_id ASC, salary DESC;

/*
    DISTINCT : �ߺ� ����
*/
SELECT DISTINCT job_id
FROM employees;

/*
    GROUP BY : �׷����� ���� ���
    HAVING : �׷����� ���� ���� ����
    ���� ���� �������� ��Ÿ�� �� ����
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
    ���
    COUNT - �׷��Լ�
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

-- �޿��� 5000 �̻� �޴� ��������� �հ踦 ���� job���� �׷�ȭ�Ͽ�
-- �޿��� �հ谡 20000�� �ʰ��ϴ� �������� ���϶�

SELECT job_id, SUM(salary)
FROM employees
WHERE salary >= 5000        -- ���� �� ����(���͸�)
GROUP BY job_id
HAVING SUM(salary) > 20000; -- ���� �� ����
