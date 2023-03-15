--Display travel card details based on travel times condition using joins

select tc.person_name, tc.contact_number, tc.balance
from travel_card tc
inner join travel_payment tp on tc.id = tp.travel_card_id
group by tc.person_name, tc.contact_number, tc.balance
having count(*) = 
(select max(travel_count)from 
 (select count(*)as travel_count from travel_payment 
  group by travel_card_id)as travel_max_count) 
order by tc.person_name desc;
