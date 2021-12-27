-- ����1) EMPLOYEES Table�� ��� �ڷḦ ����Ͽ���.
SELECT * FROM EMPLOYEES;

-- ����2) EMPLOYEES Table�� �÷����� ��� ����϶�.
DESC EMPLOYEES;

-- ����3) EMPLOYEES Table���� ��� ��ȣ, �̸�, �޿�, �������� ����Ͽ���.
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, JOB_ID FROM EMPLOYEES;

-- ����4) ��� �������� �޿��� $300���� ��Ű�� ���ؼ� ���� �����ڸ� ����ϰ� ����� SALARY+300�� ���÷��� �մϴ�.
SELECT SALARY + 300 FROM EMPLOYEES;

-- ����5) EMP ���̺��� �����ȣ, �̸�, �޿�, ���ʽ�, ���ʽ� �ݾ��� ����Ͽ���. 
-- (����� ���ʽ��� ���� + (����*Ŀ�̼�))
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, NVL(SALARY * COMMISSION_PCT, 0) AS ���ʽ�, SALARY + NVL(COMMISSION_PCT, 0)
FROM EMPLOYEES;

-- ����6) EMPLOYEES ���̺��� LAST_NAME�� �̸����� SALARY�� �޿��� ����Ͽ���.
SELECT LAST_NAME AS �̸�, SALARY AS "�� ��" FROM EMPLOYEES;

-- ����7) EMPLOYEES ���̺��� LAST_NAME�� Name���� SALARY * 12�� Annual Salary(����)�� ����Ͽ���
SELECT LAST_NAME AS Name, SALARY*12 AS "Annual Salary(����)" FROM EMPLOYEES;

-- ����8) EMPLOYEES ���̺��� �̸��� ������ �����Ͽ� ����Ͽ���. 
SELECT FIRST_NAME || ' ' || LAST_NAME || ' ' || JOB_ID FROM EMPLOYEES;

-- ����9) EMPLOYEES ���̺��� �̸��� ������ ��KING is a PRESIDENT�� �������� ����Ͽ���. 
SELECT LAST_NAME || ' is a ' || JOB_ID FROM EMPLOYEES;

-- ����10) EMPLOYEES ���̺��� �̸��� ������ ��KING: 1 Year salary = 60000�� �������� ����Ͽ���. 
SELECT LAST_NAME || ':  1 Year salary =' || SALARY*12 as "�̸�������" FROM EMPLOYEES;


-- ����11) EMPLOYEES ���̺��� JOB�� ��� ����϶�(�ߺ�����).
SELECT DISTINCT JOB_ID FROM EMPLOYEES;

SELECT DISTINCT department_id FROM employees;