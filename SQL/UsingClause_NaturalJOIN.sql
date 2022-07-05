-- USING clause
SELECT 
	o.order_id,
    c.first_name,
    sh.name as Shipper
FROM orders o
JOIN customers c
     USING(customer_id)
JOIN shippers sh
     USING(shipper_id)

SELECT *
FROM order_items oi
JOIN order_item_notes oin
     USING(order_id, product_id)

-- Excercise
USE sql_invoicing;
 SELECT p.date, c.name, p.amount, pm.name
 FROM payments p
 JOIN clients c
      USING(client_id)
JOIN payment_methods pm
	 on p.payment_method = pm.payment_method_id

-- Natural JOIN (not prefered could create unexpected results)
SELECt 
	o.order_id,
    c.first_name
FROM orders o
NATURAL JOIN customers c

-- Cross JOIN ( To combine every record from first table with every record of second table i.e cross product of 2 tables)
Select
	c.first_name as customer,
    p.name as product
FROM customers c
CROSS JOIN products p
ORDER BY c.first_name

-- Excercise
SELECT p.name, sh.name
FROM shippers sh, products p

SELECT sh.name, p.name
FROM shippers sh
CROSS JOIN products p

-- UNIONS (combine rows from multiple tables)
SELECT 
	order_id,
    order_date,
    'Active' AS status
FROM orders
WHERE order_date >= '2019-01-01'
UNION
SELECT 
	order_id,
    order_date,
    'Archived' AS status
FROM orders
WHERE order_date < '2019-01-01'

SELECT first_name
from customers
UNION
SELECT name
from shippers

SELECt customer_id, first_name, points, 'Bronze' AS type
FROM customers
WHERE points < 2000
UNION
Select customer_id, first_name, points, 'SILVER' AS type
FROM customers
WHERE points BETWEEN 2000 AND 3000
UNION
Select customer_id, first_name, points, 'Gold' AS type
FROM customers
WHERE points>3000
ORDER BY first_name     

