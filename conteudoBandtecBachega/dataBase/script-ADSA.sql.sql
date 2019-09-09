create database adsa;
use adsa;
create table Aluno (
 ra int primary key,
 nome varchar(40),
 bairro varchar(40)
 );
 select * from Aluno;
 insert into aluno values
 (01192079,'Raphael Bachega','Vila Bancária');
 insert aluno values 
 (01192124,'Roberto','Jardim Primavera'),
 (01192123,'Ranyery','Jardim Audir'),
 (01192053,'Naomi','Vila Leopoldina'),
 (01192089,'Ricardo','Jardim Alzira');
 select nome from Aluno;
 select nome,bairro from aluno;
 select * from aluno;
 select * from aluno where ra = 01192089;
 select bairro,ra from aluno;
 select * from aluno where ra >=1192089;
 select * from aluno where ra <>1192089;
 select * from aluno where ra !=1192089;
 -- exibe os alunos cujo o nome começa com a letra r
 select * from aluno where nome like 'R%';
 -- exibe os alunos cujo bairo começa com vila
 select * from aluno where bairro like 'Vila%';
 -- exibe os alunos cujo nome termina com o
 select * from aluno where nome like '%o';
 -- exibe os alunos cujo o nome tenha a letra i como 2ª letra
 select * from aluno where nome like '_i%';
 -- exibe os alunos cujo o bairro tenha a primeira palavra terminada em m
 select * from Aluno where bairro like '%m %';
 -- exibe os alunos cujo o bairro teha a terceira letra e como a 3ª letra de tras pra frente
 select * from aluno where bairro like '%e__';
 select * from aluno ;
 select * from aluno order by nome;
 select * from aluno order by nome desc;
 select * from aluno order by bairro;
 insert into aluno values 
 (01192109,'Satanael','Vila leopoldina');
 select * from aluno order by bairro,nome desc;
 select * from aluno where bairro = 'Vila leopoldina';
 select * from aluno where nome not like 'R%';
 select * from aluno;
 update aluno set nome = 'Roberto Volpe'
	where ra = 1192124;
update aluno set ra=1192999, bairro='Marechal Deodoro'
	where ra = 1192109;
    -- exclui o aluno Satanael
    delete from aluno where ra = 1192999;
     insert into aluno values 
 (01192109,'Satanael','Vila leopoldina');
 select * from aluno;
 select * from aluno where ra between 1192060 and 1192120;
 select * from aluno where ra >=1192060 and
						  ra <=1192120;