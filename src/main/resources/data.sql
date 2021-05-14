INSERT INTO PRODUCT (product_id, name, cost) VALUES (1, 'Eggs', 40);
INSERT INTO PRODUCT (product_id, name, cost) VALUES (2, 'Milk', 20);
INSERT INTO PRODUCT (product_id, name, cost) VALUES (3, 'Bread', 30);
INSERT INTO PRODUCT (product_id, name, cost) VALUES (4, 'Cereal', 60);

INSERT INTO STORE (store_id, name, city) VALUES (1, 'HEB', 'Monterrey');
INSERT INTO STORE (store_id, name, city) VALUES (2, 'Walmart', 'Mexico');
INSERT INTO STORE (store_id, name, city) VALUES (3, 'Sorina', 'Saltillo');
INSERT INTO STORE (store_id, name, city) VALUES (4, 'Superama', 'Toluca');

INSERT INTO CLIENT (client_id, first_name, last_name, email) values (1,'Jose','Hernandez','jhernandez@email.com');
INSERT INTO CLIENT (client_id, first_name, last_name, email) values (2,'Maria','Lopez','mlopez@email.com');
INSERT INTO CLIENT (client_id, first_name, last_name, email) values (3,'Juan','Garcia','jgarcia@email.com');
INSERT INTO CLIENT (client_id, first_name, last_name, email) values (4,'Ana','Guitierrez','jgutierrez@email.com');

INSERT INTO ORDER (client_id, product_id, amount, order_date) values (1,1,1,sysdate);
INSERT INTO ORDER (client_id, product_id, amount, order_date) values (1,2,2,sysdate);

INSERT INTO INVENTORY (store_id, product_id, amount) values (1,1,200);
INSERT INTO INVENTORY (store_id, product_id, amount) values (1,2,200);
INSERT INTO INVENTORY (store_id, product_id, amount) values (1,3,200);
INSERT INTO INVENTORY (store_id, product_id, amount) values (1,4,200);
INSERT INTO INVENTORY (store_id, product_id, amount) values (2,1,300);
INSERT INTO INVENTORY (store_id, product_id, amount) values (2,2,300);
INSERT INTO INVENTORY (store_id, product_id, amount) values (2,3,300);
INSERT INTO INVENTORY (store_id, product_id, amount) values (2,4,300);
INSERT INTO INVENTORY (store_id, product_id, amount) values (3,1,300);
INSERT INTO INVENTORY (store_id, product_id, amount) values (3,2,100);
INSERT INTO INVENTORY (store_id, product_id, amount) values (3,3,200);
INSERT INTO INVENTORY (store_id, product_id, amount) values (4,3,500);
INSERT INTO INVENTORY (store_id, product_id, amount) values (4,4,500);