/*
    SELECT
    FROM
    
    DUAL -> �������̺�, �ӽ����̺�
*/

SELECT 1, 'A' FROM DUAL;
SELECT 'A' FROM DUAL;
SELECT TO_DATE('20211222', 'YYYYMMDD') FROM DUAL;

/*
    SELECT
    FROM
    WHERE -> ������ if
    
    �񱳿�����( > < <= >= != = <> )
    NULL, IS NULL, IS NOT NULL
    && -> AND, || -> OR, ( )
*/

SELECT first_name, last_name, SALARY
FROM employees
WHERE first_name = 'Julia';

-- �޿��� 9000 �̻��� ���
SELECT first_name, salary
FROM employees
WHERE salary >= 9000;

-- �̸��� shanta���� ū �̸�
SELECT first_name
FROM employees
WHERE first_name > 'Shanta';

-- �̸��� ù ���縵�� J���� ū �̸�
SELECT first_name
FROM employees
WHERE first_name > 'J';

-- �Ŵ���(���)�� ���� ���
SELECT first_name
FROM employees
WHERE manager_id is NULL;

-- ���ʽ��� �ִ� ���
SELECT first_name, commission_pct
FROM employees
WHERE commission_pct IS NOT NULL;

-- AND
SELECT first_name, last_name
FROM employees
WHERE first_name = 'Shanta'
    AND last_name = 'Vollman';
    
-- �̸� John�̰� ������ 5000 �̻�
SELECT first_name, salary
FROM employees
WHERE first_name = 'John'
    AND salary >= 5000;
    
-- 2007�� 12�� 31�� ���Ŀ� �Ի��� ����� ���
SELECT first_name, hire_date
FROM employees
WHERE hire_date > TO_DATE('20071231' , 'YYYYMMDD'); -- ����
--WHERE hire_date > '07/12/31'; -- �Ǳ� ��

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

-- BETWEEN ���� ������ ( AND�� ���Ƿ� ���η� �����ִ� ���� ���� )
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
WHERE first_name LIKE 'G_ra_d'; -- _�� �ѱ��ڸ� �ǹ�

SELECT first_name
FROM employees
WHERE first_name LIKE 'K%y'; -- %�� ���� ���� ������� ���

SELECT first_name
FROM employees
WHERE first_name LIKE 'A%';

SELECT first_name
FROM employees
WHERE first_name LIKE '%y';

SELECT first_name
FROM employees
WHERE first_name LIKE '%e%'; -- '%' || "��ǥ" || '%'

-- 06�⵵�� �Ի��� ����� �˻�
SELECT first_name, hire_date
FROM employees
WHERE hire_date > '05/12/31' AND hire_date < '07/01/01';

SELECT first_name, hire_date
FROM employees
WHERE hire_date LIKE '06%';

SELECT first_name, phone_number, salary
FROM employees
WHERE phone_number LIKE '590%' AND salary > 5000;

