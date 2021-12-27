-- 문제1) EMPLOYEES 테이블에서 부서별로 인원수,평균 급여,급여의 합,최소 급여,최대 급여를 포함하는 
-- EMP_DEPTNO 테이블을 생성하라.
CREATE TABLE EMP_DEPTNO
AS
SELECT count(*) as count, avg(salary) as 평균, sum(salary) as 합, min(salary) as 최소, max(salary) as 최대
FROM employees
GROUP BY department_id;


-- 문제2) EMP_DEPTNO 테이블에 ETC COLUMN을 추가하라. 단 자료형은 VARCHAR2(50) 사용하라.
ALTER TABLE EMP_DEPTNO
ADD
ETC VARCHAR2(20);

-- 문제3) EMP_DEPTNO 테이블에 ETC COLUMN을 수정하라. 자료 형은 VARCHAR2(15)로 하라.
ALTER TABLE EMP_DEPTNO
MODIFY 
ETC VARCHAR2(15);

-- 문제4) EMP_DEPTNO 테이블에 있는 ETC 을 삭제하고 확인하라.
ALTER TABLE EMP_DEPTNO
DROP 
COLUMN ETC;

SELECT * FROM EMP_DEPTNO;

-- 문제5) 이전에 생성한 EMP_DEPTNO 테이블의 이름을 EMP_DEPT로 변경하라.
ALTER TABLE EMP_DEPTNO
RENAME TO EMP_DEPT;

-- 문제6) EMP_DEPT 테이블을 삭제하라.
DROP TABLE EMP_DEPT;
