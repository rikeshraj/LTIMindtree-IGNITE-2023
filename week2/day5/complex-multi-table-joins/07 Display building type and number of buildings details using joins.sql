select bt.name, count(bt.id) as number_of_buildings 
from building b 
join building_type bt on bt.id=b.building_type_id 
group by bt.id 
having count(bt.id)=(select max(no_of_b) from (select count(building_type_id) as no_of_b from building group by building_type_id) sub )
order by bt.name;
