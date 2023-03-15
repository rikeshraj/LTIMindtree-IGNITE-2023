--01
--insert into table
insert into building_type values(1, "Raghav", 0);
insert into building_type values(2, "Prince", 0);
insert into building_type values(3, "Shelly", 1);
insert into building_type values(4, "Chaitanya", 2);
insert into building_type values(5, "Gabrielle", 1);

--02
--update table
update building_type 
set name = "Mall" 
where name = "Shopping Mall";

--03
--delete tuple from table
delete from building_type 
where connection_type_id = 1;
