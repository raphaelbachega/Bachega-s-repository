create database empresa;
use empresa;
create table empresa (
idEmpresa int primary key auto_increment,
nomeEmpresa varchar(20),
bairro varchar(20))auto_increment =1;

create table funcionarios (
idFunc int primary key auto_increment,
nomeFunc varchar(40),
salario int,
dataNasc date,
fkEmpresa int)auto_increment=100;

insert into empresa values
(null,'mercado sa','sao pororo'),
(null,'Carros novos','vila joao'),
(null,'petshop rato','jardim triste'),
(null,'loja skate','murumbim'),
(null,'rede de pesca','consolamento');

insert into funcionarios values
(null,'joao magro',3000,19930502,1),
(null,'kiq santana',4000,19940609,1),
(null,'rubertu frio',2000,19820708,2),
(null,'claudia trevo',8000,19210909,3),
(null,'maria nascimento',5500,19870102,4),
(null,'claudio fernando',10000,19550503,5);

select * from empresa;

select * from funcionarios;

