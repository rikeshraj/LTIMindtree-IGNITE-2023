select b.owner_name, bt.name, m.meter_number, if(bill.is_payed=0, "not paid yet", bill.payment_date) as payment_status 
from bill 
join meter m on m.id=bill.meter_id 
join building b on b.id=m.building_id 
join building_type bt on bt.id=b.building_type_id 
where bill.month=12 and bill.year=2017 
order by b.owner_name;
