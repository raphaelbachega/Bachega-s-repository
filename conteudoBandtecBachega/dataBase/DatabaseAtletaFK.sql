create database AtletasBase;
use AtletasBase;
Create table Atleta (
IdAtleta int primary key,
Nome varchar (40),
 Modalidade varchar (40),
 QTD_Medalha int);
 
 desc Atleta;
 -- desc = Decrescente.
 select * from Atleta;
 insert into Atleta values
 (1,'Lionel Messi','Futebol',0),
 (2,'Michael Jordan','Basquete',4),
 (3,'Usain Bolt','Corrida',22),
 (4,'Cesar Cielo','Natação',33),
 (5,'Michael Phelps','Natação',85);
 
 -- comentario
 
 select * from atleta;
 insert into Atleta values
 (6,'Edson Arantes Do Nascimento','Pugilista',4);
 
 delete from Atleta where IdAtleta = 6;

insert into atleta values
(6,'Ronaldinho Gaúcho','Futebol',1),
(7,'LeBron James','Basquete',5),
(8,'Gariel Souza','Corrida',23);
select * from Atleta where IdAtleta > 5;
select Nome,QTD_Medalha from Atleta where IdAtleta = 5;
select * from atleta where Modalidade = 'Natação';
select QTD_Medalha from Atleta order by QTD_Medalha asc;
select * from Atleta where Nome like 'C%';
select * from Atleta where Nome like '%o';
select * from Atleta Where Nome like '%r_';
update Atleta set QTD_Medalha = 5 where IdAtleta =1;
update Atleta set Modalidade = 'Tênis' where IdAtleta = 6;

select * from atleta;
desc atleta;

create table pais (
idPais int primary key,
nome varchar (30),
capital varchar (30));

select * from pais;
 insert into pais values
 (100,'Argentina','Buenos aires'),
 (101,'Brasil','Brasilia'),
 (102,'EUA','Washington dc'),
 (103,'Jamaica','Kingston');
 select * from pais;
 select * from atleta;
 alter table atleta add column fkPais int;
 alter table atleta add foreign key (fkPais) references pais (idPais);
 desc atleta;
 desc pais;
 
 update atleta set fkPais = 100 where idatleta = 1;
 update atleta set fkPais = 101 where idatleta in (4,6,8);
 update atleta set fkPais = 102 where idatleta in (2,5,7);
 update atleta set fkPais = 103 where idatleta = 3;
 
select * from atleta as atl, pais as pa where atl.fkpais = pa.idPais and pa.nome = 'EUA';
select * from atleta as atl, pais as pa where atl.fkpais = pa.idPais and pa.capital = 'Brasilia';
select * from atleta , pais  where atleta.fkpais = pais.idPais and pais.nome ='Jamaica';
select * from atleta , pais  where atleta.fkpais = pais.idPais and pais.nome like 'Jamaica';
-- Usar like para caracteres e = para numeros.
