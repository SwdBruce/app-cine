USE Master
GO
IF Exists(SELECT * FROM sysdatabases WHERE name='DBCINE')
	DROP DATABASE  DBCINE
GO
CREATE DATABASE DBCINE;
GO
USE DBCINE;
GO

CREATE TABLE TipoUsuario(
	id INT NOT NULL,
	tipo VARCHAR(50) NOT NULL,
	CONSTRAINT PK_IdTipUser PRIMARY KEY(id)
)
GO

CREATE TABLE Usuario(
	id INT IDENTITY(100001,1) NOT NULL PRIMARY KEY,
	nombres VARCHAR(100) NOT NULL,
	apellidos VARCHAR(100) NOT NULL,
	dni INT NOT NULL,
	correo VARCHAR(100),
	celular INT NOT NULL,
	contrasena VARCHAR(100) NOT NULL,
	tipoId INT NOT NULL,
	FOREIGN KEY (tipoId) REFERENCES TipoUsuario(id)
)
GO

CREATE TABLE Cliente(
	usuarioId INT NOT NULL,
	tarjeta VARCHAR(100)
	FOREIGN KEY (usuarioId) REFERENCES Usuario(id)
)
GO

CREATE TABLE Vendedor(
	usuarioId INT NOT NULL,
	horario VARCHAR(100),
	sueldo DECIMAL(12,2) DEFAULT 0,
	FOREIGN KEY (usuarioId) REFERENCES Usuario(id)
)
GO

CREATE TABLE Pelicula(
	id INT IDENTITY(1001,1) NOT NULL PRIMARY KEY,
	titulo VARCHAR(100) NOT NULL,
	categoria VARCHAR(100) NOT NULL,
	fecha DATE,
	duracion VARCHAR(100),
	idioma VARCHAR(100)
)
GO

CREATE TABLE VentaMetodoPago(
	id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	metodo VARCHAR(100)
)
GO

CREATE TABLE Venta(
	id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	cantidadBoletos INT DEFAULT 0,
	peliculaId INT,
	montoTotal DECIMAL(12,2),
	clienteId INT NOT NULL,
	metodoId INT NOT NULL,
	fecha DATETIME NULL
	FOREIGN KEY (peliculaId) REFERENCES Pelicula(id),
	FOREIGN KEY (clienteId) REFERENCES Usuario(id),
	FOREIGN KEY (metodoId) REFERENCES VentaMetodoPago(id)
)
GO

CREATE TABLE SalaCine(
	id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,

)
GO

CREATE TABLE Butaca(
	id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	estado INT DEFAULT 0
)
GO

CREATE TABLE VentaDetalle(
	id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	ventaId INT NOT NULL,
	butacaId INT NOT NULL,
	tipoDescuento DECIMAL(12,2) DEFAULT 0,
	montoUnitario DECIMAL(12,2) DEFAULT 0
	FOREIGN KEY (ventaId) REFERENCES Venta(id),	
	FOREIGN KEY (butacaId) REFERENCES Butaca(id)	
)
GO

CREATE PROCEDURE spClienteInsert	
	@nombres VARCHAR(100),
	@apellidos VARCHAR(100),
	@dni INT,
	@correo VARCHAR(100),
	@celular INT,
	@contrasena VARCHAR(100),
	@tarjeta VARCHAR(100)
AS
BEGIN 
	DECLARE @last_id INT;
	
	INSERT INTO Usuario (nombres,apellidos,dni,correo,celular,contrasena,tipoId) VALUES (@nombres,@apellidos,@dni,@correo,@celular,@contrasena,2);
	SELECT @last_id = MAX(id) FROM Usuario;
	INSERT INTO Cliente VALUES (@last_id,@tarjeta);
END;
GO

CREATE PROCEDURE spClienteUpdate
	@id INT,
	@nombres VARCHAR(100),
	@apellidos VARCHAR(100),
	@dni INT,
	@correo VARCHAR(100),
	@celular INT,
	@contrasena VARCHAR(100),
	@tarjeta VARCHAR(100)
AS
BEGIN 		
	UPDATE Usuario SET 
		nombres=@nombres,
		apellidos=@apellidos,
		dni=@dni,
		correo=@correo,
		celular=@celular,
		contrasena=@contrasena
	WHERE id=@id;

	UPDATE Cliente SET
		tarjeta=@tarjeta
	WHERE usuarioId=@id;
END;
GO

CREATE PROCEDURE spClienteDelete
	@id INT
AS
BEGIN 		
	DELETE FROM Cliente WHERE usuarioId=@id;
	DELETE FROM Usuario WHERE id=@id;
END;
GO


CREATE PROCEDURE spPeliculaInsert
	@titulo VARCHAR(100),
	@categoria VARCHAR(100),
	@fecha DATE,
	@duracion VARCHAR(100),
	@idioma VARCHAR(100)	
AS
BEGIN 
	
	INSERT INTO Pelicula (titulo,categoria,fecha,duracion,idioma) VALUES (@titulo,@categoria,@fecha,@duracion,@idioma);	
END;
GO

CREATE PROCEDURE spPeliculaUpdate
	@id INT,
	@titulo VARCHAR(100),
	@categoria VARCHAR(100),
	@fecha DATE,
	@duracion VARCHAR(100),
	@idioma VARCHAR(100)
AS
BEGIN 		
	UPDATE Pelicula SET 
		titulo=@titulo,
		categoria=@categoria,
		fecha=@fecha,
		duracion=@duracion,
		idioma=@idioma 
	WHERE id=@id;
END;
GO

CREATE PROCEDURE spPeliculaDelete
	@id INT
AS
BEGIN 			
	DELETE FROM Pelicula WHERE id=@id;
END;
GO
---
-- TIPOS DE USUARIOS
INSERT INTO TipoUsuario VALUES (1,'Vendedor');
INSERT INTO TipoUsuario VALUES (2,'Cliente');

---
-- USUARIOS
INSERT INTO Usuario 
(nombres,apellidos,dni,correo,celular,contrasena,tipoId) VALUES
('Danny Williams','Olivera Ponce',70918000,'danny.olivera@utp.edu.pe',981128129,'123',1);

INSERT INTO Usuario 
(nombres,apellidos,dni,correo,celular,contrasena,tipoId) VALUES
('Julian Eduardo','Torres Perez',70918034,'julian.torres@utp.edu.pe',984228129,'123',2);

-- VENDEDOR
INSERT INTO Vendedor VALUES (100001,'L-S 9:00-18:00',2000);

-- CLIENTE
INSERT INTO Cliente VALUES (100002,'1230-1345-1234-1235');

-- PELICULAS
INSERT INTO Pelicula 
(titulo,categoria,fecha,duracion,idioma) VALUES 
('Thor: Amor y Trueno','Acción','2022-07-11','2:30','Español');