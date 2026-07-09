-- Last updated: 09/07/2026, 15:06:33
# Write your MySQL query statement below
SELECT person_name
FROM
(
    SELECT
        person_name,
        turn,
        SUM(weight) OVER (ORDER BY turn) AS total_weight
    FROM Queue
) q
WHERE total_weight <= 1000
ORDER BY total_weight DESC
LIMIT 1;