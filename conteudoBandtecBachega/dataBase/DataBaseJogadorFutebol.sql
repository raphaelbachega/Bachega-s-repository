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
(null,'Bahia','Roger Machado',19310101),
(null,'Santos','Jorge Sampaoli',19120414),
(null,'Cruzeiro','Rogério Ceni',19210102);
select * from futtime;
select * from jogador;

insert into jogador values
(100,'Meio Campo','Bruno Henrique',983676428,1,null),
(101,'Atacante','Fred',938475683,5,null),
(102,'Zagueiro','Gustavo henrique',76543456,4,null),
(103,'Goleiro','Douglas Friedrich',948572385,3,null),
(104,'Lateral','Diogo Barbosa',765849300,1,null),
(105,'Ponta Direita','Antony',958711209,2,null);

update jogador set fkjogador = 102 where idJogador = 100;
update jogador set fkjogador = 101 where idJogador = 103;
update jogador set fkjogador = 104 where idJogador = 105;
update jogador set fkjogador = 102 where idJogador = 100;
update jogador set fkjogador = 102 where idJogador = 100;




