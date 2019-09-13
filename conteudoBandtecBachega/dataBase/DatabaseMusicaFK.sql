create database Música;
use Música;
create table musica (
idMusica int primary key,
titulo varchar (40),
artista varchar (40),
genero Varchar (40) );
select * from musica;

insert into musica values
(1,'Baião por acaso','Nosso trio','Baião/Jazz'),
(2,'Tudo é vaidade','João Alexandre','MPB'),
(3,'Secret Garden','Angra','Progressive Rock'),
(4,'ponteado','Silibrina','Samba/Rock/Jazz/Baião'),
(5,'What about me','SnarkyPuppy','Fusion'),
(6,'Boca de lobo','Criolo','R.A.P'),
(7,'Vaso de Barro','Kivitz','R.A.P/Pop Rock'),
(8,'A Partida e o norte','Estevão Queiroga','MPB');

insert into Musica values
	(9,'Novocaine', 'The Unlikely Candidates', 'Indie'),
    (10,'Here With Me', 'Marshmello', 'Eletronica'),
    (11,'Praia', 'Hotelo', 'Novo MPB'),
    (12,'Jovem', 'Supercombo', 'Novo MPB'),
    (13,'Oh My Dear Lord', 'The Unlikely Candidates', 'Indie'),
    (14,'Friends', 'Marshmello', 'Eletronica'),
    (15,'Recuse me', 'Marshmello', 'Rap / Eletronica'),
    (16,'Eu quero ser como você', 'Jão', 'Novo MPB'),
    (17,'Trouble', 'Cage the Elephant', 'Indie');

select * from musica;
select artista, titulo from musica; -- b 
select * from musica where genero = 'R.A.P'; -- c 
select * from musica where artista = 'Angra'; -- d 
select * from musica order by titulo; -- e 
select * from musica order by artista desc; -- f 
select * from musica where titulo like 'N%'; -- g ( = é exatamente LITERAL enquanto o comando LIKE é aproximado ou como).
select * from musica where artista like '%o'; -- h 
select * from musica where genero like '_o%'; -- i 
select * from musica where titulo like '%m_'; -- j

update musica set genero = 'Eletronica' where idMusica = 15; -- k 
select * from musica;

alter table musica modify titulo varchar(50); 
desc musica; -- l 

alter table musica add ano int;
desc musica;
update musica set ano = (2010) where idMusica =1;
update musica set ano = (1980) where idMusica =2;
update musica set ano = (2010) where idMusica =3;
update musica set ano = (2015) where idMusica =4;
update musica set ano = (2012) where idMusica =5;
update musica set ano = (2016) where idMusica =6;
update musica set ano = (2017) where idMusica =7;
update musica set ano = (2018) where idMusica =8;

alter table musica add país varchar(40);
desc musica;
update musica set país = 'Brasil' where idMusica =1;
update musica set país = 'E.U.A' where idMusica =5;

delete from musica where idMusica =4;

create table Album (
idAlbum int primary key ,
nome varchar (30),
gravadora varchar (30));
select * from album;

insert into album values
(100,'vento bravo','discogs'),
(101,'ao vivo','JAS'),
(102,'secret garden','earMUSIC'),
(103,'o raio','tratore'),
(104,'We Like It Here','groundUP music'),
(105,'boca de lobo','independente'),
(106,'em nome do vento','kivitz'),
(107,'dialogo numero um','sony music entreteriment');

select * from musica;

alter table musica add column fkalbum int;
alter table musica add foreign key (fkalbum) references album (idalbum);
update musica set fkalbum = 100 where idmusica = 1;
update musica set fkalbum = 101 where idmusica = 2;
update musica set fkalbum = 102 where idmusica = 3;
update musica set fkalbum = 103 where idmusica = 4;
update musica set fkalbum = 104 where idmusica = 5;
update musica set fkalbum = 105 where idmusica = 6;
update musica set fkalbum = 106 where idmusica = 7;
update musica set fkalbum = 107 where idmusica = 8;

select * from musica;
select * from album;

select * from musica, album where fkalbum = idalbum;
select * from musica, album where fkalbum = idalbum and album.nome like 'ao vivo';
select * from musica, album where fkalbum = idalbum and album.gravadora like 'JAS';

-- CABO A TABELA.

