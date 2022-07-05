-- Copy data from one table to another table
CREATE TABLE orders_archived AS
SELECT * FROM orders

-- INSERT INTO orders_archived
SELECT * 
FROM orders
WHERE order_date < '2019-01-01'


-- Excercise
CREATE TABLE invoices_archived AS
SELECT 
	i.invoice_id,
    i.number,
    c.name,
    invoice_total,
    payment_total,
    invoice_date,
    due_date,
    payment_date
FROM invoices i
JOIN clients c
	 ON i.client_id = c.client_id
WHERE payment_date IS NOT NULL



--  Update Table
UPDATE invoices
SET
	payment_total = invoice_total*0.5,
    payment_date = due_date
WHERE client_id IN 
	(SELECT client_id
	FROM clients
	WHERE state IN ('CA', 'NY')
    )
	





			





