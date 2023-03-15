select b.owner_name, sum(payable_amount) as totalbillamount
from building b 
join meter m on m.building_id=b.id 
join bill on bill.meter_id=m.id 
where m.id=(select meter_id from bill where payable_amount in 
 (select max(payable_amount) from bill where fine_amount is null and year=2017)) 
order by owner_name;
