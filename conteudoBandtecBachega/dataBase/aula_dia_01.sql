create database AlunoDisc;
use AlunoDisc;

-- Cria tabela Aluno
create table Aluno (
   ra int primary key auto_increment,
   nomeAluno varchar(45),
   bairro varchar(45)
) auto_increment = 50000;

-- Cria tabela Disciplina
create table Disciplina (
   idDisc int primary key auto_increment,
   nomeDisc varchar(45)
) auto_increment= 100;

-- Insere dados na tabela Aluno
insert into Aluno values 
  (null, 'Maria Oliveira', 'Paraiso'),
  (null, 'José Silva', 'Itaquera'),
  (null, 'Claudia Souza', 'Jabaquara'),
  (null, 'Mario Bros', 'São Mateus');
select * from Aluno;

-- Insere dados na tabela Disciplina
insert into Disciplina values
  (null, 'Algoritmos'),
  (null, 'Banco de Dados'),
  (null, 'Arquitetura'),
  (null, 'Pesquisa e Inovação');
select * from Disciplina;

-- Cria tabela AlunoDisciplina, tabela associativa entre Aluno e Disciplina
create table AlunoDisciplina (
  fkAluno int,				-- chave estrangeira para Aluno
  foreign key(fkAluno) references Aluno(ra),
  fkDisc int,				-- chave estrangeira para Disciplina
  foreign key(fkDisc) references Disciplina(idDisc),
  perLetivo int,			-- período letivo
  primary key (fkAluno, fkDisc, perLetivo), -- chave primária composta
  media decimal(4,2),       -- média do aluno na disciplina
  qtdFaltas int				-- quantidade de faltas do aluno na disciplina
);  

-- Insere dados na tabela AlunoDisciplina
insert into AlunoDisciplina values (50000,100,20192,3,10),
   (50000,101,20192,10,0), (50000,102,20192,2,5),
   (50001,100,20192,7,2), (50001,101,20192,2,12),
   (50001,103,20192,6.5,5), (50002,100,20192,8.5,7),
   (50002,101,20192,7.5,6), (50002,102,20192,9,0),
   (50003,101,20192,5,7), (50003,102,20192,3.5,15),
   (50003,103,20192,10,0);
select * from AlunoDisciplina;

-- Exibir os dados dos alunos e das disciplinas correspondentes
select * from Aluno,Disciplina,AlunoDisciplina
    where fkAluno=ra and fkDisc=idDisc;
    
-- Exibir os dados dos alunos e da disciplina de Algoritmos
select * from Aluno,Disciplina,AlunoDisciplina
    where fkAluno=ra and fkDisc=idDisc and nomeDisc='Algoritmos';
    
-- Exibir os dados do aluno Mario Bros e suas disciplinas
select * from Aluno,Disciplina,AlunoDisciplina
    where fkAluno=ra and fkDisc=idDisc and nomeAluno='Mario Bros';
    
-- Exibir a soma das médias e a soma das qtdFaltas 
select sum(media), sum(qtdFaltas) from AlunoDisciplina;

-- ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

-- CRIANDO MEDIAS --

-- Exibir a soma das médias e a soma das qtdFaltas, mas dando nome às colunas
select sum(media) as 'Soma das médias', 
   sum(qtdFaltas) as 'Soma das qtd de faltas' from AlunoDisciplina;
   
-- Exibir a média das médias e a média das qtdFaltas
select avg(media) as 'Média das médias',
   avg(qtdFaltas) as 'Média das qtd de faltas' from AlunoDisciplina;
   
-- Exibir a média das médias arrendondada para 2 casas decimais
-- e a média das qtdFaltas   
select round(avg(media),2) as 'Média das médias',
   avg(qtdFaltas) as 'Média das qtd de faltas' from AlunoDisciplina;
   
-- Exibir a maior e a menor média da tabela AlunoDisciplina
select max(media) as 'Maior média', 
       min(media) as 'Menor média' from AlunoDisciplina;
       
-- Exibir a maior e a menor qtdFaltas da tabela AlunoDisciplina
select max(qtdFaltas) as 'Maior qtdFaltas', 
       min(qtdFaltas) as 'Menor qtdFaltas' from AlunoDisciplina;
       
-- Exibir a maior e a menor média agrupado por disciplina
select fkDisc, max(media) as 'Maior média', 
       min(media) as 'Menor média' from AlunoDisciplina
       group by fkDisc;
       
-- Exibir a maior e a menor média agrupado por aluno
select fkAluno, max(media) as 'Maior média', 
       min(media) as 'Menor média' from AlunoDisciplina
       group by fkAluno;
       
-- Exibir as médias da tabela AlunoDisciplina
select media from AlunoDisciplina;

-- Exibir as médias diferentes da tabela AlunoDisciplina
select distinct media from AlunoDisciplina;      
       
-- Exibir a quantidade de médias da tabela AlunoDisciplina
select count(media) as 'Qtd de médias' from AlunoDisciplina; 
      
-- Exibir a quantidade de médias distintas da tabela AlunoDisciplina
select count(distinct media) as 'Qtd de médias distintas' 
      from AlunoDisciplina;
      
-- Criar a tabela curso

create table curso (
idCurso int primary key,
nomeCurso varchar(10),
coordenador varchar(40));

-- insere dados na tabela curso

insert into curso values (1000,'ADS','Gerson'),
(1001,'CCO','Marise'),
(1002,'BD','Leo'),
(1003,'redes','Alex');

-- exibe dados da tabela curso

select * from curso;
select * from aluno;

-- Acrescenta uma coluna de chave estrangeira na tabela aluno
-- fkCurso - referencia a tabela curso

alter table aluno add fkCurso int,
	add foreign key(fkCurso) references curso(idCurso);
    
    -- atribuir valores para a coluna fkCurso
    
    update aluno set fkCurso = 1000 where ra <= 50001;
    update aluno set fkCurso = 1001 where ra = 50002;
    update aluno set fkCurso = 1002 where ra = 50003;
    
    -- insere mais um aluno
    insert into aluno values (null,'Luis fernando','Guarapiranga',null);
    
	-- exibe os alunos e os cursos correspondestes
    
    select * from aluno,curso where idCurso = fkCurso;
    -- idem ao comando anterior usando JOIN
    
    select * from aluno join curso on idCurso = fkCurso;
    select * from aluno inner join curso on idCurso = fkCurso;

-- exibe os alunos e os cursos correspondentes, e
-- os alunos que nao estao associados a nenhum curso

select * from aluno left join curso on idCurso = fkCurso;
    
-- exibe os alunos e os cursos correspondentes, e
-- os cursos que nao estao associados a nenhum curso
select * from aluno right join curso on idCurso = fkCurso;
    
    -- exibe os alunos somente do curso de ADS
select * from aluno, curso where idCurso = fkCurso
							 and nomeCurso = 'ADS';

-- idem ao comando anterios usando JOIN 
select * from aluno join curso on idCurso = fkCurso
							   where nomeCurso = 'ADS';
                               
-- exibe os dados dos alunos e suas disciplinas
-- usando JOIN

select * from aluno join alunoDisciplina on fkaluno = ra
					join disciplina on fkDisc = idDisc;
                    
-- idem ao comando anterior mas somente da disciplina algoritmos

select * from aluno join alunoDisciplina on fkaluno = ra
					join disciplina on fkDisc = idDisc
                    where nomeDisc ='algoritmos';
                    
-- exibe somente as disciplinas do aluno 'mario bros'
select * from aluno join alunoDisciplina on fkaluno = ra
					join disciplina on fkDisc = idDisc
                    where nomeAluno = 'mario bros';

start transaction;

delete from curso where idcurso = 1003;
select * from curso;
rollback;