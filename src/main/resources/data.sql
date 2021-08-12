DROP table if exists trabajadores;

create table trabajadores(
id int auto_increment,
nombre varchar(250),
trabajo varchar(250),
salario double,
fecha date);

insert into trabajadores (nombre, trabajo, salario, fecha) values ('Manuel', 'ENCARGADO', '20000', now());
insert into trabajadores (nombre, trabajo, salario, fecha) values ('Paula', 'COORDINADOR', '30000', now());
insert into trabajadores (nombre, trabajo, salario, fecha) values ('Carlos', 'PEON', '17000', now());
insert into trabajadores (nombre, trabajo, salario, fecha) values ('Alberto', 'DIRECTOR', '37000', now());



