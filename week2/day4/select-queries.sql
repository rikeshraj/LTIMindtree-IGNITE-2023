--01
--Display electricity connection type details
select * 
from electricity_connection_type 
order by connection_name;

--02
--Display building type details
select * 
from building_type 
order by name;

--03
--Display building details
select * 
from building 
order by owner_name; 

--04
--Display electricity reading details
select * 
from electricity_reading 
order by total_units desc;

--05
--Display meter number
select meter_number 
from meter; 

--06
--Display owner name and contact details
select owner_name, contact_number 
from building 
order by owner_name;

--07
--Display slab details
select * 
from slab 
order by from_unit;

--08
--Filter building details based on building type
select * 
from building 
where building_type_id=2 
order by owner_name;

--09
--Display building owner details
select owner_name, length(owner_name) as name_length 
from building 
order by owner_name;

--10
--Display building owner and contact details
select owner_name, concat(concat(contact_number,'-'),email_address) as contact_details 
from building
order by owner_name desc;
--OR
select owner_name, concat(contact_number,'-',email_address) as contact_details 
from building
order by owner_name desc;

--11
--Display meter code
select substr(meter_number, 1, 3) as meter_code 
from meter 
order by meter_code desc;

--12
--Display owner name code and contact details
select substr(owner_name, 1, 3) as name_code, contact_number 
from building 
order by owner_name;

--13
--Filter building type details based on condition
select name from building_type
where name like "%l" 
order by name;

--14
--Filter building details based on owner name condition
select * from building 
where owner_name like "%di%" 
order by owner_name;

--15
--Display bill details based on payment date condition
select due_date, payable_amount 
from bill 
where payment_date not between "2017-09-10" and "2017-10-10";
