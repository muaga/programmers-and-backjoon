SELECT I.NAME, I.DATETIME
FROM ANIMAL_INS AS I
LEFT JOIN ANIMAL_OUTS AS O
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE O.ANIMAL_ID IS NULL -- ANIMAL_INS 중 ANIMAL_OUTS 속 ANIMAL_ID가 없는 곳
ORDER BY I.DATETIME
LIMIT 3