--01
--Display company wise number of alumnis using aggregate and group by
select company_name, count(company_name) as alumni_count 
from experience 
where end is null 
group by company_name;
--OR
select company_name , count(current) as alumni_count
from experience 
where current=1 
group by company_name;

--02
--Display year wise number of events using aggregate and group by
select year(date), count(*) as number_of_events 
from event 
group by year(date) 
order by year(date);

--03
--Display month wise number of events using aggregate and group by
select monthname(date), count(month(date)) number_of_events 
from event 
where year(date) = 2013 
group by month(date) 
order by month(date);
