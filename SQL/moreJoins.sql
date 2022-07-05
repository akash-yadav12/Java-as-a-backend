-- Joining across two database

SELECT *
FROM order_items oi
JOIN sql_inventory.products p
     on oi.product_id = p.product_id

-- Self Joins
USE sql_hr;
SELECT e.employee_id,e.first_name AS Employee, m.first_name AS Manager
From employees e
JOIN employees m
     ON e.reports_to = m.employee_id 


-- Joining Multiple Tables
SELECT 
	o.order_id,
    o.order_date,
    c.first_name,
    c.last_name,
    os.name
FROM orders o
JOIN customers c
     ON o.customer_id = c.customer_id
JOIN order_statuses os
	 ON o.status = os.order_status_id

-- Excercise
USE sql_invoicing;
SELECT p.date,p.invoice_id, c.name,p.amount, pm.name 
FROM payments p
JOIN clients c 
	 ON p.client_id = c.client_Id
JOIN payment_methods pm
     ON p.payment_method = pm.payment_method_id



