--01
--Display senior alumni details using aggregate function
select min(batch) senior_pm_batch 
from profile 
where designation='project manager';

--02
--Display junior alumni details using aggregate function
select max(batch) junior_pm_batch 
from profile 
where designation='project manager';

--03
--Display average electricity consumption details using aggregate function
select avg(total_units) average_units_of_electricity 
from electricity_reading;

--04
--Display average payable amount using aggregate function
select avg(payable_amount) average_payable_amount 
from bill 
where payable_amount>10000;

--05
--Display sum of payable amount details using aggregate function
select sum(payable_amount) sum_payable_amount 
from bill;

--06
--Display total payable amount details using aggregate function
select sum(payable_amount) sum_payable_amount 
from bill 
where due_date='2017-10-01';

--07
--Display minimum consumption user details using aggregate function
select min(total_units) min_total_units 
from electricity_reading;

--08
--Display average 8th hour consumption details using aggregate function
select avg(h8) average_8th_hour_consumption 
from electricity_reading;

--09
--Display sum of payable and fine amount details using aggregate function
select sum(payable_amount+fine_amount) sum_payable_and_fine_amount 
from bill;

--10
--Display total 12th hour consumption details using aggregate function
select sum(h12) sum_12th_hour_consumption 
from electricity_reading;

--11
--Display total payable amount based on condition using aggregate function
select sum(payable_amount) sum_payable_amount 
from bill 
where year(payment_date)=2018;

