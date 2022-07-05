INSERT INTO customers (
	first_name,
    last_name,
    birth_date,
    address,
    city,
    state)
VALUES (
		'AKASH', 
        'YADAV', 
        '2000-07-02', 
        'vikhroli parksite', 
        'MUMBAI', 
        'MA')

--  Insert Multiple rows
INSERT INTO shippers (name)
VALUES ('SHipper1'),
('SHipper2'),
('SHipper3')

-- Excercise
 INSERT INTO products (name, quantity_in_stock, unit_price)
 VALUES ('p1', 2, 10),
		('p2', 3, 20),
		('p3', 4, 30)


-- Inserting Hierarchical rows
INSERT INTO orders (customer_id, order_date, status)
VALUES (1,'2019-01-02', 1);

INSERT INTO order_items
VALUES
	(LAST_INSERT_ID(), 1, 1, 2.95),
    (LAST_INSERT_ID(), 2, 2, 3.95)