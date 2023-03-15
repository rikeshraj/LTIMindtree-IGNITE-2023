--Display station details based on route and arrival date condition using joins

select s.name, s.locality 
from station s 
inner join train_schedule ts on ts.station_id=s.id 
inner join station_route sr on sr.station_id=s.id 
inner join route r on r.id=sr.route_id 
where date(ts.scheduled_time)='2017-12-21' and r.route_name='circle line' 
order by s.name;
