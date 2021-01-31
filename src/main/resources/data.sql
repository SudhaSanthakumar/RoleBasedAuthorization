--for the password using online bcrypt encoder, encode your password 
--and then use it here prefixed with {bcrypt}

INSERT INTO USER (user_id,user_name,password,role) VALUES (
   1, 'Sam','{bcrypt}$2y$12$946HuJr2jwqLLe5wqwJBJeupc.TS/3MdUFXDnqGpbVh8VfW5T6dZW','admin');

INSERT INTO USER (user_id,user_name,password,role) VALUES (
   2, 'Gaby','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user'); 
   
INSERT INTO USER (user_id,user_name,password,role) VALUES (
   3, 'Tim','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user'); 
   
INSERT INTO USER (user_id,user_name,password,role) VALUES (
   4, 'Jim','{bcrypt}$2y$12$946HuJr2jwqLLe5wqwJBJeupc.TS/3MdUFXDnqGpbVh8VfW5T6dZW','admin');

INSERT INTO USER (user_id,user_name,password,role) VALUES (
   5, 'Bob','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','manager'); 
   
INSERT INTO USER (user_id,user_name,password,role) VALUES (
   6, 'Pam','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user'); 
   
INSERT INTO USER (user_id,user_name,password,role) VALUES (
   7, 'Ava','{bcrypt}$2y$12$946HuJr2jwqLLe5wqwJBJeupc.TS/3MdUFXDnqGpbVh8VfW5T6dZW','admin');

INSERT INTO USER (user_id,user_name,password,role) VALUES (
   8, 'Ben','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user'); 
   
INSERT INTO USER (user_id,user_name,password,role) VALUES (
   9, 'Tim','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user'); 
   
INSERT INTO USER (user_id,user_name,password,role) VALUES (
   10, 'Gin','{bcrypt}$2y$12$946HuJr2jwqLLe5wqwJBJeupc.TS/3MdUFXDnqGpbVh8VfW5T6dZW','admin');

INSERT INTO USER (user_id,user_name,password,role) VALUES (
   11, 'Cal','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user'); 
   
INSERT INTO USER (user_id,user_name,password,role) VALUES (
   13, 'Don','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user'); 
   
INSERT INTO USER (user_id,user_name,password,role) VALUES (
   12, 'Jac','{bcrypt}$2y$12$946HuJr2jwqLLe5wqwJBJeupc.TS/3MdUFXDnqGpbVh8VfW5T6dZW','admin');

INSERT INTO USER (user_id,user_name,password,role) VALUES (
   14, 'Gabie','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user'); 
   
INSERT INTO USER (user_id,user_name,password,role) VALUES (
   15, 'Jen','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user'); 
   


INSERT INTO car (car_id,car_name,price,brand, owner) VALUES (1, 'Veloster',18600 , 'Hyundai','Sam');
INSERT INTO car (car_id,car_name,price,brand, owner) VALUES (5, 'Palisade',32525 , 'Hyundai','Gaby');
INSERT INTO car (car_id,car_name,price,brand, owner) VALUES (2, 'price X', 79990, 'Tesla','Sam');
INSERT INTO car (car_id,car_name,price,brand, owner) VALUES (3, 'Camry',24970 , 'Toyota','Gaby');
INSERT INTO car (car_id,car_name,price,brand, owner) VALUES (4, 'Navigator',76185, 'Lincoln','Sam');
INSERT INTO car (car_id,car_name,price,brand, owner) VALUES (6,  'A Class',45850, 'Mercedes-Benz','Gaby');
  
   
