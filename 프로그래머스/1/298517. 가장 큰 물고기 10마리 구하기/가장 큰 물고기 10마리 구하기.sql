select id, length 
from (select * from fish_info where length is not null order by length desc limit 10) as fish_list
order by length desc, id asc
