-- round : 소수점 반올림(컬럼명, 자리수)
-- ifnull : null 대체(컬럼명, 대체값)

select round(avg(ifnull(length, 10)), 2) as AVERAGE_LENGTH
from fish_info
