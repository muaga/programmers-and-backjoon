-- date_format(컬럼, 포맷형식) : 날짜를 원하는 형태로 포맷 * 꼭 별칭을 달아줄 것
-- datediff(끝 날짜, 시작날짜) : 날짜 차이를 일 수로 연산 * 꼭 끝 날짜를 앞에 둘 것
-- year(컬럼), month(컬럼) : 데이터에서 각 형태의 데이터만 추출 

SELECT 
    history_id,
    car_id,
    date_format(start_date, '%Y-%m-%d') as start_date,
    date_format(end_date, '%Y-%m-%d') as end_date,
    case when datediff(end_date, start_date) + 1 >= 30 then '장기 대여'
    -- 날짜 비교할 때, 꼭! + 1을 해 줄 것!!!!!
        else '단기 대여'
        end as rent_type
from car_rental_company_rental_history
-- where substring(start_date, 1, 2) = '2022-09'
-- where date_format(start_date, '%y-%m') = '2022-09'
where year(start_date) = 2022 and month(start_date) = 09
order by history_id desc
