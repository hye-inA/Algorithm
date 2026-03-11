-- 동물 보호소에 동물이 몇 마리 들어왔는지 조회
select
    count(animal_id) as count
from
    animal_ins;