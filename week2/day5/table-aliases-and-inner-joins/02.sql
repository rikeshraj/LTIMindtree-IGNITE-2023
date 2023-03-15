--Display building and meter details using joins

select meter_number, owner_name, address, contact_number 
from building b 
inner join meter m on b.id = m.building_id 
order by owner_name, meter_number;
