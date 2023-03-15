select b.owner_name, b.address, m.meter_number, bill.payable_amount 
from building b 
join meter m on b.id=m.building_id 
join bill on bill.meter_id=m.id 
where bill.fine_amount is null and bill.month=12 and bill.year=2017 
order by b.owner_name
