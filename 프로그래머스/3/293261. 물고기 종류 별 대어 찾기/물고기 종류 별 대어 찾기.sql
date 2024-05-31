# SELECT FISH_TYPE, MAX(LENGTH)
# FROM FISH_INFO
# GROUP BY FISH_TYPE


# SELECT I.ID, N.FISH_NAME, I.LENGTH -- SELECT 절에 
# FROM FISH_NAME_INFO AS N
# JOIN FISH_INFO AS I
# ON N.FISH_TYPE = I.FISH_TYPE
# WHERE I.LENGTH IN ( -- 물고기 별 가장 큰 물고기 값만 꺼내오기
#         SELECT MAX(LENGTH)
#         FROM FISH_INFO
#         WHERE LENGTH IS NOT NULL
#         GROUP BY FISH_TYPE)
# ORDER BY ID

 SELECT  F.ID, N.FISH_NAME,
                F.LENGTH

    FROM  FISH_INFO AS F 
                JOIN FISH_NAME_INFO AS N ON F.FISH_TYPE = N.FISH_TYPE

  WHERE  F.LENGTH IN ( SELECT  MAX(LENGTH) 
                                            FROM   FISH_INFO 
                                          WHERE   FISH_TYPE = F.FISH_TYPE 
                                          GROUP   BY FISH_TYPE ) 

   ORDER BY F.ID