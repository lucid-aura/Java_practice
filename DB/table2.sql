
CREATE TABLE DEFT(DEPTNO, DNAME, MGR, LOC)
AS
SELECT department_id, department_name, manager_id, location_id
FROM departments
WHERE 1=2;

-- insert
INSERT INTO DEFT(DEPTNO, DNAME, MGR, LOC)
VALUES(10, '��ȹ��', 100, 123);

INSERT INTO DEFT(DEPTNO, DNAME)
VALUES(20, '������');

INSERT INTO DEFT
VALUES(30, 'IT��', 333, 234);

INSERT INTO DEFT(DEPTNO, MGR, DNAME, LOC)
VALUES(40, '�渮��', 200, 345);

INSERT INTO DEFT -- not enough values
VALUES(20, 'IT��', 333);

INSERT INTO DEFT(DEPTNO, DNAME, MGR, LOC)
VALUES(40, '������', '400', '678');

INSERT INTO DEFT(DEPTNO, DNAME, MGR, LOC)
VALUES(40, ������, 400, 678);


-- delete

DELETE
FROM DEFT
WHERE dname = '100';

DELETE
FROM deft
WHERE mgr IS NULL;


-- update
UPDATE deft
SET mgr = 300
WHERE deptno = 30;

UPDATE deft
SET deptno = 50, mgr = 500
WHERE dname = '������';
