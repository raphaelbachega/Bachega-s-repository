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




