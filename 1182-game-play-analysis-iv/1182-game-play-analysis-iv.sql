WITH Min_Date_CTE AS
(
	SELECT 
		player_id,
        MIN(event_date) AS event_date
	FROM activity
	GROUP BY player_id
)
SELECT 
	ROUND(COUNT(*) / (SELECT COUNT(*) FROM Min_Date_CTE), 2) AS fraction
FROM 
	Min_Date_CTE a JOIN Activity b 
ON a.player_id = b.player_id
WHERE DATEDIFF(b.event_date, a.event_date) = 1;