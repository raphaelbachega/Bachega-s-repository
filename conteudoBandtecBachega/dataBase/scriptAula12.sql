create database AlunoDisciplina;
use AlunoDisciplina;
create table aluno (
ra int primary key auto_increment,
nomeAluno varchar(45),
bairro varchar(45))auto_increment = 50000;

create table disciplina (
idDisc int primary key auto_increment,
nomeDisc varchar(45))auto_increment = 100;

insert into aluno values
(null,'Xande erescodó','bahianazes'),
(null,'charlesh firmezinha','itaquera'),
(null,'Craudio azeitona','jarbasquare'),
(null,'mario bros','são mateus');
select * from aluno;

insert into disciplina values
(null,'algoritmos'),
(null,'Banco de Dados'),
(null,'Arquitetura'),
(null,'Pesquisa e inovação');

select * from disciplina;

create table alunoDisciplina (
fkAluno int,
foreign key(fkaluno) references aluno(ra),
fkdisc int,
foreign key(fkDisc) references disciplina(idDisc),
perLetivo int,
primary key (fkAluno, fkDisc, perLetivo),
media decimal(4,2),
qtdFaltas int);

insert into alunoDisciplina values
(50000,100,20192,3,10),
(50000,101,20192,10,0),
(50000,102,20192,2,5),
(50001,100,20192,7,2),
(50001,101,20192,2,12),
(50001,103,20192,6.5,5),
(50002,100,20192,8.5,7),
(50002,101,20192,7.5,6),
(50002,102,20192,9,0),
(50003,101,20192,5,7),
(50003,102,20192,3.5,15),
(50003,103,20192,10,0);

select * from alunoDisciplina;
