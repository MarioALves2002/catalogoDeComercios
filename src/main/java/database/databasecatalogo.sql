CREATE DATABASE catalogolj ;

use catalogolj ;

create table catalj (
    id int not null unique auto_increment primary key, 
    nomeloja varchar(100) not null,
    email varchar (100) not null unique,
    tel varchar(20) not null unique ,
    endereco varchar(100) not null,
    bairro varchar(70) not null,
    cidade varchar(60) not null,
    complemento varchar (110)
)
create table adminlogin(
id int not null unique auto_icremente primary key ,
usuario  vachar(25) not null unique ,
senha vachar (25) not null 

)
