-- 문제1) 사원들의 이름, 부서번호, 부서명을 출력하라
select e.first_name, e.department_id, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id;

-- 문제2) 30번 부서의 사원들의 이름,직업,부서명을 출력하라
select e.first_name, e.job_id, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE d.department_id = 30;

-- 문제3) 커미션을 받는 사원의 이름, 직업, 부서번호,부서명을 출력하라
select e.first_name, e.job_id, d.department_id, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE e.commission_pct IS NOT NULL;

-- 문제4) 지역번호 2500 에서 근무하는 사원의 이름, 직업,부서번호,부서명을 출력하라
select e.first_name, e.job_id, d.department_id, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE d.location_id = 2500;

-- 문제5) 이름에 A가 들어가는 사원들의 이름과 부서이름을 출력하라
select e.first_name, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE e.first_name LIKE '%A%';

-- 문제6) 사원이름과 그 사원의 관리자 이름을 출력하라
-- oracle
SELECT a.first_name, b.first_name
FROM employees a, employees b
WHERE a.manager_id = b.employee_id;

-- ansi
SELECT a.first_name, b.first_name
FROM employees a JOIN employees b
    ON a.manager_id = b.employee_id;


-- 문제7) 사원이름과 부서명과 월급을 출력하는데 월급이 3000 이상인 사원을 출력하라
select e.first_name, d.department_name, e.salary
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE e.salary >= 3000;

-- 문제8) TJ 이란 사원보다 늦게 입사한 사원의 이름과 입사일을 출력하라
-- oracle
SELECT b.first_name, b.hire_date
FROM employees a, employees b
WHERE a.first_name = 'TJ' and a.hire_date < b.hire_date;

-- ansi
SELECT b.first_name, b.hire_date
FROM employees a JOIN employees b
    ON a.first_name = 'TJ' and a.hire_date < b.hire_date;

-- 문제9) 급여가 3000에서 5000사이인 사원의 이름과 소속부서명 출력하라
select e.first_name, d.department_name
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE e.salary BETWEEN 3000 AND 5000;

-- 문제10) ACCOUNTING 부서 소속 사원의 이름과 입사일 출력하라
select e.first_name, e.hire_date
FROM employees e INNER JOIN departments d
    ON e.department_id = d.department_id
WHERE d.department_name = 'Accounting';

-- 문제11) 급여가 3000이하인 사원의 이름과 급여, 근무지를 출력하라.
select e.first_name, e.salary, l.city
FROM employees e INNER JOIN departments d 
    ON e.department_id = d.department_id
    INNER JOIN locations l
    ON d.location_id = l.location_id
WHERE e.salary <= 3000;