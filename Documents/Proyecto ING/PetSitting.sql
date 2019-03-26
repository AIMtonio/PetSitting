drop database petsitting;
create database petsitting;

use petsitting;

create table tipo(id_tipo int(9)primary key auto_increment,
tipo_mascota varchar(100)not null,
raza varchar(200)not null)Engine=Innodb;

create table control(id_control int(9)primary key auto_increment,
cantidad_alimento double(9,2),
cada_hora int(2),
cantidad_veces int(2))Engine=Innodb;

create table usuario(id_usuario int(9)primary key auto_increment,
nombre varchar(200)not null,
apellidos varchar(200)not null,
numero_celular varchar(10)unique,
correo varchar(200)unique,
usuario varchar(200)not null,
password varchar(200)not null)Engine=Innodb;

create table mascota(id_mascota int(9)primary key auto_increment,
nombre varchar(200)not null,
edad double(9,2),
peso double(9,2),
raza varchar(200)not null,
enfermedad varchar(50),
fecha_creacion date,
tipo_masc varchar(200)not null,
id_usuario int(9),
id_control int(9),
foreign key (id_usuario)references usuario(id_usuario)on update cascade,
foreign key (id_control)references control(id_control)on update cascade)Engine=Innodb;

create table producto(id_producto int(5)primary key auto_increment,
codigo varchar(30)unique,
tipo varchar(30),
status int(5),
id_usuario int(5))Engine=Innodb;

INSERT INTO tipo VALUES(null,"Perro","Labrador");
INSERT INTO tipo VALUES(null,"Perro","Pugs");
INSERT INTO tipo VALUES(null,"Perro","Bulldog Inglés");
INSERT INTO tipo VALUES(null,"Perro","Bulldog Francés");
INSERT INTO tipo VALUES(null,"Perro","Schnauzer");
INSERT INTO tipo VALUES(null,"Perro","Beagle");
INSERT INTO tipo VALUES(null,"Perro","Husky Siberiano");
INSERT INTO tipo VALUES(null,"Perro","Pastor Alemán");
INSERT INTO tipo VALUES(null,"Perro","Chihuahua");
INSERT INTO tipo VALUES(null,"Perro","Pitbull");
INSERT INTO tipo VALUES(null,"Perro","Golden Retriever");
INSERT INTO tipo VALUES(null,"Perro","Dalmata");
INSERT INTO tipo VALUES(null,"Perro","Boxer");
INSERT INTO tipo VALUES(null,"Perro","Cocker Spaniel");
INSERT INTO tipo VALUES(null,"Perro","Weimaraner");
INSERT INTO tipo VALUES(null,"Perro","Braco Aleman");
INSERT INTO tipo VALUES(null,"Perro","Gran Danes");
INSERT INTO tipo VALUES(null,"Perro","Criollo(Cruza)");
INSERT INTO tipo VALUES(null,"Perro","Poodle");
INSERT INTO tipo VALUES(null,"Perro","Rottweiler");
INSERT INTO tipo VALUES(null,"Perro","Cocker");
INSERT INTO tipo VALUES(null,"Perro","Dóberman");
INSERT INTO tipo VALUES(null,"Perro","Bull Terrier");
INSERT INTO tipo VALUES(null,"Perro","French Poodle");
INSERT INTO tipo VALUES(null,"Perro","Otro");
INSERT INTO tipo VALUES(null,"Gato","Abyssinian");
INSERT INTO tipo VALUES(null,"Gato","American Bobtail");
INSERT INTO tipo VALUES(null,"Gato","American Curl");
INSERT INTO tipo VALUES(null,"Gato","American Shorthair");
INSERT INTO tipo VALUES(null,"Gato","American Wirehair");
INSERT INTO tipo VALUES(null,"Gato","Balinese-Javanese");
INSERT INTO tipo VALUES(null,"Gato","Bengal");
INSERT INTO tipo VALUES(null,"Gato","Birman");
INSERT INTO tipo VALUES(null,"Gato","Bombay");
INSERT INTO tipo VALUES(null,"Gato","British");
INSERT INTO tipo VALUES(null,"Gato","Burmese");
INSERT INTO tipo VALUES(null,"Gato","Chartreux");
INSERT INTO tipo VALUES(null,"Gato","Cornish Rex");
INSERT INTO tipo VALUES(null,"Gato","Devon Rex");
INSERT INTO tipo VALUES(null,"Gato","Korat");
INSERT INTO tipo VALUES(null,"Gato","Laperm");
INSERT INTO tipo VALUES(null,"Gato","Maine Coon");
INSERT INTO tipo VALUES(null,"Gato","Manx");
INSERT INTO tipo VALUES(null,"Gato","Ocicat");
INSERT INTO tipo VALUES(null,"Gato","Oriental");
INSERT INTO tipo VALUES(null,"Gato","Savannah");
INSERT INTO tipo VALUES(null,"Gato","Siberian");
INSERT INTO tipo VALUES(null,"Gato","Toyger");
INSERT INTO tipo VALUES(null,"Gato","Tonkinese");
INSERT INTO tipo VALUES(null,"Gato","Cruza");
INSERT INTO tipo VALUES(null,"Gato","Otro");
INSERT INTO tipo VALUES(null,"Conejo","Netherland Dwarf");
INSERT INTO tipo VALUES(null,"Conejo","Conejo Enano(Polish)");
INSERT INTO tipo VALUES(null,"Conejo","Dutch Small");
INSERT INTO tipo VALUES(null,"Conejo","Conejo cabeza de léon");
INSERT INTO tipo VALUES(null,"Conejo","Belier(Conejo de orejas caídas)");
INSERT INTO tipo VALUES(null,"Conejo","Conejo angora inglés");
INSERT INTO tipo VALUES(null,"Conejo","Conejo común");
INSERT INTO tipo VALUES(null,"Conejo","Otro");
INSERT INTO tipo VALUES(null,"Roedor","Rata gris");
INSERT INTO tipo VALUES(null,"Roedor","Rata negra");
INSERT INTO tipo VALUES(null,"Roedor","Cavia porcellus(Cuyo)");
INSERT INTO tipo VALUES(null,"Roedor","Degú");
INSERT INTO tipo VALUES(null,"Roedor","Hámster Dorado");
INSERT INTO tipo VALUES(null,"Roedor","Hámster Ruso");
INSERT INTO tipo VALUES(null,"Roedor","Hámster Enano");
INSERT INTO tipo VALUES(null,"Roedor","Chinchilla de cola larga");
INSERT INTO tipo VALUES(null,"Roedor","Cricetulus Griseus(Hámster Chino)");

INSERT INTO producto VALUES(null,"SDS1020","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1021","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1022","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1023","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1024","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1025","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1026","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1027","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1028","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1029","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1030","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1031","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1032","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1033","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1034","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1035","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1036","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1037","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1038","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1039","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1040","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1041","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1042","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1043","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1044","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1045","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1046","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1047","chico","0",0);
INSERT INTO producto VALUES(null,"SDS1048","chico","0",0);
INSERT INTO producto VALUES(null,"SDG4050","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4051","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4052","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4053","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4054","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4055","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4056","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4057","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4058","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4059","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4061","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4062","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4063","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4064","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4065","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4066","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4067","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4068","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4069","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4070","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4071","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4072","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4073","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4074","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4075","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4076","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4077","mediano","0",0);
INSERT INTO producto VALUES(null,"SDG4078","mediano","0",0);
INSERT INTO producto VALUES(null,"SDM2030","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2031","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2032","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2033","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2034","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2035","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2036","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2037","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2038","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2039","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2040","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2041","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2042","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2043","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2044","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2045","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2046","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2047","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2048","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2049","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2050","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2051","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2052","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2053","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2054","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2055","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2056","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2057","grande","0",0);
INSERT INTO producto VALUES(null,"SDM2058","grande","0",0);

delimiter //
create procedure validarCodigoProducto(in codigoManda varchar(30))
begin
select id_producto, status from producto where codigo=codigoManda;
end //
delimiter ;

delimiter //
create procedure obtenerIdCliente (in usuarioManda varchar(30))
begin
select id_usuario from usuario where usuario=usuarioManda;
end //
delimiter ;

delimiter //
create procedure cambiarEstadoProducto(in codigoManda varchar(30), id_usuarioManda int(5))
begin
update producto set status=1, id_usuario=id_usuarioManda where codigo=codigoManda;
end //
delimiter ;











