--Display electricity connection type and building type details using joins

select connection_name, count(*) connection_count 
from electricity_connection_type e
inner join building_type bt on e.id=bt.connection_type_id
inner join building b on bt.id=b.building_type_id
inner join meter m on b.id=m.building_id
group by e.connection_name 
order by connection_count desc;
