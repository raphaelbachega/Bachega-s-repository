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
delete from Atleta where IdAtleta = 8;
drop table Atleta;