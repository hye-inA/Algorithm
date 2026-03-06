-- 동물 보호소에 들어온 동물의 이름 갯수 조회
-- NULL 집계 / 중복 허용
select 
    count(distinct(name))
from
    animal_ins;