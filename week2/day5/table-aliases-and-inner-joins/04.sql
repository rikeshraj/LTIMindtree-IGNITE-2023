--Display building and meter details based on condition using joins

select owner_name, address, meter_number, total_units 
from building b 
inner join meter m on b.id=m.building_id 
inner join bill on m.id=bill.meter_id 
where month=12 && year=2017
order by total_units desc;
