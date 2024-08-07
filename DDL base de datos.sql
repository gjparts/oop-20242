/*DDL: Data Definition Language*/
--Crear la base de datos
CREATE DATABASE Gerardo
GO
--Borrar la base de datos
--DROP DATABASE Gerardo
--GO
--Usar la base de datos
USE Gerardo
GO
--crear una tabla
/*NOT NULL = dato obligatorio
NULL = dato opcional*/
CREATE TABLE Producto(
	ProductoID bigint NOT NULL IDENTITY(1,1), --campo autonumerico
	Codigo VARCHAR(20) NOT NULL,
	Nombre VARCHAR(150) NOT NULL,
	Costo DECIMAL(12,2) NOT NULL,
	PrecioVenta DECIMAL(12,2) NOT NULL,
	Existencias DECIMAL(12,2) NOT NULL,
	Comentarios TEXT NULL,
	PRIMARY KEY(ProductoID) --llave primaria: gace unico al registro
)
GO

--borrar una tabla
DROP TABLE Producto
GO

--vaciar una tabla (eliminar sus registros, sin borrarla)
TRUNCATE TABLE Producto
GO

--alterar una columna existente en una tabla
ALTER TABLE Producto
ALTER COLUMN Nombre VARCHAR(255) NOT NULL
GO

--agregar una columna a la tabla
ALTER Table Producto
ADD Disponible BIT NULL

--alterar una columna para que NO ACEPTE NULL
ALTER TABLE Producto
ALTER COLUMN Disponible BIT NOT NULL

--alterar una columna para que SI ACEPTE NULL
ALTER TABLE Producto
ALTER COLUMN Disponible BIT NULL