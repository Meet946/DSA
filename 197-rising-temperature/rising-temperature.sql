SELECT w2.id
FROM Weather w1
INNER JOIN Weather w2
ON w2.temperature > w1.temperature
WHERE DATEDIFF(w2.recordDate,w1.recordDate) = 1;