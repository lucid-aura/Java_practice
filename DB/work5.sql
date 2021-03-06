-- 문제1) EMPLOYEES 테이블에서 Kochhar의 급여보다 많은 사원의 정보를 사원번호,이름,담당업무,급여를 출력하라.
select e.employee_id, e.first_name, e.job_id, e.salary
    from employees e,
        (select salary from employees where last_name = 'Kochhar') s
where s.salary < e.salary;

-- 문제2) EMPLOYEES 테이블에서 급여의 평균보다 적은 사원의 정보를 
-- 사원번호,이름,담당업무,급여,부서번호를 출력하여라.  
select e.employee_id, e.first_name, e.department_id, e.salary, e.job_id
from employees e, (select round(AVG(salary)) as avg from employees) a
where e.salary <= a.avg;


-- 문제3) EMPLOYEES 테이블에서 100번 부서의 최소 급여보다 최소 급여가 많은 다른 모든 부서를 출력하라
select t.department_id
from
(select min(salary) s1 from employees where department_id = 100) s,
(select min(salary) t1, department_id from employees group by department_id) t
where s.s1 < t.t1 and t.department_id != 100;

-- 문제4) 업무별로 최소 급여를 받는 사원의 정보를 사원번호,이름,업무,부서번호를 출력하여라. 
-- 단 업무별로 정렬하여라.

select employee_id, first_name, job_id, department_id
from employees
where (department_id , salary) in (select department_id, min(salary) from employees group by department_id)
ORDER BY department_id;

-- 문제5) EMPLOYEES 과 DEPARTMENTS 테이블에서 업무가 SA_MAN 사원의 정보를 이름,업무,부서명,근무지를 출력하라.
-- FROM, WHERE절 둘 다 작성 

-- 내부쿼리 from절에서 사용
select a.first_name, a.job_id, b.department_name, c.city
from
    (SELECT first_name, job_id, department_id FROM employees) a,
    (SELECT department_id, department_name, location_id FROM departments) b,
    (SELECT location_id, city FROM locations) c
where a.job_id = 'SA_MAN' and a.department_id = b.department_id and b.location_id = c.location_id;

-- 내부 쿼리 where절에서 사용 (억지로 쓴 것 같은 느낌인 답)
select a.first_name, a.job_id, b.department_name,  c.city
from employees a, departments b, locations c
where
    (a.first_name, a.job_id, b.department_name, c.city) in
        (select i.first_name, i.job_id, j.department_name, k.city 
        from employees i, departments j, locations k 
        where i.department_id = j.department_id 
            and i.job_id = 'SA_MAN' 
            and j.location_id = k.location_id);
    
-- 내부 쿼리 없이 사용
select e.first_name, e.job_id, d.department_name, l.city 
from employees e, departments d, locations l 
where e.job_id = 'SA_MAN' and e.department_id = d.department_id and d.location_id = l.location_id;

-- 문제6) EMPLOYEES 테이블에서 가장 많은 사원을 갖는 MANAGER의 사원번호를 출력하라.
select e.employee_id
from employees e, (select count(*) as c, manager_id from employees  GROUP BY manager_id) s2
where s2.c = 
        (select max(c) from (select count(*) as c, manager_id from employees  GROUP BY manager_id) s)
        AND s2.manager_id = e.employee_id;

-- 문제7) EMPLOYEES 테이블에서 가장 많은 사원이 속해 있는 부서 번호와 사원수를  출력하라.
select department_id, s.c as count
from (
select max(c) as m
    from (select department_id, count(*) as c from employees group by department_id)),
    (select department_id, count(*) as c from employees group by department_id) s
where s.c = m;

-- 문제8) EMPLOYEES 테이블에서 사원번호가 123인 사원의 직업과 같고 
--                           사원번호가 192인 사원의 급여(SAL)보다 많은 사원의 사원번호,이름,직업,급여를 출력하라.
        
SELECT e.employee_id, e.first_name, e.job_id, e.salary 
from employees e
where (e.salary > (select salary from employees where employee_id = '192'))
    and (e.job_id = (select job_id ID from employees where employee_id = '123'));

-- 문제9)직업(JOB)별로 최소급여를 받는 사원의 정보를 사원번호,이름,업무,부서명을 출력하라.
-- 조건1 :직업별로 내림차순정렬
select distinct e.employee_id, e.first_name, e.job_id, d.department_name
from employees e, departments d
where (salary, job_id) in (SELECT min(salary), job_id FROM employees group by job_id)
and e.department_id = d.department_id
order by d.department_name desc;

-- 문제10) EMPLOYEES 테이블에서 (50번 부서의 최소 급여)를 받는 사원보다 많은 급여를 받는 
-- 사원의 정보를 사원번호,이름,업무,입사일자,급여,부서번호를 출력하라. 
-- 단 50번은 제외
SELECT employee_id, first_name, job_id, hire_date, salary, department_id
FROM employees e,
(select salary as s, department_id as d
    from employees
    where (salary, department_id) in
        (select min(salary), department_id 
        from employees 
        group by department_id 
        having department_id = 50))
where e.salary > s and e.department_id != d;

-- 문제11) EMPLOYEES 테이블에서 50번 부서의 최고 급여를 받는 사원 보다 많은 급여를 받는 사원의 정보를 사원번호,이름,업무,입사일자,급여,부서번호를 출력하라. 
-- 단50번은 제외
-- 사원번호,이름,업무,입사일자,급여,부서번호

SELECT employee_id, first_name, job_id, hire_date, salary, department_id
FROM employees e,
(select salary as s, department_id as d
    from employees
    where (salary, department_id) in
        (select max(salary), department_id 
        from employees 
        group by department_id 
        having department_id = 50))
where e.salary > s and e.department_id != d;
