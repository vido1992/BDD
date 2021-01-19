/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2012                    */
/* Created on:     6/1/2021 11:52:01                            */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ENTRADAREGISTROPRODUCTO') and o.name = 'FK_ENTRADAR_RELATIONS_PROVEEDO')
alter table ENTRADAREGISTROPRODUCTO
   drop constraint FK_ENTRADAR_RELATIONS_PROVEEDO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ENTRADAREGISTROPRODUCTO') and o.name = 'FK_ENTRADAR_RELATIONS_USUARIO')
alter table ENTRADAREGISTROPRODUCTO
   drop constraint FK_ENTRADAR_RELATIONS_USUARIO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('LOTE') and o.name = 'FK_LOTE_RELATIONS_PRODUCTO')
alter table LOTE
   drop constraint FK_LOTE_RELATIONS_PRODUCTO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('LOTE') and o.name = 'FK_LOTE_RELATIONS_ENTRADAR')
alter table LOTE
   drop constraint FK_LOTE_RELATIONS_ENTRADAR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('LOTE') and o.name = 'FK_LOTE_RELATIONS_SECTOR')
alter table LOTE
   drop constraint FK_LOTE_RELATIONS_SECTOR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('LOTE') and o.name = 'FK_LOTE_RELATIONS_SALIDARE')
alter table LOTE
   drop constraint FK_LOTE_RELATIONS_SALIDARE
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('PROVEEDORSOLICITUD') and o.name = 'FK_PROVEEDO_RELATIONS_PRODUCTO')
alter table PROVEEDORSOLICITUD
   drop constraint FK_PROVEEDO_RELATIONS_PRODUCTO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('PROVEEDORSOLICITUD') and o.name = 'FK_PROVEEDO_RELATIONS_PROVEEDO')
alter table PROVEEDORSOLICITUD
   drop constraint FK_PROVEEDO_RELATIONS_PROVEEDO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('SALIDAREGISTRO') and o.name = 'FK_SALIDARE_RELATIONS_SOLICITU')
alter table SALIDAREGISTRO
   drop constraint FK_SALIDARE_RELATIONS_SOLICITU
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('SALIDAREGISTRO') and o.name = 'FK_SALIDARE_RELATIONS_USUARIO')
alter table SALIDAREGISTRO
   drop constraint FK_SALIDARE_RELATIONS_USUARIO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('SOLICITUDPRODUCCION') and o.name = 'FK_SOLICITU_RELATIONS_PRODUCTO')
alter table SOLICITUDPRODUCCION
   drop constraint FK_SOLICITU_RELATIONS_PRODUCTO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('SOLICITUDPRODUCCION') and o.name = 'FK_SOLICITU_RELATIONS_USUARIO')
alter table SOLICITUDPRODUCCION
   drop constraint FK_SOLICITU_RELATIONS_USUARIO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('USUARIO') and o.name = 'FK_USUARIO_RELATIONS_PERSONA')
alter table USUARIO
   drop constraint FK_USUARIO_RELATIONS_PERSONA
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('ENTRADAREGISTROPRODUCTO')
            and   name  = 'RELATIONSHIP_16_FK'
            and   indid > 0
            and   indid < 255)
   drop index ENTRADAREGISTROPRODUCTO.RELATIONSHIP_16_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('ENTRADAREGISTROPRODUCTO')
            and   name  = 'RELATIONSHIP_15_FK'
            and   indid > 0
            and   indid < 255)
   drop index ENTRADAREGISTROPRODUCTO.RELATIONSHIP_15_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('ENTRADAREGISTROPRODUCTO')
            and   type = 'U')
   drop table ENTRADAREGISTROPRODUCTO
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('LOTE')
            and   name  = 'RELATIONSHIP_14_FK'
            and   indid > 0
            and   indid < 255)
   drop index LOTE.RELATIONSHIP_14_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('LOTE')
            and   name  = 'RELATIONSHIP_11_FK'
            and   indid > 0
            and   indid < 255)
   drop index LOTE.RELATIONSHIP_11_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('LOTE')
            and   name  = 'RELATIONSHIP_9_FK'
            and   indid > 0
            and   indid < 255)
   drop index LOTE.RELATIONSHIP_9_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('LOTE')
            and   name  = 'RELATIONSHIP_3_FK'
            and   indid > 0
            and   indid < 255)
   drop index LOTE.RELATIONSHIP_3_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('LOTE')
            and   type = 'U')
   drop table LOTE
go

if exists (select 1
            from  sysobjects
           where  id = object_id('PERSONA')
            and   type = 'U')
   drop table PERSONA
go

if exists (select 1
            from  sysobjects
           where  id = object_id('PRODUCTO')
            and   type = 'U')
   drop table PRODUCTO
go

if exists (select 1
            from  sysobjects
           where  id = object_id('PROVEEDORES')
            and   type = 'U')
   drop table PROVEEDORES
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('PROVEEDORSOLICITUD')
            and   name  = 'RELATIONSHIP_13_FK'
            and   indid > 0
            and   indid < 255)
   drop index PROVEEDORSOLICITUD.RELATIONSHIP_13_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('PROVEEDORSOLICITUD')
            and   name  = 'RELATIONSHIP_2_FK'
            and   indid > 0
            and   indid < 255)
   drop index PROVEEDORSOLICITUD.RELATIONSHIP_2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('PROVEEDORSOLICITUD')
            and   type = 'U')
   drop table PROVEEDORSOLICITUD
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('SALIDAREGISTRO')
            and   name  = 'RELATIONSHIP_10_FK'
            and   indid > 0
            and   indid < 255)
   drop index SALIDAREGISTRO.RELATIONSHIP_10_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('SALIDAREGISTRO')
            and   name  = 'RELATIONSHIP_7_FK'
            and   indid > 0
            and   indid < 255)
   drop index SALIDAREGISTRO.RELATIONSHIP_7_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('SALIDAREGISTRO')
            and   type = 'U')
   drop table SALIDAREGISTRO
go

if exists (select 1
            from  sysobjects
           where  id = object_id('SECTOR')
            and   type = 'U')
   drop table SECTOR
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('SOLICITUDPRODUCCION')
            and   name  = 'RELATIONSHIP_12_FK'
            and   indid > 0
            and   indid < 255)
   drop index SOLICITUDPRODUCCION.RELATIONSHIP_12_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('SOLICITUDPRODUCCION')
            and   name  = 'RELATIONSHIP_8_FK'
            and   indid > 0
            and   indid < 255)
   drop index SOLICITUDPRODUCCION.RELATIONSHIP_8_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('SOLICITUDPRODUCCION')
            and   type = 'U')
   drop table SOLICITUDPRODUCCION
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('USUARIO')
            and   name  = 'RELATIONSHIP_1_FK'
            and   indid > 0
            and   indid < 255)
   drop index USUARIO.RELATIONSHIP_1_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('USUARIO')
            and   type = 'U')
   drop table USUARIO
go

/*==============================================================*/
/* Table: ENTRADAREGISTROPRODUCTO                               */
/*==============================================================*/
create table ENTRADAREGISTROPRODUCTO (
   IDENTRADAP           int                  not null,
   IDUSUARIO            int                  null,
   IDSOLICITUDPROVEEDOR int                  null,
   FECHAENTRADAP        datetime             null,
   OBSERVACIONESENTRADAP varchar(15)          null,
   constraint PK_ENTRADAREGISTROPRODUCTO primary key nonclustered (IDENTRADAP)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_15_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_15_FK on ENTRADAREGISTROPRODUCTO (
IDSOLICITUDPROVEEDOR ASC
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_16_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_16_FK on ENTRADAREGISTROPRODUCTO (
IDUSUARIO ASC
)
go

/*==============================================================*/
/* Table: LOTE                                                  */
/*==============================================================*/
create table LOTE (
   IDLOTE               int                  not null,
   IDENTRADAP           int                  null,
   IDPRODUCTO           int                  null,
   IDREGISTROSALIDA     int                  null,
   IDSECTOR             int                  null,
   OBSERVACION          varchar(10)          null,
   constraint PK_LOTE primary key nonclustered (IDLOTE)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_3_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_3_FK on LOTE (
IDSECTOR ASC
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_9_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_9_FK on LOTE (
IDREGISTROSALIDA ASC
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_11_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_11_FK on LOTE (
IDPRODUCTO ASC
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_14_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_14_FK on LOTE (
IDENTRADAP ASC
)
go

/*==============================================================*/
/* Table: PERSONA                                               */
/*==============================================================*/
create table PERSONA (
   IDPERSONA            int                  not null,
   NOMBREPERSONA        varchar(10)          null,
   APELLIDOPERSONA      varchar(10)          null,
   DIRECIONPERSONA      varchar(15)          null,
   TELEFONOPERSONA      int                  null,
   constraint PK_PERSONA primary key nonclustered (IDPERSONA)
)
go

/*==============================================================*/
/* Table: PRODUCTO                                              */
/*==============================================================*/
create table PRODUCTO (
   IDPRODUCTO           int                  not null,
   NOMBREPRODUCTO       varchar(10)          null,
   DESCRIPCIONPRODUCTO  varchar(10)          null,
   PRECIOUPRODUCTO      money                null,
   CANTIDADPRODUCTO     int                  null,
   FECHAVPRODUCTO       datetime             null,
   constraint PK_PRODUCTO primary key nonclustered (IDPRODUCTO)
)
go

/*==============================================================*/
/* Table: PROVEEDORES                                           */
/*==============================================================*/
create table PROVEEDORES (
   IDPROVEEDOR          int                  not null,
   NOMBREPROVEEDOR      varchar(10)          null,
   DIRECCIONPROVEEDOR   varchar(15)          null,
   TELEFONOPROVEEDOR    varchar(10)          null,
   constraint PK_PROVEEDORES primary key nonclustered (IDPROVEEDOR)
)
go

/*==============================================================*/
/* Table: PROVEEDORSOLICITUD                                    */
/*==============================================================*/
create table PROVEEDORSOLICITUD (
   IDSOLICITUDPROVEEDOR int                  not null,
   IDPROVEEDOR          int                  null,
   IDPRODUCTO           int                  null,
   CANTIDADSOLICITUDP   int                  null,
   FECHASOLICITUDP      datetime             null,
   constraint PK_PROVEEDORSOLICITUD primary key nonclustered (IDSOLICITUDPROVEEDOR)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_2_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_2_FK on PROVEEDORSOLICITUD (
IDPROVEEDOR ASC
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_13_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_13_FK on PROVEEDORSOLICITUD (
IDPRODUCTO ASC
)
go

/*==============================================================*/
/* Table: SALIDAREGISTRO                                        */
/*==============================================================*/
create table SALIDAREGISTRO (
   IDREGISTROSALIDA     int                  not null,
   IDUSUARIO            int                  null,
   IDSOLICITUDPRODUCCION int                  null,
   FECHAREGISTROSALIDA  datetime             null,
   OBSERVACIONESSALIDA  varchar(15)          null,
   constraint PK_SALIDAREGISTRO primary key nonclustered (IDREGISTROSALIDA)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_7_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_7_FK on SALIDAREGISTRO (
IDUSUARIO ASC
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_10_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_10_FK on SALIDAREGISTRO (
IDSOLICITUDPRODUCCION ASC
)
go

/*==============================================================*/
/* Table: SECTOR                                                */
/*==============================================================*/
create table SECTOR (
   IDSECTOR             int                  not null,
   DESCRIPCIONSECTOR    varchar(15)          null,
   STOCKSECTOR          int                  null,
   constraint PK_SECTOR primary key nonclustered (IDSECTOR)
)
go

/*==============================================================*/
/* Table: SOLICITUDPRODUCCION                                   */
/*==============================================================*/
create table SOLICITUDPRODUCCION (
   IDSOLICITUDPRODUCCION int                  not null,
   IDUSUARIO            int                  null,
   IDPRODUCTO           int                  null,
   CANTIDADPRODUCCION   int                  null,
   FECHAPRODUCCION      datetime             null,
   constraint PK_SOLICITUDPRODUCCION primary key nonclustered (IDSOLICITUDPRODUCCION)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_8_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_8_FK on SOLICITUDPRODUCCION (
IDUSUARIO ASC
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_12_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_12_FK on SOLICITUDPRODUCCION (
IDPRODUCTO ASC
)
go

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO (
   IDUSUARIO            int                  not null,
   IDPERSONA            int                  null,
   LOGINUSUARIO         varchar(10)          null,
   PASSWORDUSUARIO      varchar(8)           null,
   PRIVILEGIOSUSUARIO   char(1)              null,
   constraint PK_USUARIO primary key nonclustered (IDUSUARIO)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_1_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_1_FK on USUARIO (
IDPERSONA ASC
)
go

alter table ENTRADAREGISTROPRODUCTO
   add constraint FK_ENTRADAR_RELATIONS_PROVEEDO foreign key (IDSOLICITUDPROVEEDOR)
      references PROVEEDORSOLICITUD (IDSOLICITUDPROVEEDOR)
go

alter table ENTRADAREGISTROPRODUCTO
   add constraint FK_ENTRADAR_RELATIONS_USUARIO foreign key (IDUSUARIO)
      references USUARIO (IDUSUARIO)
go

alter table LOTE
   add constraint FK_LOTE_RELATIONS_PRODUCTO foreign key (IDPRODUCTO)
      references PRODUCTO (IDPRODUCTO)
go

alter table LOTE
   add constraint FK_LOTE_RELATIONS_ENTRADAR foreign key (IDENTRADAP)
      references ENTRADAREGISTROPRODUCTO (IDENTRADAP)
go

alter table LOTE
   add constraint FK_LOTE_RELATIONS_SECTOR foreign key (IDSECTOR)
      references SECTOR (IDSECTOR)
go

alter table LOTE
   add constraint FK_LOTE_RELATIONS_SALIDARE foreign key (IDREGISTROSALIDA)
      references SALIDAREGISTRO (IDREGISTROSALIDA)
go

alter table PROVEEDORSOLICITUD
   add constraint FK_PROVEEDO_RELATIONS_PRODUCTO foreign key (IDPRODUCTO)
      references PRODUCTO (IDPRODUCTO)
go

alter table PROVEEDORSOLICITUD
   add constraint FK_PROVEEDO_RELATIONS_PROVEEDO foreign key (IDPROVEEDOR)
      references PROVEEDORES (IDPROVEEDOR)
go

alter table SALIDAREGISTRO
   add constraint FK_SALIDARE_RELATIONS_SOLICITU foreign key (IDSOLICITUDPRODUCCION)
      references SOLICITUDPRODUCCION (IDSOLICITUDPRODUCCION)
go

alter table SALIDAREGISTRO
   add constraint FK_SALIDARE_RELATIONS_USUARIO foreign key (IDUSUARIO)
      references USUARIO (IDUSUARIO)
go

alter table SOLICITUDPRODUCCION
   add constraint FK_SOLICITU_RELATIONS_PRODUCTO foreign key (IDPRODUCTO)
      references PRODUCTO (IDPRODUCTO)
go

alter table SOLICITUDPRODUCCION
   add constraint FK_SOLICITU_RELATIONS_USUARIO foreign key (IDUSUARIO)
      references USUARIO (IDUSUARIO)
go

alter table USUARIO
   add constraint FK_USUARIO_RELATIONS_PERSONA foreign key (IDPERSONA)
      references PERSONA (IDPERSONA)
go

