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
CREATE TABLE categoria (
  idcategorias INT NOT NULL AUTO_INCREMENT,
  nomecategoria VARCHAR(120) NOT NULL
)
INSERT INTO categorias (nomecategoria) VALUES 
('Lojas Automotivas'),
('Supermercados e Mercearias'),
('Lojas de Roupas'),
('Restaurantes e Lanchonetes'),
('Farmácias'),
('Lojas de Eletrônicos'),
('Lojas de Móveis'),
('Padarias'),
('Lojas de Artigos Esportivos'),
('Livrarias'),
('Lojas de Brinquedos'),
('Joalherias'),
('Lojas de Calçados'),
('Lojas de Beleza e Cosméticos'),
('Pet Shops'),
('Lojas de Material de Construção'),
('Floriculturas');
