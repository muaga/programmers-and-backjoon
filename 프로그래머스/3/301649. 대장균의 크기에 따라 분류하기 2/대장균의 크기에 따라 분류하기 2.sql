-- 대장균 개체의 크기를 내름차순으로 정렬했을 때 
-- 상위 0% ~ 25% 를 'CRITICAL', 
-- 26% ~ 50% 를 'HIGH', 
-- 51% ~ 75% 를 'MEDIUM', 
-- 76% ~ 100% 를 'LOW' 라고 분류


-- 크기 / 크기 총 합 * 100

# select id, (case
#             when ntile(4) over (order by size_of_colony) = 1 then 'LOW'
#             when ntile(4) over (order by size_of_colony) = 2 then 'MEDIUM'
#             when ntile(4) over (order by size_of_colony) = 3 then 'HIGH'
#             else 'CRITICAL'
#            end) as colony_name
# from ecoli_data
# order by id


SELECT ID,
    CASE
        WHEN NTILE(4) OVER (ORDER BY SIZE_OF_COLONY) = 1 THEN 'LOW'
        WHEN NTILE(4) OVER (ORDER BY SIZE_OF_COLONY) = 2 THEN 'MEDIUM'
        WHEN NTILE(4) OVER (ORDER BY SIZE_OF_COLONY) = 3 THEN 'HIGH'
        ELSE 'CRITICAL'
        END AS COLONY_NAME
FROM ECOLI_DATA
ORDER BY ID