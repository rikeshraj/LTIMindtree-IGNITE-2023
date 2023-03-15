--Display person details based on station name condition using joins

select tc.person_name, tc.contact_number, tc.balance, tp.entry_time, tp.exit_time 
from travel_card tc 
inner join travel_payment tp on tp.travel_card_id=tc.id 
inner join station s on s.id=tp.entry_station_id 
where s.name='sengkang mrt station' 
order by tc.person_name;
