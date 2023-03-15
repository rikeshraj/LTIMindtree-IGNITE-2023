--Display bill details using set operator

select count(id) no_of_bills from bill where month(payment_date)=10
union 
select count(id) no_of_bills from bill where month(payment_date)=12
order by no_of_bills desc;
