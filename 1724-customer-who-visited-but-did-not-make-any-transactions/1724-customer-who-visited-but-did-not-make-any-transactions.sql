select Visits.customer_id,count(Visits.visit_id) as count_no_trans from Visits left join Transactions on Visits.visit_id=Transactions.visit_id where Transactions.transaction_id is null group by Visits.customer_id;



-- 1 23 1 12 910
-- 2 9  2 13 970
-- 4 30 null null null
-- 5 54 5  2 310
-- 6 96 null null null
-- 7 54 null null null
-- 8 54 null null null


-- 30
-- 96
-- 54
-- 54

-- 30 
-- 96 
-- 54