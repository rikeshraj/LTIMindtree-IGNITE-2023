--Display metro train details based on route condition using joins

select distinct mt.position, mt.updated_time, mt.forward, ts.scheduled_time, tat.actual_time 
from train_arrival_time tat 
inner join train_schedule ts on tat.train_schedule_id=ts.id
inner join metro_train mt on mt.id=ts.metro_train_id 
inner join route r on r.id=mt.route_id 
where r.route_name='north south line' or r.route_name='circle line' 
order by mt.position;
