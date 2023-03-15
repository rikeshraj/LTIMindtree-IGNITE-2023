select meter_number, owner_name, address 
from building b 
join meter m on m.building_id=b.id 
join bill on bill.meter_id=m.id 
where bill.is_payed>0 and bill.fine_amount>0 
group by meter_id 
having count(meter_id) = 
(select max(no) from 
 (select count(fine_amount) as no from bill group by meter_id) sub);
 
--OR

SELECT m.meter_number, bg.owner_name, bg.address
FROM building bg
JOIN meter m ON m.building_id = bg.id
JOIN bill b ON m.id = b.meter_id
where b.is_payed>0 and b.fine_amount>0 
group by m.meter_number
ORDER BY count(b.id) desc,  bg.owner_name ASC
limit 1;
