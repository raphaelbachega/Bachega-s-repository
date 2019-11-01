create database empresa;
use empresa;
create table engenheiro (
idEngenheiro int primary key auto_increment,
nome varchar(40),
sexo char(1),
check (sexo ='m' or sexo = 'f'),
crea int,
salario decimal(8,2))auto_increment=1;
select * from engenheiro;

create table obra (
idObra int primary key auto_increment,
localObra varchar(20))auto_increment=1000;
select * from obra;

insert into engenheiro values 
(null,'joselito bagunceiro','m',86754934,4000),
(null,'joana crocodilo','f',12345678,5000),
(null,'paulo tosquinho','m',87654321,4500),
(null,'maria fernanda','f',81640921,7500),
(null,'fernando chimpozo','m',87098765,4500),
(null,'ricardo santos','m',56783214,4500);

insert into obra values
(null,'higienopolis'),
(null,'capao redondo'),
(null,'santa barbara doeste'),
