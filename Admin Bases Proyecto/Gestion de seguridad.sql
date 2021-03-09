USE proyecto
CREATE ROLE [role_uno] AUTHORIZATION [db_owner]
CREATE ROLE [role_dos] AUTHORIZATION [db_datareader]
CREATE ROLE [role_tres] AUTHORIZATION [db_datawriter]
GO

CREATE LOGIN [UsuarioUno] WITH PASSWORD='Usuarior1', DEFAULT_DATABASE=[proyecto], DEFAULT_LANGUAGE=[Español],
CHECK_EXPIRATION=ON, CHECK_POLICY=ON
CREATE LOGIN [UsuarioDos] WITH PASSWORD='Usuario2', DEFAULT_DATABASE=[proyecto], DEFAULT_LANGUAGE=[Español],
CHECK_EXPIRATION=ON, CHECK_POLICY=ON
CREATE LOGIN [UsuarioTres] WITH PASSWORD='Usuario3', DEFAULT_DATABASE=[proyecto], DEFAULT_LANGUAGE=[Español],
CHECK_EXPIRATION=ON, CHECK_POLICY=ON

CREATE USER [Uno] FOR LOGIN [UsuarioUno] WITH DEFAULT_SCHEMA=[db_owner]
CREATE USER [Dos] FOR LOGIN [UsuarioDos] WITH DEFAULT_SCHEMA=[db_datareader]
CREATE USER [Tres] FOR LOGIN [UsuarioTres] WITH DEFAULT_SCHEMA=[db_datawriter]
GO

execute sp_addrolemember [role_uno], [Uno]

GRANT DELETE TO [role_uno]
GRANT INSERT TO [role_uno]
GRANT SELECT TO [role_uno]
GO

execute sp_addrolemember [role_dos], [Dos]

GRANT SELECT TO [role_dos]
DENY INSERT TO [role_dos]
GO

execute sp_addrolemember [role_tres], [Tres]

GRANT CREATE TABLE TO [role_tres]
GO
