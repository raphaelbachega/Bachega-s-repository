create database Filme;
use Filme;
create table Filme (
idFilme int primary key,
titulo varchar (40),
genero varchar (30),
diretor varchar (40) );
select * from Filme;
insert into Filme values
(1,'Vingadores','Ação','Anthony e Joel Russo');
insert into Filme (idFilme,titulo) values
(2,'Big Hero 6');
insert into Filme (titulo, idFilme) values
('shrek 2',3);
insert into Filme (idFilme, titulo) values
(4,'Tarzan'),
(5,'Shrek para sempre'),
(6,'Cidade de Deus');
select * from Filme;
update Filme set genero='Animação',
                 diretor='Andrew Adamson'
                 where idFilme in (3, 5);
update Filme set genero='Animação',
                 diretor='Don Hall'
                 where idFilme = 2 or idFilme= 4;
update Filme set genero='drama',
				diretor='Fernando Meirelles'
                where idFilme = 6;
create table Pessoa (
idpessoa int primary key auto_increment,
nome varchar (40),
dataNasc date);
select * from Pessoa;
insert into Pessoa values
(null, 'Maria Oliveira', '2000-05-10');
insert into Pessoa (nome,dataNasc) values
	('Claudia Raia','1990-10-23');
    insert into Pessoa values
    (5,'Antonio Fagundes', '1980-02-15');
    select * from Pessoa;
    insert into pessoa values
    (null,'Mickey', '1950-11-05');
    desc Pessoa;
    describe Filme;
    alter table Pessoa add bairro varchar (30);
    -- Modifica o tamanho da coluna bairro.
    alter table Pessoa modify bairro varchar (45);
    -- Exclui a coluna bairo.
    alter table Pessoa drop bairro ;
    alter table pessoa auto_increment=50;
    insert into pessoa values
    (null, 'minnie', '1960-03-11');
    create table comida (
		idComida int primary key auto_increment,
        nome varchar (40) 
        ) auto_increment=1000;
        insert into comida values (null, 'Pizza com borda de chedar'),
        (null,'Lasanha'),
        (null,'nhoque'),
        (null,'Paçoca');
        select * from Comida;
        select * from Pessoa;
        delete from Pessoa where idpessoa = 7;
        delete from pessoa where idpessoa = 2 and 6;