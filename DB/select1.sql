/*
TABLE DATA��
    INSERT
    DELETE
    SELECT - 90%
    UPDATE
    
    ����:
        SELECT (��, �÷���, �Լ�, SUB QUERY)
        FROM (���̺��, SUBQUERY)
*/
SELECT * FROM employees;

SELECT * FROM TAB; -- hr ������ �ִ� ��� ���̺��� �� �� �ִ� ��ɾ�

DESC EMPLOYEES; -- �𺧷Ӹ� ������ ��� ���� ���´�.

SELECT EMPLOYEE_ID, FIRST_NAME, SALARY
FROM EMPLOYEES;

SELECT LAST_NAME, SALARY, SALARY + 300
FROM EMPLOYEES;

SELECT LAST_NAME, SALARY * 12
FROM EMPLOYEES;

-- String str = "hello", str1 = "world" str = str + str
--                                            str || str1

SELECT FIRST_NAME || ' ' || SALARY
FROM EMPLOYEES;

-- ALIAS (����) AS ���� ����, ������� �Ұ�(ū����ǥ�� �ذ�)
SELECT employee_id AS "��� ��ȣ", SALARY AS ����, first_name �̸�
FROM EMPLOYEES;

-- DISTINCT : �ߺ����� ����
SELECT DISTINCT JOB_ID
FROM EMPLOYEES;

--