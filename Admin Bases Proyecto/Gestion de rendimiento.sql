set statistics time on 
go 
select IDPRODUCTO,NOMBREPRODUCTO,CANTIDADPRODUCTO,PRECIOUPRODUCTO from producto
go
set statistics time off 
go 

CREATE INDEX indice1 ON dbo.PRODUCTO (NOMBREPRODUCTO); SELECT object_name(IPS.object_id) AS 'objeto',  
   SI.name AS [indice1], 
   index_type_desc,
	avg_fragmentation_in_percent,
	avg_page_space_used_in_percent,
	avg_fragment_size_in_pages,
	fragment_count,
	page_count,
	record_count  
FROM sys.dm_db_index_physical_stats(db_id('proyecto'), NULL, NULL, NULL , 'DETAILED') IPS 
   JOIN sys.indexes SI ON IPS.object_id = SI.object_id AND IPS.index_id = SI.index_id 
WHERE 
avg_fragmentation_in_percent > 0 or
avg_fragment_size_in_pages> 0
ORDER BY avg_fragmentation_in_percent DESC
go

set statistics time on;
--Eliminar registros
set statistics time off;

EXEC sp_MSforeachtable @command1="print 'Reorganizing indexes for ?' ALTER INDEX ALL ON 
? REORGANIZE" 
GO 

EXEC sp_MSforeachtable @command1="print 'Rebuilding indexes for ?' ALTER INDEX ALL ON ? 
REBUILD WITH (FILLFACTOR = 90)" 
GO 

SET SHOWPLAN_ALL ON;
GO

Select  * into #temp from PRODUCTO where PRECIOUPRODUCTO>15
Select * into #temp1 from  SOLICITUDPRODUCCION where CANTIDADPRODUCCION>15
Select * from #temp1 t1, #temp t where t1.IDPRODUCTO=t.IDPRODUCTO 
Go