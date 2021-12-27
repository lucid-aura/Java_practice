-- ����1) EMPLOYEES ���̺��� �μ����� �ο���,��� �޿�,�޿��� ��,�ּ� �޿�,�ִ� �޿��� �����ϴ� 
-- EMP_DEPTNO ���̺��� �����϶�.
CREATE TABLE EMP_DEPTNO
AS
SELECT count(*) as count, avg(salary) as ���, sum(salary) as ��, min(salary) as �ּ�, max(salary) as �ִ�
FROM employees
GROUP BY department_id;


-- ����2) EMP_DEPTNO ���̺� ETC COLUMN�� �߰��϶�. �� �ڷ����� VARCHAR2(50) ����϶�.
ALTER TABLE EMP_DEPTNO
ADD
ETC VARCHAR2(20);

-- ����3) EMP_DEPTNO ���̺� ETC COLUMN�� �����϶�. �ڷ� ���� VARCHAR2(15)�� �϶�.
ALTER TABLE EMP_DEPTNO
MODIFY 
ETC VARCHAR2(15);

-- ����4) EMP_DEPTNO ���̺� �ִ� ETC �� �����ϰ� Ȯ���϶�.
ALTER TABLE EMP_DEPTNO
DROP 
COLUMN ETC;

SELECT * FROM EMP_DEPTNO;

-- ����5) ������ ������ EMP_DEPTNO ���̺��� �̸��� EMP_DEPT�� �����϶�.
ALTER TABLE EMP_DEPTNO
RENAME TO EMP_DEPT;

-- ����6) EMP_DEPT ���̺��� �����϶�.
DROP TABLE EMP_DEPT;
