select tc.person_name, tc.contact_number, tc.balance 
from travel_card tc 
inner join travel_payment tp on tp.travel_card_id=tc.id 
where tp.amount=
(select  min(amount) from travel_payment)
order by tc.person_name desc;
