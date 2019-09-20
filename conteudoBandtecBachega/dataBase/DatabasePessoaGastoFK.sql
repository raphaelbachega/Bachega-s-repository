create database familia;
use familia;

create table pessoa (
idPessoa int primary key,
nome varchar (40),
dataNasc date,
profissao varchar (20));

select * from pessoa;

insert into pessoa values
(1,'Raphael Bachega',19970701,'Analista de Sistemas'),
(2,'João Pedro',19990315,'Analista de Sistemas'),
(3,'Andrea Bachega',19700413,'Barista'),
(4,'Victor Bachega',19950301,'Engenheiro');

create table gasto (
idGasto int primary key,
dataGasto date,
valor decimal (6,2),
descricao varchar (30));

select * from gasto;

insert into gasto values
(101,20190910, 1800.00,'celular'),
(102,20190507, 300.00,'mercado'),
(103,"2019-07-01", 60.00,'Mac Donalds'),
(104,20190920,15.00,'Ragazzo'),
(105,20190830,1300,'Aluguel'),
(106,20190118,300,'Bicicleta'),
(107,20191030,7.00,'Pepsi');
-- delete from gasto where idGasto >= 0;
-- deleta todo registro onde o idGasto é maior ou igual a 0.
select * from gasto;

select * from pessoa where profissao like 'Barista';

alter table pessoa add fkGasto int;
alter table pessoa add foreign key (fkGasto) references gasto (idGasto);
select * from pessoa;
update pessoa set fkGasto = 101 where idPessoa = 1;
update pessoa set fkGasto = 104 where idPessoa in (2,3);
update pessoa set fkGasto = 106 where idPessoa = 4;
select * from pessoa, gasto where fkGasto = idGasto;
select * from pessoa, gasto where fkGasto = idGasto and nome in ("Raphael Bachega", "João Pedro");