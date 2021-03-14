Select t.segmento, t.cant from (
select 'SEGMENTO A' as segmento,count(1) as cant from employees where salary < 3500
union
select 'SEGMENTO B'as segmento,count(1) as can from employees where salary >= 3500 and salary < 8000
union
select 'SEGMENTO C'as segmento,count(1) as can from employees where salary >= 8000) t;


Select t.segmento, t.cant, t.dep_id from (
select 'SEGMENTO A' as segmento,count(1) as cant, e.DEPARTMENT_ID as dep_id 
from employees e join departments d on e.DEPARTMENT_ID = d.DEPARTMENT_ID where salary < 3500 group by dep_id
union
select 'SEGMENTO B' as segmento,count(1) as cant, e.DEPARTMENT_ID as dep_id 
from employees e join departments d on e.DEPARTMENT_ID = d.DEPARTMENT_ID where salary >= 3500 and salary < 8000 group by dep_id
union
select 'SEGMENTO C'as segmento,count(1) as cant, e.DEPARTMENT_ID as dep_id 
from employees e join departments d on e.DEPARTMENT_ID = d.DEPARTMENT_ID where salary >= 8000 group by dep_id) t;

select e.EMPLOYEE_ID as EMPLOYEE_ID, 
 e.FIRST_NAME as FIRST_NAME, 
 e.LAST_NAME as LAST_NAME, 
 e.EMAIL as EMAIL, 
 e.PHONE_NUMBER as PHONE_NUMBER, 
 e.HIRE_DATE as HIRE_DATE, 
 e.JOB_ID as JOB_ID, 
 max(e.SALARY) as SALARY, 
 e.COMMISSION_PCT as COMMISSION_PCT, 
 e.MANAGER_ID as MANAGER_ID, 
 e.DEPARTMENT_ID as DEPARTMENT_ID 
from employees e join departments d on e.DEPARTMENT_ID=d.DEPARTMENT_ID 
group by d.DEPARTMENT_ID;

select e.EMPLOYEE_ID as EMPLOYEE_ID, 
 e.FIRST_NAME as FIRST_NAME, 
 e.LAST_NAME as LAST_NAME, 
 e.EMAIL as EMAIL, 
 e.PHONE_NUMBER as PHONE_NUMBER, 
 e.HIRE_DATE as HIRE_DATE, 
 e.JOB_ID as JOB_ID, 
 e.SALARY as SALARY, 
 e.COMMISSION_PCT as COMMISSION_PCT, 
 e.MANAGER_ID as MANAGER_ID, 
 e.DEPARTMENT_ID as DEPARTMENT_ID
from employees e 
join jobs j on e.JOB_ID = j.JOB_ID
where j.JOB_TITLE LIKE '%Manager%'
AND DATE_ADD(e.hire_date,INTERVAL 15 YEAR)<now() ; 

select *
from (select count(*) as CANT,avg(salary) AS SALARY,DEPARTMENT_ID
	from employees  
	group by DEPARTMENT_ID ) e
where e.cant > 10;

select count(1) as cantidad_empleados, 
avg(e.salary) as salario_promedio,
min(e.salary) as salario_minimo,
max(e.salary) as salario_maximo,
avg(TIMESTAMPDIFF(YEAR, jh.start_date, jh.end_date)) as promedio_anios
from employees e
left join (select employee_id, min(start_date) as start_date, max(end_date) as end_date
from job_history group by EMPLOYEE_ID) jh on jh.employee_id = e.employee_id
join departments d on d.DEPARTMENT_ID = e.DEPARTMENT_ID
join locations l on l.LOCATION_ID = d.LOCATION_ID
group by l.LOCATION_ID
;