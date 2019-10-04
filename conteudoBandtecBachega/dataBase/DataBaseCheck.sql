create database petshop;
use petshop;
create table funcionario (
idFunc int primary key auto_increment,
nome varchar(40),
sexo char(1),
check (sexo = 'm' or sexo ='f' or sexo ='n'),
-- no mySQL, versoes anteriores a 8.0.16 usar:
-- sexo enum('m','f','n'),
salario decimal(7,2),
check (salario > 0),
fkSupervisor int,
foreign key(fkSupervisor) references funcionario(idFunc)) auto_increment = 1000;
select * from funcionario;
desc funcionario;
insert into funcionario values
(null,'Maria Aparecida','f',15000,null);
insert into funcionario values
(null,'José da Silva','m',5000,1000);
select * from funcionario;
insert into funcionario values
(null,'João Oliveira','m',2000,1001);
select * from funcionario;
-- exibir os dados dos funcionarios e dos supervisores
-- correspondentes

select * from funcionario as f,funcionario as s where f.fkSupervisor = s.idFunc;