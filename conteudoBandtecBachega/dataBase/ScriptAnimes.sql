create database BachegasData;
drop database bachegasbase;
use bachegasdata;
create table Animes (
Id int primary key,
Personagem varchar (40),
Anime varchar (40),
Rival varchar (40) );

select * from Animes;
insert into Anime values
(1,'Naruto Uzumaki','Naruto','Kaguya'),
(2,'Goku','Dragon Ball Super','Jiren'),
(3,'Deku','Boku no Hero','Bakugo'),
(4,'Dio','JOJO','Jotaro'),
(5,'Saitama','One Punch Man','Boros'),
(6,'Meliodas','Nanatsu no Taizai','Starosa');
