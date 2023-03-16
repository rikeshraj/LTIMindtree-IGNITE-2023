--01
--Display building details using subquery
select * from building 
where building_type_id = 
(select id from building_type where name = "library")
order by owner_name;

--02
--Display building details based on condition using subquery
select contact_number from building 
where building_type_id = 
(select id from building_type where name = "police station")
order by contact_number;

--03
--Display building type details using subquery
select name from building_type where id in 
(select building_type_id from building where id in 
(select building_id from meter where meter_number = "SG824012"));

--04
--Display meter details based on building type condition using subquery
select meter_number from meter where building_id in 
(select id from building where building_type_id = 
(select id from building_type where name = "College"))
 order by meter_number;
 
--05
--Display bill details based on meter condition using subquery
select total_units, payable_amount 
from bill 
where meter_id in 
(select id from meter where meter_number = "sg934826");

--06
--Display number of buildings using subquery
select count(id) as building_count 
from building 
where id in 
(select building_id from meter where id in 
 (select meter_id from bill where fine_amount>0));

--07
--Display average payable amount using subquery
select avg(payable_amount) as payable_amount 
from bill 
where meter_id in
(select id from meter where building_id in
(select id from building where building_type_id in
(select id from building_type where connection_type_id in
(select connection_type_id from slab where rate<24))));

--08
--Display payment date details based on meter condition using subquery
select payment_date 
from bill 
where meter_id in 
(select id from meter where meter_number = "sg288942");

--09
--Display meter details based on day condition using subquery
select meter_number 
from meter 
where id in 
(select meter_id from electricity_reading where day="2018-05-07")
order by meter_number;

--10
--Display owner details based on condition using subquery
select owner_name 
from building 
where id in 
(select building_id from meter where id in 
(select meter_id from bill where total_units = 
(select max(total_units) from bill)))
order by owner_name;

--11
--Display meter details based on condition using subquery
select meter_number 
from meter 
where id in 
(select meter_id from bill where total_units =  
 (select min(total_units) from bill))
 order by meter_number;

--12
--Display meter details based on readingcondition using subquery
select meter_number 
from meter 
where id in 
(select meter_id from electricity_reading where h20 = 
 (select max(h20) from electricity_reading));

--13
--Display meter details based on consumed condition using subquery
select meter_number 
from meter 
where id in
(select meter_id from electricity_reading where h21 = 
 (select min(h21) from electricity_reading ))
 order by meter_number;

--14
--Display meter details based on fine amount condition using subquery
select meter_number 
from meter 
where id in 
(select meter_id from bill where fine_amount = 
 (select max(fine_amount) from bill));

--15
--Display owner details based on date condition using subquery
select owner_name, contact_number 
from building 
where id in 
(select building_id from meter where id in 
 (select meter_id from bill where month = 10))
 order by owner_name;

--16
--Display number of bills using subquery
select count(payment_date) as payment_count from bill where meter_id in 
(select id from meter where building_id in 
 (select id from building where building_type_id in 
  (select id from building_type where connection_type_id in 
   (select id from electricity_connection_type where connection_name = "commercial"))));

--17
--Display owner details based on connection type condition using subquery
select address 
from building 
where building_type_id in 
(select id from building_type where connection_type_id in 
 (select id from electricity_connection_type where connection_name = "home"))
 order by address;

--18
--Display owner details based on consumed condition using subquery
select owner_name 
from building 
where id in 
(select building_id from meter where id in 
 (select meter_id from electricity_reading where total_units in 
  (select min(total_units) from electricity_reading)));

--19
--Display total and average units based on connection type condition using subquery
select sum(h20) as total_amount, avg(h20) as average_amount 
from electricity_reading 
where meter_id in 
(select id from meter where building_id in 
 (select id from building where building_type_id in 
  (select id from building_type where connection_type_id in 
   (select id from electricity_connection_type where connection_name = "commercial"))));

--20
--Display rate details based on meter condition using subquery
select rate 
from slab 
where connection_type_id in 
(select connection_type_id from building_type where id in 
 (select building_type_id from building where id in 
  (select building_id from meter where meter_number = "sg567423")));


