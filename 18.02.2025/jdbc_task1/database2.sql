use testdb;
CREATE TABLE IF NOT EXISTS products (
			id INT PRIMARY KEY AUTO_INCREMENT, 
                pname VARCHAR(50), 
                price DOUBLE);
insert into products values(1,Laptop,5000);
insert into products values(2,Lap,5);
select * from products;