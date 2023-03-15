select b.owner_name, b.address, m.meter_number, bill.payable_amount 
from bill 
join meter m on m.id=bill.meter_id 
join building b on b.id=m.building_id 
where bill.fine_amount = 
(select max(fine_amount) from bill) 
order by b.owner_name;
