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
--Utilice * solo en caso de estar explorando los campos y registros de una tabla
SELECT * FROM Producto
--Cuando ya se pasa a un ambiente de produccion, se evita usar * en los SELECT
--y se debe de colocar los nombres de los campos a consultar, si son todos pues en lugar de poner *
--se deben de nombrar:
SELECT ProductoID, Codigo, Nombre, Costo, PrecioVenta, Existencias, Comentarios FROM Producto
--cual es la diferencia entre colocar * y nombrar cada campo?
--que cuando Usted consulta usando *, el servidor hace una consulta extra de los METADATOS de la tabla
--para saber que campos hay en la tabla, esto a menor escala no impacta en los recursos del servidor;
--pero a gran escala si.
--Ustedes tambien pueden elegir que columnas necesitan consultar:
SELECT Codigo, Nombre, PrecioVenta FROM Producto
SELECT Nombre, Costo, PrecioVenta, Existencias FROM Producto
--Podemos usar apodos o alias a los campos:
SELECT ProductoID as Correlativo, Codigo, Nombre as [Nombre del Producto], PrecioVenta as [Precio de Venta] FROM Producto
--Podemos hacer campos calculados los cuales se van generar en tiempo real al momento de la consulta
--ademas de que puede tener una instruccion de SQL en varios renglones
SELECT	Codigo, Nombre, Costo, PrecioVenta,
		PrecioVenta-Costo as Ganancia, PrecioVenta*0.15 as ISV,
		POWER(PrecioVenta,2) as [Precio de Venta Al Cuadrado],
		SQRT(Costo) as [Raiz Cuadrada del Costo],
		(PrecioVenta-Costo)/Costo as [Calculo Raro]
FROM Producto
--mostrar los primeros 5 registros de la tabla Producto
SELECT TOP(5) * FROM Producto
SELECT TOP(5) Codigo, Nombre, Comentarios FROM Producto
SELECT TOP(5) Codigo, Nombre, PrecioVenta-Costo as Ganancia FROM Producto

--sumar todos los valores de Costo de toda la tabla
SELECT SUM(Costo) as [Suma Total] FROM Producto
--sumar el Costo promedio de toda la tabla
SELECT AVG(Costo) as Promedio FROM Producto

--a partir de aqui usaremos la columna Disponible, no olviden agregarla al a BD (sale en el archivo donde hicimos el DDL)
--Si en un Campo hay NULL, podemos cambiar esos NULL por algun valor al gusto a la hora de la consulta
--internamente siguen siendo NULL
SELECT Codigo, Nombre, ISNULL(Comentarios,'No tiene comentarios'), ISNULL(Disponible,0)
FROM Producto

--colocar 1 al campo Disponible de todos los registros de la tabla Producto
UPDATE Producto SET Disponible = 1

