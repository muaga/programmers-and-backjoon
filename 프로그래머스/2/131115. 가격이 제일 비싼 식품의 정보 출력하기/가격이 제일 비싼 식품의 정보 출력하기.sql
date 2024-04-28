# SELECT product_id, product_name, product_cd, category, max(price) as price
# from food_product


select * from food_product
order by price desc
limit 1