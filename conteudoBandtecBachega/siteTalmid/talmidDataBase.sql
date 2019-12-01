create database talmid;
use talmid;

create table usuarios(
id_usuarios int primary key auto_increment,
nome varchar(45),
login varchar(45),
senha varchar(45),
interesse varchar(45))auto_increment = 1;