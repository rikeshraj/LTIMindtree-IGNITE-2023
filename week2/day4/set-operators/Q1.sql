--Display building details using set operator

select * from building where owner_name='muzzammil' 
union 
select * from building where owner_name='nicholas'
order by owner_name, email_address;
