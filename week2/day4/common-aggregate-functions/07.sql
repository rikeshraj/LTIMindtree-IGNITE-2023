--Display minimum consumption user details using aggregate function

select min(total_units) min_total_units 
from electricity_reading;
