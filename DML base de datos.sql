/*DML: Data Manipulation Language*/
--importante: asegurarse de pedir la BD
USE Gerardo
GO
--agregar registro a tabla
--llenar todos los campos del registro:
--en un INSERT se debe incluir los campos obligatorios
--y de los no obligatorios los que Usted quiera llenar
--Si hay un campo IDENTITY ese no se pone en la lista de campos
INSERT Producto(Codigo,Nombre,Costo,PrecioVenta,Existencias,Comentarios)
VALUES('ABC01','Sprite 1L',18,25,100,'Esto es un comentario')
--los VALUES se colocan en el mismo orden que puso la columnas en el INSERT
INSERT Producto(Comentarios,Costo,PrecioVenta,Existencias,Nombre,Codigo)
VALUES('otro comentario',5,8.75,350,'Churrito','XYZ13')
--los campos que permiten NULL se pueden excluir
INSERT Producto(Codigo,Nombre,Costo,PrecioVenta,Existencias)
VALUES('QWE34','Fanta 2L',25,35,7)
--si excluye un campo obligatorio (NOT NULL) no deja insertar
INSERT Producto(Nombre,Costo,PrecioVenta,Existencias)
VALUES('Mirinda 3L',45,55,3)
--se puede hacer varios insert en una sola definicion de columnas
INSERT Producto(Codigo,Nombre,Costo,PrecioVenta,Existencias,Comentarios)
VALUES
('FGH45','Coca Cola 3L',46,60,1250,'Mala para la salud'),
('HYR12','Ranchitas',25,38,0,NULL),
('BHJ22','Escoba',34,80,6,NULL),
('FF123','Whyskas 1Lb',13,25,9,'Alimento gatuno')

--consultar todos los registros de una tabla
SELECT * FROM Producto