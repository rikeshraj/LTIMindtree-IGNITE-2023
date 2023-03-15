--Display route details based on station name condition using joins

select r.route_name 
from route r 
inner join station_route sr on sr.route_id=r.id 
inner join station s on s.id=sr.station_id 
where s.name="woodlands mrt station"
order by r.route_name;
