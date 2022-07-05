-- Compound JOIN
SELECT *
FROM order_items oi
JOIN order_item_notes oin
     ON oi.order_id = oin.order_id
     AND oi.product_id = oin.product_id


Implicit JOIN SYNTAX (Not prefered, use explicit syntax)
SELECT *
FROM orders o, customers c
WHERE o.customer_id = c.customer_id


-- There are two joins INNER and OUTER JOIN

Inner JOIN SYNTAX
SELECT *
FROM customers c
JOIN orders o
     ON c.customer_id = o.customer_id

-- OUTER JOIN, There are two types of Outer Join i.e LEFT and Right JOIN
SELECT
	c.customer_id,
    c.first_name,
    o.order_id
FROM customers c
LEFT JOIN orders o
         ON c.customer_Id = o.customer_id
ORDER BY c.customer_id

-- OUTER keyword is optional just like the inner keyword, for outer join we type left or right join

-- Excercise
SELECT p.product_id, p.name, o.quantity
FROM products p
LEFT JOIN order_items o
	 ON p.product_id = o.product_id

-- OUTER JOIN between multiple tables
SELECT
	c.customer_id,
    c.first_name,
    o.order_id,
    sh.name AS shipper
FROM customers c
LEFT JOIN orders o
         ON c.customer_Id = o.customer_id
LEFT JOIN shippers sh
     ON o.shipper_id = sh.shipper_id
ORDER BY c.customer_id

--  Excercise
SELECT 
	o.order_date,
	o.order_id,
    c.first_name,
    sh.name AS shipper,
    os.name AS status
FROM orders o
JOIN customers c
     ON o.customer_id = c.customer_id
LEFT JOIN shippers sh
     ON o.shipper_id = sh.shipper_id
JOIN order_statuses os
	 ON o.status = os.order_status_id

-- Self Outer Joins
USE sql_hr;
SELECT e.employee_id, e.first_name, m.first_name
FROM employees e
LEFT JOIN employees m
     ON e.reports_to = m.employee_id