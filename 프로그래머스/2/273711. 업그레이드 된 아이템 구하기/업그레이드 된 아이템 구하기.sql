# SELECT INFO.ITEM_ID, INFO.ITEM_NAME, INFO.RARITY
#     FROM ITEM_INFO AS INFO
#     INNER JOIN_TREE AS TREE
#         ON INFO.ITEM_ID = TREE.ITEM_ID
# WHERE INFO.RARITY = 'RARE' AND TREE.PARENT_ITEM_ID IS NOT NULL
# ORDER BY INFO.ITEM_ID DESC
# 아이템의 희귀도가 'RARE'인 아이템의 다음 업그레이드 아이템을 찾는 데 까지는 진행이 되나, 찾은 아이템의 희귀도가 'RARE'가 아닌 아이템이 나오지 않아 원하는 결과를 얻을 수 없었다.

-- 희귀도가 RARE인 아이템 중에서, 다음 업그레이드 아이템 목록(즉, 자식 아이템)을 찾아라
SELECT INFO.ITEM_ID, INFO.ITEM_NAME, INFO.RARITY
FROM ITEM_INFO AS INFO
JOIN ITEM_TREE AS TREE
    ON INFO.ITEM_ID = TREE.ITEM_ID
    # 1. RARE인 아이템
WHERE TREE.PARENT_ITEM_ID IN (
    SELECT ITEM_ID
    FROM ITEM_INFO
    WHERE RARITY = 'RARE') 
    -- 서브쿼리를 통해 희귀도가 'RARE'인 아이템이 [0, 1, 3, 4]임을 알 수 있다.
    -- 저 말에서 헷갈릴 수 있는데, 처음 조건이 희귀도가 RARE인 상품이라는 것은 부모 아이템이 RARE라는 뜻이고
    -- 다음 업그레이드 아이템은 RARE 등급인 부모 아이템의 자식 아이템 목록을 불러오라는 뜻이다.
    -- 그래서 서브쿼리를 통해 부모의 희귀도가 RARE인 상품을 먼저 나오게 하여 TREE.ITEM_ID 목록을 찾아낸다.
ORDER BY INFO.ITEM_ID DESC