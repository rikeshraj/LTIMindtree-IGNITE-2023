select m.meter_number, b.owner_name, b.address, b.contact_number, bt.name, ect.connection_name 
from meter m 
inner join building b on m.building_id=b.id 
inner join building_type bt on bt.id=b.building_type_id 
inner join electricity_connection_type ect on ect.id=bt.connection_type_id 
order by b.owner_name, m.meter_number;
