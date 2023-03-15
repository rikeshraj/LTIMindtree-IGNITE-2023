select tc.person_name, tc.contact_number, tc.balance, tp.entry_time, tp.exit_time 
from travel_card tc 
inner join travel_payment tp on tp.travel_card_id=tc.id 
where tc.balance=
(select max(balance) from travel_card where balance<
(select max(balance) from travel_card))
order by tc.person_name;
