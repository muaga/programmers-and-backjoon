-- substring : 문자열 자르기(컬럼명, 시작위치, 끝위치)

select count(*) as fish_count from fish_info
where substring(time, 1, 4) = '2021'
