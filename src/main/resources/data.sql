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
INSERT INTO CLIENT (client_id, first_name, last_name, email) values (4,'Ana','Gutierrez','agutierrez@email.com');

/*INSERT INTO PRODUCTORDER (client_id, product_id) values (1,1);
INSERT INTO PRODUCTORDER (client_id, product_id) values (1,2);
INSERT INTO PRODUCTORDER (client_id, product_id) values (1,3);*/

INSERT INTO PRODUCTORDER (client_id, product_id, date, quantity) values (1,1,sysdate,10);
INSERT INTO PRODUCTORDER (client_id, product_id, date, quantity) values (1,2,sysdate,5);
INSERT INTO PRODUCTORDER (client_id, product_id, date, quantity) values (1,3,sysdate,15);

