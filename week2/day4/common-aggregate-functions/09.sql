--Display sum of payable and fine amount details using aggregate function

select sum(payable_amount+fine_amount) sum_payable_and_fine_amount 
from bill;
