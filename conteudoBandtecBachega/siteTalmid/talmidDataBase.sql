create database talmid;
use talmid;

create table usuario(
id_usuario int primary key auto_increment,
nome varchar(45),
login_usuario varchar(45),
senha varchar(45),
interesse varchar(45))auto_increment = 1;