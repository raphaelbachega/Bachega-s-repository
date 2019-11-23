create database cinema;
use cinema;

create table diretor(
id_diretor int primary key,
nome_diretor varchar(45),
pais varchar(45),
data_nasc date);
desc diretor;
create table filme(
id_filme int primary key,
nome_filme varchar(45),
genero_filme varchar(45),
fk_diretor int,
foreign key (fk_diretor) references diretor(id_diretor));
desc filme;
create table ator(
id_ator int primary key,
nome_ator varchar(45),
nome_personagem varchar(45),
ganho decimal(8,2),
fk_filme int,
foreign key (fk_filme) references filme(id_filme));
desc ator;
insert into diretor values
(1,'arnaldo','brasil',19850904),
(2,'van nielson','holanda',19480107),
(3,'veron','argentina',19901009);

insert into filme values
(1000,'a volta dos que nao foram','suspense',1),
(1001,'shrek','comedia',2),
(1002,'rosalina','terror',1),
(1003,'o sorriso do banguela','drama',3),
(1004,'aliens terrestres','ficçao cientifica',2);

insert into ator values
(100,'rosangelo','rosangelito',30000.00,1003),
(101,'maria','rampeira',40000.00,1004),
(102,'marcos','chubaca',9000.00,1004),
(103,'pedro','pedrito',10000.00,1000),
(104,'juan','juanito',30000.00,1001),
(105,'valdisney','walt disney',60000.00,1002);

select * from diretor;
select * from filme;
select * from ator;

select * from diretor, filme where id_diretor = fk_diretor;

select * from diretor, filme where id_diretor = fk_diretor and id_diretor =2;

select sum(ganho) from ator;

select min(ganho) MinValor,
	   max(ganho) MaxValor from ator;
       
select f.nome_filme,
		a.nome_personagem,
        a.nome_ator,
        a.ganho from filme as f join ator as a on f.id_filme = a.fk_filme;
        
select f.nome_filme,
		a.nome_personagem,
        a.nome_ator,
        a.ganho from filme as f join ator as a on f.id_filme = a.fk_filme and id_filme =1004;
        
select f.nome_filme,
		d.nome_diretor,
        d.pais,
        d.data_nasc,
		a.nome_personagem,
        a.nome_ator,
        a.ganho from filme as f join ator as a on f.id_filme = a.fk_filme join diretor as d on d.id_diretor = f.fk_diretor;
        
select a.id_ator,
       a.ganho,
        avg(ganho),
		sum(ganho) from ator as a group by 1;
        