--Display total payable amount based on condition using aggregate function

select sum(payable_amount) sum_payable_amount 
from bill 
where year(payment_date)=2018;
