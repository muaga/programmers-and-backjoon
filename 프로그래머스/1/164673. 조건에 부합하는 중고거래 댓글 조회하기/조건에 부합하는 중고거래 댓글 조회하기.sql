-- 코드를 입력하세요
SELECT * FROM USED_GOODS_BOARD;
SELECT * FROM USED_GOODS_REPLY;

-- 10월에 작성한
select title, b.board_id, r.reply_id, r.writer_id, r.contents, date_format(r.created_date, '%Y-%m-%d') as created_date
from USED_GOODS_BOARD as b
inner join USED_GOODS_REPLY as r
on b.board_id = r.board_id
where (year(b.created_date) = '2022' and month(b.created_date) = '10')
order by r.created_date asc, b.title asc