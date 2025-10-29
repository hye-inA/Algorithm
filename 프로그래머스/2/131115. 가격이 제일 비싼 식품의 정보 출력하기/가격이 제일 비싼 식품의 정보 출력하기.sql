# 방법 1. MAX 함수와 서브쿼리 사용

select 
    product_id,
    product_name,
    product_cd,
    category,
    price
from 
    food_product
order by
    price desc
limit 1;