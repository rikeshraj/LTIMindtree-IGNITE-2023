--01
--display batch name and number of profiles under each batch who have registered in system
select batch, count(*) as profile_count 
from profile 
where batch is not null 
group by batch 
order by batch;

--02
--Display batch wise number of male profiles using aggregate and group by
select batch, count(gender) as male_alumni_count 
from profile 
where gender="male" 
group by batch 
order by batch;

--03
--Display batch wise number of female profiles using aggregate and group by
select batch, count(gender) as female_alumni_count 
from profile 
where gender="female" 
group by batch 
order by batch;

--04
--Display designation wise number of users using aggregate and group by
select designation, count(designation) as designation_count 
from profile 
group by designation 
order by designation;

--05
--Display year wise number of events using aggregate and group by
select year(date), count(year(date)) as number_of_events 
from event 
group by year(date) 
order by date;

--06
--Display month wise minimum units using aggregate and group by
select month, min(total_units) as minimum_units 
from bill 
group by month;

