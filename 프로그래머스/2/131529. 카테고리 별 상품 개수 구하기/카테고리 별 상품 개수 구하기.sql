SELECT SUBSTRING(product_code, 1, 2) AS category, COUNT(*) AS products FROM PRODUCT
GROUP BY SUBSTRING(product_code, 1, 2)
ORDER BY category asc
