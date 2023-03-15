--Display travel card details based on exit time condition using joins

select tc.*, tp.* 
from travel_card tc 
inner join travel_payment tp on tp.travel_card_id=tc.id 
where tp.amount>25 and date(tp.exit_time)='2017-12-21' 
order by tc.person_name;
