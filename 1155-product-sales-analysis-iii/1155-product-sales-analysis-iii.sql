# Write your MySQL query statement below
# Write your MySQL query statement below
with sale as 
(select *,rank() over (partition by product_id order by year) as rw
from sales)

select product_id,year as first_year,quantity, price from sale
where rw=1;
