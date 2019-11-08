create database exercicio9;
use exercicio9;
create table projeto (
idProjeto int primary key,
nome varchar(40),
descProjeto varchar(40));

create table aluno(
RA int primary key,
nome varchar(40),
telefone char(13),
fkProjeto int,
foreign key (fkprojeto) references projeto(idProjeto),
fkrepresentante int,
foreign key (fkrepresentante) references aluno(ra));

create table acompanhante (
idAcompanhante int,
nome varchar(40),
fkAluno int,
foreign key (fkaluno) references aluno(ra),
primary key (idAcompanhante,fkaluno));
alter table acompanhante add relacao varchar(20);

insert into projeto values
(1,'Corinthians','Tirar nome do serasa'),
(2,'Palmeiras','Maior do mundo');

insert into aluno values
(01192,'Joao silva','98888-9999',1,null),
(01988,'Paulo santos','97777-7777',2,null);
update aluno set fkrepresentante = 1192 where ra = 1988;
select * from aluno;

select * from acompanhante;
insert into acompanhante values
(1,'Araujo mathias',1192,'amigo'),
(1,'Henrica oliveira',1988,'mae');
insert into acompanhante values
(2,'jerisvaldo clebis',1988,'pai');
select * from aluno,projeto where fkprojeto = idprojeto;
select *from aluno, acompanhante where fkaluno = ra;
select * from aluno as a, aluno as r where a.fkrepresentante = r.ra;

select * from aluno, projeto where fkProjeto = idprojeto and projeto.nome = 'palmeiras';

select * from aluno, projeto, acompanhante where fkaluno = ra and fkprojeto = idprojeto;
