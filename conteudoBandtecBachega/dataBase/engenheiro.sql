create database empresa;
use empresa;
create table engenheiro (
idEngenheiro int primary key auto_increment,
nome varchar(40),
sexo char(1),
check (sexo ='m' or sexo = 'f'),
crea int,
salario decimal(8,2))auto_increment=1;
select * from engenheiro;

create table obra (
idObra int primary key auto_increment,
localObra varchar(20))auto_increment=1000;
select * from obra;

insert into engenheiro values 
(null,'joselito bagunceiro','m',86754934,4000),
(null,'joana crocodilo','f',12345678,5000),
(null,'paulo tosquinho','m',87654321,4500),
(null,'maria fernanda','f',81640921,7500),
(null,'fernando chimpozo','m',87098765,4500),
(null,'ricardo santos','m',56783214,4500);
select * from engenheiro;

insert into obra values
(null,'higienopolis'),
(null,'capao redondo'),
(null,'santa barbara doeste'),
(null,'piraporinha'),
(null,'campinas'),
(null,'salvador'),
(null,'manaus');
select * from obra;

create table dependente (
fkDependente int,
nome varchar(40),
relacionamento varchar(10),
dataNasc date,
idDependente int,
primary key(fkDependente, idDependente));
select * from dependente;
insert into dependente values
(1,'claudia','esposa',19850306,1),
(1,'enzo','filho',20070801,2),
(2,'paulo rogerio','marido',19910704,1),
(3,'valentina','filha',20090902,1),
(4,'joao cherudo','marido',19900707,1),
(5,'ricardo jao','marido',19760308,1);
select * from dependente;

create table trabalha (
fkEngenheiro int,
fkObra int,
bancoHoras time);

insert into trabalha values
(1,1000,2000000),
(2,1001,2000000),
(3,1001,500000),
(4,1002,800000),
(5,1003,950000),
(6,1004,1000000),
(6,1005,1200000),
(4,1006,200000);
select * from trabalha;

alter table trabalha add foreign key (fkEngenheiro) references engenheiro(idEngenheiro);
alter table trabalha add foreign key (fkObra) references obra(idObra);
alter table trabalha add primary key (fkEngenheiro,fkObra);


alter table dependente add foreign key (fkDependente) references engenheiro(idEngenheiro);

-- selects.

select * from engenheiro,dependente where idEngenheiro = idDependente;

select * from engenheiro,dependente where idEngenheiro =1 and idDependente =1; -- errado --
select * from engenheiro,dependente where idEngenheiro = idDependente and engenheiro.nome='joselito bagunceiro';

select * from engenheiro,dependente where idEngenheiro = idDependente and relacionamento like 'filh_';

select obra.*,engenheiro.*,bancoHoras from engenheiro, trabalha, obra where idEngenheiro = fkEngenheiro and idObra = fkObra;

select * from engenheiro, trabalha, obra where fkengenheiro = idEngenheiro and fkobra = idobra and localObra ='capao redondo';
select * from engenheiro, trabalha, obra where fkengenheiro = idEngenheiro and fkobra = idobra and idobra =1001;

select * from engenheiro, dependente, obra, trabalha where idengenheiro = fkdependente and idengenheiro = fkengenheiro and localobra like 'manaus';

