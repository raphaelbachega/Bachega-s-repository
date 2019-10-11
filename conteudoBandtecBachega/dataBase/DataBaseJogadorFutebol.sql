create database PraticaJogador;
use PraticaJogador;
create table futTime (
idTime int primary key auto_increment,
nome varchar (30),
nomeTecnico varchar(40),
dataForm date)auto_increment=1;
select * from futtime;

create table jogador (
idJogador int primary key,
posicao varchar(20),
nome varchar(40),
telefone int,
fkTime int,
foreign key (fktime) references futtime(idtime),
fkjogador int,
foreign key (fkjogador) references jogador(idjogador));
select * from jogador;

insert into futtime values
(null,'Palmeiras','Mano Menezes',19140826),
(null,'São Paulo','Fernando Diniz',19300127),