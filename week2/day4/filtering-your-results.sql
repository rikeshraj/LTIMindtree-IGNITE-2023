--01
--Display building details of Nicholas
select * 
from building 
where owner_name = "nicholas";

--02
--Filter bill details based on condition
select * 
from bill 
where total_units>10000 
order by total_units desc;

--03
--Filter bill details based on date condition
select * 
from bill 
where due_date = "2017-10-01" 
order by payable_amount desc;

--04
--Filter bill details based on year condition
select * 
from bill 
where payment_date like "2018%" 
order by payable_amount desc;

--05
--Filter building details based on condition
select owner_name, address, contact_number 
from building 
where email_address is null 
order by owner_name;

--06
--Filter building details based on owner name
select * 
from building 
where owner_name like "m%" 
order by owner_name;

--07
--Filter building details based on building type
select * 
from building 
where building_type_id=2 
order by owner_name;

--08
--Filter electricity reading details based on condition
select * 
from electricity_reading 
where total_units between 500 and 1000 
order by total_units;

--09
--
select * 
from bill 
where is_payed=0 
order by due_date;

--10
--Filter electricity reading details based on readings
select meter_id, total_units 
from electricity_reading 
where h13<h14 
order by total_units desc;

--11
--Filter meter details based on condition
select * 
from meter 
where meter_number like "s%" and meter_number like "%6";

--12
--Filter building type details based on condition
select name 
from building_type 
where name like "%l" 
order by name;

--13
--Filter building details based on owner name condition
select * 
from building 
where owner_name like "%di%" 
order by owner_name;

--14
--Filter bill details based on payment date
select * 
from bill 
where payment_date like "%02" 
order by total_units desc;

--15
--Display bill details based on payment date condition
select due_date, payable_amount 
from bill 
where payment_date not between "2017-09-10" and "2017-10-10";

--16
--Filter bill details based on date difference
select due_date, payment_date, (due_date-payment_date) as date_difference, payable_amount 
from bill
where payment_date<=due_date;

--can also use dateduff()
