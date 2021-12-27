-- 정렬
-- 문제1) EMPLOYEES 테이블에서 입사일자 순으로 정렬하여 사원번호, 이름, 업무, 급여, 입사일자,부서번호를 출력하라.
SELECT employee_id, first_name, job_id, salary, hire_date, department_id
FROM employees
ORDER BY hire_date ASC;

-- 문제2) EMPLOYEES 테이블에서 가장 최근에 입사한 순으로 사원번호, 이름, 업무, 급여, 입사일자,부서번호를 출력하라.
SELECT employee_id, first_name, job_id, salary, hire_date, department_id
FROM employees
ORDER BY hire_date DESC;

-- 문제3) EMPLOYEES 테이블에서 부서번호로 정렬한 후 부서번호가 같을 경우 급여가 많은 순으로 정렬하여 
-- 사원번호, 성명, 업무, 부서번호, 급여를 출력하여라.
SELECT employee_id, last_name, first_name, job_id, department_id, salary
FROM employees
ORDER BY department_id, salary DESC;

-- 문제4) EMPLOYEES 테이블에서 첫번째 정렬은 부서번호로 두번째 정렬은 업무로 세번째 정렬은 급여가 많은 순으로 정렬하여 
-- 사원번호, 성명, 입사일자, 부서번호, 업무, 급여를 출력하여라.
SELECT employee_id, last_name, first_name, hire_date, department_id, job_id, salary
FROM employees
ORDER BY department_id, job_id, salary DESC;

-- 표준함수
-- 문제1) EMPLOYEES 테이블에서 King의 정보를 대문자로 검색하고 사원번호, 성명, 담당업무를 대문자로 그리고 부서번호를 출력하라.
SELECT UPPER(employee_id), UPPER(last_name), UPPER(first_name), UPPER(job_id), department_id
FROM employees
where UPPER(last_name) = UPPER('King');

-- 문제2) DEPARTMENTS 테이블에서 부서번호와 부서이름, 부서이름과 위치번호를 합하여 출력하도록 하라.
SELECT CONCAT(CONCAT(department_id, department_name), location_id)
FROM departments;

-- 문제3) EMPLOYEES 테이블에서 이름 중 ‘e’자의 위치를 출력하라.
SELECT first_name, INSTR(first_name, 'e') -- ,1 ,2) 시작위치, 시작개수
FROM employees;


-- 문제4) EMPLOYEES 테이블에서 부서번호가 80인 사람의 급여를 30으로 나눈 나머지를 구하여 출력하라.
SELECT MOD(salary,30)
FROM employees
WHERE department_id = 80;

-- 문제5) EMPLOYEES 테이블에서 현재까지 근무일 수가 몇주 몇일 인가를 출력하여라. 
-- 단 근무 일수가 많은 사람 순으로 출력하여라.
select trunc((SYSDATE - hire_date)/7.0) as weeks, ROUND(mod((sysdate-hire_date),7),0)-1 as days
from employees
ORDER BY SYSDATE-hire_date DESC;


-- 문제6) EMPLOYEES 테이블에서 부서 50에서 급여 앞에 $를 삽입하고 3자리마다 ,를 출력하라
SELECT '$'||REGEXP_REPLACE(REVERSE(REGEXP_REPLACE( REVERSE(TO_CHAR(salary)), '([0-9]{3})','\1,')), '^,','')
-- SELECT  TO_CHAR( salary , '999,999,999,999,999')
FROM employees
WHERE department_id = '50';

-- 그룹핑
-- 문제1) EMPLOYEES 테이블에서 모든 SALESMAN(SA_)에 대하여 급여의 평균, 최고액, 최저액, 합계를 구하여 출력하여라.
SELECT job_id, AVG(salary), MAX(salary), MIN(salary), SUM(salary)
FROM employees
GROUP BY job_id
HAVING job_id LIKE 'SA_%';


-- 문제2) EMPLOYEES 테이블에 등록되어 있는 인원수, 
-- 보너스가 NULL이 아닌 인원수, 보너스의 평균, 등록되어 있는 부서의 수를 구하여 출력하라.
SELECT COUNT(*), COUNT(commission_pct), round(AVG(commission_pct*salary)), count(department_id)
FROM employees;

-- HAVING commission_pct IS NOT NULL

-- 문제3) EMPLOYEES 테이블에서 부서별로 인원수, 평균 급여, 최저급여, 최고 급여, 급여의 합을 구하여 출력하라.
SELECT department_id, COUNT(*), round(AVG(salary)), MIN(salary), MAX(salary), SUM(salary)
FROM employees
GROUP BY department_id;

-- 문제4) EMPLOYEES 테이블에서 각 부서별로 인원수,급여의 평균, 최저 급여, 최고 급여, 급여의 합을 구하여 급여의 합이 많은 순으로 출력하여라.
SELECT department_id, COUNT(*), round(AVG(salary)), MIN(salary), MAX(salary), SUM(salary)
FROM employees
GROUP BY department_id
ORDER BY SUM(salary) DESC;

-- 문제5) EMPLOYEES 테이블에서 부서별, 업무별 그룹하여 결과를 부서번호, 업무, 
-- 인원수, 급여의 평균, 급여의 합을 구하여 출력하여라.
SELECT department_id, job_id, COUNT(*), trunc(AVG(salary)), SUM(salary)
FROM employees
GROUP BY department_id, job_id;


-- 문제6) EMPLOYEES 테이블에서 부서 인원이 4명보다 많은 부서의 부서번호, 인원수, 급여의 합을 구하여 출력하여라
SELECT department_id, count(department_id), sum(salary)
FROM employees
GROUP BY department_id
HAVING count(*) > 4;

-- 문제7) EMPLOYEES 테이블에서 급여가 최대 10000이상인 부서에 대해서 부서번호, 평균 급여, 급여의 합을 구하여 출력하여라.
SELECT department_id, round(avg(salary)), max(salary), sum(salary)
FROM employees
GROUP BY department_id
HAVING max(salary) >= 10000;

-- 문제8) EMPLOYEES 테이블에서 업무별 급여의 평균이 10000 이상인 업무에 대해서 업무명,평균 급여, 급여의 합을 구하여 출력하라.
SELECT job_id, avg(salary), sum(salary)
FROM employees
GROUP BY job_id
HAVING avg(salary) >= 10000;

-- 문제9) EMPLOYEES 테이블에서 전체 월급이 10000을 초과하는 각 업무에 대해서 업무와 월급여 합계를 출력하라. 
-- 단 판매원(SA)은 제외하고  월 급여 합계로 정렬(내림차순)하라.
SELECT job_id, sum(salary)
FROM employees
WHERE job_id NOT LIKE 'SA_%'
GROUP BY job_id
HAVING sum(salary) > 10000
ORDER BY SUM(salary) DESC;





