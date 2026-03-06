-- 아이템 희귀도가 'LEGEND'인 아이템들의 가격의 총합 구하기
-- 컬럼명 'TOTAL_PRICE'

select 
    sum(price) as `TOTAL_PRICE`
from 
    item_info
where
    rarity = "LEGEND";
    
    
/** 참고사항
열 이름에 별칭(alias) 붙이기: AS
- 백틱으로 감싸면 특수문자 사용가능 
*/