--Display route and travel payment details using joins

select r.*, tp.* 
from route r 
inner join station_route sr on r.id=sr.route_id 
inner join station s on sr.station_id=s.id 
inner join travel_payment tp on s.id=tp.entry_station_id 
order by r.route_name;
