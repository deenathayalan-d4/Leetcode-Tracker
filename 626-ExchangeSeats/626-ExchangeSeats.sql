-- Last updated: 09/07/2026, 15:06:58
# Write your MySQL query statement below
SELECT
    CASE
        WHEN id % 2 = 1
             AND id + 1 IN (SELECT id FROM Seat)
        THEN id + 1

        WHEN id % 2 = 0
        THEN id - 1

        ELSE id
    END AS id,
    student
FROM Seat
ORDER BY id;