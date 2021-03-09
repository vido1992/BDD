
--Full back up 
BACKUP DATABASE [pedidos] TO DISK ='C:\Program Files (x86)\Microsoft SQL Server\MSSQL10.SQLEXPRESS\MSSQL\Backup\pedidos_lab09.bak'
WITH NOINIT, NAME = 'Pedidos-Full Database Backup', STATS = 10
GO

--Transaction logs Medio dia
BACKUP LOG [pedidos] TO DISK = 'C:\Program Files (x86)\Microsoft SQL Server\MSSQL10.SQLEXPRESS\MSSQL\Backup\Pedidos_Lab_logs_Lunes_medio_dia.bak'
WITH NOINIT, NAME = 'Pedidos_Lab-Full Database Backup', SKIP, STATS = 10
GO

--Transaction logs Fin de dia
BACKUP LOG [pedidos] TO DISK = 'C:\Program Files (x86)\Microsoft SQL Server\MSSQL10.SQLEXPRESS\MSSQL\Backup\Pedidos_Lab_logs_Lunes_final_jornada.bak'
WITH NOINIT, NAME = 'Pedidos_Lab-Full Database Backup', SKIP, STATS = 10
GO

--Differential Backup
BACKUP DATABASE [pedidos] TO DISK = 'C:\Program Files (x86)\Microsoft SQL Server\MSSQL10.SQLEXPRESS\MSSQL\Backup\Pedidos_Lab09_Diff_Lunes.bak'
WITH DIFFERENTIAL ,NOINIT, NAME = 'Pedidos_Lab-Full Database Backup', SKIP, STATS = 10
GO