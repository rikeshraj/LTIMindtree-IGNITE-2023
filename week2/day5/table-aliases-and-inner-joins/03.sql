--Display slab and electricity connection type details using joins

select connection_name, from_unit, to_unit, rate from slab s inner join electricity_connection_type ect 
on s.connection_type_id = ect.id
order by rate;
