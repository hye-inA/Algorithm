-- 동물 보호소에 가장 먼저 들어온 동물은 언제 들어왔는지 조회

select 
    min(datetime) as `시간`
from 
    animal_ins
order by
    datetime asc;