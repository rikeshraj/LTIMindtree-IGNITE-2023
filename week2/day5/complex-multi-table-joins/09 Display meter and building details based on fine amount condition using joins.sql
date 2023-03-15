select meter_number, owner_name, address 
from building b 
join meter m on m.building_id=b.id 
join bill on bill.meter_id=m.id 
where fine_amount = 
(select min(fine_amount) from bill where fine_amount > 
 (select min(fine_amount) from bill))
order by owner_name;
