create database faculdade;
use faculdade;

create table grupos(
id_grupos int primary key auto_increment,
desc_projeto varchar(45),
nome_grupo varchar(45))auto_increment=1;

create table professor(
id_professor int primary key auto_increment,
nome varchar(45),
disciplina varchar(45))auto_increment=10000;

create table aluno(
ra int primary key,
email varchar(45),
nome varchar(45),
fk_grupo int,
foreign key (fk_grupo) references grupos(id_grupos));

create table avalia(
inicio datetime,
nota decimal(4,2),
fk_professor int,
fk_grupo int,
primary key(fk_professor,fk_grupo),
foreign key (fk_professor) references professor(id_professor),
foreign key (fk_grupo) references grupos(id_grupos));

insert into grupos values
(null,'monitoramento coxinha','coxinhatech'),
(null,'controle de temperatura floral','flowumidity'),
(null,'leitura de produtos de estoque','learningbuy'),
(null,'sensor de estacionamento','teamtech');

insert into aluno values
(2000,'rmulekin@lol.com','ricardo',1),
(2001,'jao@lol.com','joao',2),
(2002,'kazix@lol.com','roberto',3),
(2003,'misslindinha@lol.com','janaina',4),
(2004,'ian@lol.com','ian',1),
(2005,'patrickvrau@lol.com','patrick',2),
(2006,'anan@lol.com','ana',3),
(2007,'jussaragordona@lol.com','jussara',4);

insert into professor values
(null,'tio patinhas','algoritmos'),
(null,'malandrinho','bd'),
(null,'malinha','arq'),
(null,'falamuito','pi'),
(null,'doido','socio');

insert into avalia values
('2019-01-01 12:00:00',7,10001,1),
('2019-01-01 13:00:00',8,10002,2),
('2019-01-01 14:00:00',5,10003,3),
('2019-01-01 15:00:00',6,10004,4),
('2019-01-02 16:00:00',9,10000,1),
('2019-01-02 17:00:00',10,10001,2),
('2019-01-02 18:00:00',9,10002,3),
('2019-01-02 19:00:00',6.5,10003,4);

select * from grupos;
select * from professor;
select * from aluno;
select * from avalia;

select * from grupos, aluno where fk_grupo = id_grupos;

select avg(nota) from avalia;

select min(nota) MinNota,
	   max(nota) MaxNota from avalia;
       
select sum(nota) from avalia;

select * from professor, avalia, grupos where id_professor = fk_professor and id_grupos = fk_grupo;
select * from professor, avalia, grupos where id_professor = fk_professor and id_grupos = fk_grupo limit 2;
select * from professor, avalia, grupos where id_professor = fk_professor and id_grupos = fk_grupo and id_grupos =1;

select * from grupos, avalia, professor where id_professor = fk_professor and id_grupos = fk_grupo and id_professor =10003;

select professor

select * from professor, aluno, avalia, 
