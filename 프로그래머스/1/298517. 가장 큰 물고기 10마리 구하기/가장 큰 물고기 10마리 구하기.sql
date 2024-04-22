-- 1. from 절에 물고기 10마리를 필터링
-- 2. 길이 기준 내림차순 and 길이가 같다면 id 오름차순 -> ,를 통해 order by 에 우선 순위 대로 진행되게 하기

select id, length 
from (select * from fish_info where length is not null order by length desc limit 10) as fish_list
order by length desc, id asc
