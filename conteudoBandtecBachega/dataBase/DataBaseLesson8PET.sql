create database pet;
use pet;
create table cliente (
idCliente int primary key auto_increment,
sexo char(1),
check (sexo= 'm' or sexo= 'f' or sexo= 'n'),
bairo varchar(40),
nome varchar(40),
telefone int) auto_increment= 0;
select * from cliente;
insert into cliente values 
(null,'f','tatuape','Isabela',965433456),
(null,'m','Cerâmica','Arthur',998766789),
(null,'m','Vila florida','Kaique',923455432),
(null,'m','Casa grande','Daniel',947565647),
(null,'m','Tonato','Jorel',964534563),
(null,'f','Jardim Novo','Eduarda',927359503),
(null,'f','Vila leopoldina','Naomi',983746574);

create table pet (
idPet int primary key auto_increment,
nome varchar(40),
DataNasc date,
raça varchar(20),
animal varchar(30))auto_increment=100;
select * from pet;

insert into pet values
(null,'Miller','20170801','Angorá','Gato'),
(null,'Frodo','20190416','Spitz alemão','Cachorro'),
(null,'Nicodemus','20050314','Labrador','Cachorro'),
(null,'Kaique','20020930','Chimpanzé','Macaco'),
(null,'César','20190419','SRD','Gato'),
(null,'Jarbas','20181102','SRD','Cachorro'),
(null,'Jussara','19210202','SRD','Galinha'),
(null,'Victória','19900909','SRD','Papagaio');

alter table pet add column fkCliente int;
alter table pet add foreign key (fkCliente) references cliente (idCliente);
desc pet;
select * from pet;
select * from cliente;
update pet set fkCliente = 1 where idPet = 101;
update pet set fkCliente = 2 where idPet = 102;
update pet set fkCliente = 3 where idPet = 103;
update pet set fkCliente = 4 where idPet = 104;
update pet set fkCliente = 5 where idPet = 105;
update pet set fkCliente = 6 where idPet = 106;
update pet set fkCliente = 7 where idPet = 107;
desc cliente;
select * from pet where animal like 'Cachorro';
select * from pet;
alter table cliente modify nome varchar(20);
delete from pet where idPet = 100;
drop table pet;
drop table cliente;