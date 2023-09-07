# Write your MySQL query statement below
select w2.id 
from Weather w1
left join Weather w2
on w2.recordDate = DATE_ADD(w1.recordDate, INTERVAL +1 day)
where w1.temperature < w2.temperature;