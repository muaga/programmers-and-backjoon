-- 대장균 개체의 크기 100이하 -> LOW
-- 대장균 개체의 크기 100초과 1000이하 -> MEDIUM
-- 대장균 개체의 크기 1000초과 -> HIGH

SELECT ID,
    CASE 
        WHEN SIZE_OF_COLONY <= 100 THEN 'LOW'
        WHEN SIZE_OF_COLONY > 100 AND SIZE_OF_COLONY <= 1000 THEN 'MEDIUM'
        ELSE 'HIGH'
        END AS SIZE
FROM ECOLI_DATA
ORDER BY ID 