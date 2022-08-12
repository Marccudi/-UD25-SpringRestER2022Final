create table fabricantes(
    codigo int auto_increment,
    nombre varchar(100),
    primary key (codigo)
);

create table articulos(
    codigo int auto_increment,
    nombre varchar(100),
    precio int,
    fabricante int,
    primary key (codigo),
    foreign key (fabricante) references fabricantes(codigo)
);

insert into fabricantes(nombre) values('Marc');
insert into fabricantes(nombre) values('Juan');

insert into articulos(nombre,precio,fabricante) values('Manolo Diaz',1000,1);