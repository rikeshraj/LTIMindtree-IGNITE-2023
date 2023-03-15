select m.meter_number, sum(er.total_units) as month_total_unit, bill.payable_amount, 
sum(h6+h7+h8+h9+h10+h11) as morning, 
sum(h12+h13+h14+h15) as afternoon, 
sum(h16+h17+h18+h19) as evening, 
sum(h20+h21+h22+h23+h24+h1+h2+h3+h4+h5) as night 
from bill 
join meter m on bill.meter_id=m.id 
join electricity_reading er on er.meter_id=m.id 
where bill.month=12 and bill.year=2017 
group by m.meter_number
order by month_total_unit desc;
