--Display travel cad details based on route and payment condition using joins

select tc.person_name, tc.contact_number 
from travel_card tc 
inner join travel_payment tp on tp.travel_card_id=tc.id 
inner join station s on s.id=tp.exit_station_id
inner join station_route sr on sr.station_id=s.id 
inner join route r on r.id=sr.route_id 
where r.route_name='north east line' and tp.amount>25 
order by tc.person_name;
