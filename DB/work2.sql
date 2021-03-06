-- 문제1) EMPLOYEES 테이블에서 급여가 3000이상인 사원의 사원번호, 이름, 담당업무, 급여를 출력하라.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM employees
WHERE SALARY >= 3000;

-- 문제2) EMPLOYEES 테이블에서 담당 업무가 ST_MAN인 사원의 사원번호, 성명, 담당업무, 급여, 부서번호를 출력하라.
SELECT EMPLOYEE_ID, LAST_NAME, FIRST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
FROM employees
WHERE JOB_ID = 'ST_MAN';

-- 문제3) EMPLOYEES 테이블에서 입사일자가 2006년 1월 1일 이후에 입사한 사원의 정보를 
-- 사원번호, 성명, 담당업무, 급여, 입사일자, 부서번호를 출력하라.
SELECT EMPLOYEE_ID, LAST_NAME, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM employees
WHERE HIRE_DATE >= '06/01/01';

-- 문제4) EMPLOYEES 테이블에서 급여가 3000에서 5000사이의 사원의 성명, 담당업무, 급여, 부서번호를 출력하라.
SELECT LAST_NAME, FIRST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
FROM employees
WHERE (SALARY BETWEEN 3000 AND 5000);

-- 문제5) EMPLOYEES 테이블에서 사원번호가 145,152,203인 사원의 정보를 사원번호, 성명, 담당업무, 급여, 입사일자를 출력하라
SELECT EMPLOYEE_ID, LAST_NAME, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE
FROM employees
WHERE EMPLOYEE_ID = ANY(145,152,203);

-- 문제6) EMPLOYEES 테이블에서 입사일자가 05년도에 입사한 사원의 정보를 사원번호, 성명, 담당업무, 급여, 입사일자, 부서번호를 출력하라.
SELECT EMPLOYEE_ID, LAST_NAME, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM employees
WHERE HIRE_DATE LIKE '05%';

-- 문제7) EMPLOYEES 테이블에서 보너스가 없는 사원의 사원번호, 성명, 담당업무, 급여, 입사일자, 보너스, 부서번호를 출력하라.
SELECT EMPLOYEE_ID, LAST_NAME, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, NVL(COMMISSION_PCT, 0),DEPARTMENT_ID
FROM employees
WHERE COMMISSION_PCT IS NULL;

-- 문제8) EMPLOYEES 테이블에서 급여가 1100이상이고 JOB이 ST_MAN인 사원의 사원번호, 성명, 담당업무, 급여, 입사일자, 부서번호를 출력하라
SELECT EMPLOYEE_ID, LAST_NAME, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM employees
WHERE SALARY >= 1100 AND JOB_ID = 'ST_MAN';

-- 문제9) EMPLOYEES 테이블에서 급여가 10000이상이거나 JOB이 ST_MAN인 사원의 사원번호, 성명, 담당업무, 급여, 입사일자, 부서번호를 출력하라
SELECT EMPLOYEE_ID, LAST_NAME, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM employees
WHERE SALARY >= 10000 OR JOB_ID = 'ST_MAN';

-- 문제10) EMPLOYEES 테이블에서 JOB이 ST_MAN, SA_MAN, SA_REP가 아닌 사원의 사원번호, 성명, 담당업무, 급여, 부서번호를 출력하라
SELECT EMPLOYEE_ID, LAST_NAME, FIRST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
FROM employees
WHERE JOB_ID NOT IN ('ST_MAN', 'SA_MAN', 'SA_REP');

-- 문제11) 업무가 PRES이고 급여가 12000이상이거나 업무가 SA_MAN인 사원의 사원번호, 이름, 업무, 급여를 출력하라.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM employees
WHERE (SALARY >= 12000 AND JOB_ID LIKE '%PRES') OR JOB_ID = 'SA_MAN';

-- 문제12) 업무가 AD_PRES 또는 SA_MAN이고 급여가 12000이상인 사원의 사원번호, 이름, 업무, 급여를 출력하라.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM employees
WHERE SALARY >= 12000 AND JOB_ID IN ('AD_PRES', 'SA_MAN');



