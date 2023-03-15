--Display total 12th hour consumption details using aggregate function

select sum(h12) sum_12th_hour_consumption 
from electricity_reading;
