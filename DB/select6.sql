-- Ư�� query
-- CASE == switch
SELECT employee_id, first_name, phone_number,
    CASE SUBSTR(phone_number, 1, 3)
        WHEN '515' THEN '����'
        WHEN '590' THEN '�λ�'
        WHEN '650' THEN '����'
        ELSE '��Ÿ'
    END
FROM employees;

-- String str = "hello"
-- String substr = str.substring(1, 4); ���� ��ġ, �� ��ġ

SELECT 'A' FROM dual;

-- SELECT SUBSTR('hello', 1, 2) -- ���� ��ġ(1����), ����
SELECT SUBSTR('hello', 3) -- ���� ��ġ(1����) ������
FROM dual;

SELECT employee_id, first_name, phone_number,
    CASE 
        WHEN SUBSTR(phone_number, 1, 3) = '515' THEN '����'
        WHEN SUBSTR(phone_number, 1, 3) = '590' THEN '�λ�'
        WHEN SUBSTR(phone_number, 1, 3) = '650' THEN '����'
        ELSE '��Ÿ'
    END AS ����
FROM employees;

-- DECODE
SELECT employee_id, first_name, phone_number,
    DECODE( SUBSTR(phone_number, 1, 3),
        '515', '����',
        '590', '�λ�',
        '650', '����'
    ) AS ����
FROM employees;

-- �м� �Լ�
/*
    ���� �Լ�
    RANK()
    DENSE_RANK()
    ROW_NUMBER()
    ROWNUM
*/
SELECT employee_id, first_name
FROM employees
WHERE employee_id >= 100 AND employee_id <= 109;

-- �޿� ��ŷ TOP10�� ���϶�
SELECT employee_id, first_name, salary
FROM employees
ORDER BY salary DESC;

-- WHERE�� ���� ������ SELECT ���� �� ����(������)
SELECT ROWNUM, employee_id, first_name
FROM employees
WHERE ROWNUM <= 10;

-- 1. �޿��� ���� -> ����
-- 2. ��ȣ ���� -> ROWNUM
-- 3. ���� ����

SELECT RNUM, employee_id, first_name, salary
FROM
    (SELECT ROWNUM AS RNUM, employee_id, first_name, salary -- 2. ��ȣ ����
    FROM
        (SELECT employee_id, first_name, salary -- 1. �޿��� ����
        FROM employees
        ORDER BY salary DESC)
    )
WHERE RNUM BETWEEN 10 AND 20; -- 3. ���� ����

