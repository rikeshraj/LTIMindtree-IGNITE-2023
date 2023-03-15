--01
--Display number of roles using aggregate function
select count(id) as role_count 
from role;

--02
--Display number of skills using aggregate function
select count(id) as skill_count 
from skill;

--03
--Display number of users using aggregate function
select count(id) user_count 
from user 
where profile_id is null;

--04
--Display number of alumnis based on condition using aggregate function
select count(id) alumni_2008_count 
from profile 
where batch=2008;

--05
--Display number of profiles based on condition using aggregate function
select count(id) alumni_male_2008_count 
from profile 
where gender="male" && batch=2008;

--06
--Display number of users based on condition using aggregate function
select count(id) pm_count 
from profile 
where designation="project manager";

--07
--Display senior alumni details using aggregate function
select min(batch) senior_pm_batch 
from profile 
where designation='project manager';

--08
--Display junior alumni details using aggregate function
select max(batch) junior_pm_batch 
from profile 
where designation='project manager';

--09
--Display number of projects using aggregate function
select count(id) project_count 
from project 
where number_of_members>10;

--10
--Display number of queries using aggregate function
select count(id) number_of_queries 
from query 
where hour(date)>=1 && hour(date)<=5;

--11
--Display number of posts based on condition using aggregate function
select count(id) number_of_posts 
from post 
where date<'2013-12-01';

--12
--Display number of posts based on date condition using aggregate function
select count(id) number_of_posts 
from post 
where date>'2013-12-01';

--13
--Display number of buildings using aggregate function
select count(id) count_of_buildings_with_email 
from building 
where email_address is not null;

--14
--Display number of bills using aggregate function
select count(id) count_of_bills_with_fine 
from bill 
where fine_amount>0

--15
--Display number of bills based on condition using aggregate function
select count(id) count_of_bills_with_payment 
from bill 
where is_payed>0;

--16
--Display number of electricityreading based on condition using aggregate function
select count(id) count_total_units_500 
from electricity_reading 
where total_units>500;

