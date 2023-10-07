CREATE DATABASE catalogo_comercios;

use catalogo_comercios;

create table empresas (
    id int not null unique auto_increment primary key, 
    nome varchar(100) not null,
    email varchar (100) not null unique,
    telefone varchar(20) not null unique,
    endereco varchar(100) not null,
    bairro varchar(70) not null,
    cidade varchar(60) not null,
    complemento varchar(110)
);

create table administradores (
    id int not null unique auto_increment primary key,
    login varchar(25) not null unique,
    senha varchar(32) not null
);
