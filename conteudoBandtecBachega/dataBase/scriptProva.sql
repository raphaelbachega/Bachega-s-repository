create database Programa;
use Programa;
create table Programa (
idPrograma int primary key,
nome varchar (40),
genero varchar (30),
emissora varchar (20) );

select * from programa;

insert into programa values
(1,'Faustão','entreterimento','Globo'),
(2,'The noite','humor','SBT'),
(3,'Praca e nossa','humor','SBT'),
(4,'Zorra total','humor','Globo'),
(5,'Jô','entreterimento','Globo'),
(6,'Jornal da globo','jornalismo','Globo'),
(7,'Jornal da record','jornalismo','Globo');

select * from programa;

select * from programa where emissora ='Globo';

select * from programa where genero ='humor';

select * from programa order by genero;

select * from programa order by nome desc;

select * from programa where nome like '%o';

select * from programa where genero like 'j%';

select * from programa where emissora like '_B%';

select * from programa where nome like '%a_';

update programa set emissora = 'band' where idPrograma =4; 

delete from programa where idPrograma =4;

select * from programa;

drop table programa;
