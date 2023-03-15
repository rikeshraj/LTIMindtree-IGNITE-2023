select b.owner_name, b.address, count(m.id) as connection_count
from building_type bt 
join building b on bt.id=b.building_type_id 
join meter m on b.id=m.building_id 
group by b.owner_name 
order by b.owner_name;
