UPDATE servicios
	SET id_conductor=:idConductor, id_cliente=:idCliente, origen=:origen,
	destino=:destino, fecha_servicio=:fechaServicio, valor=:valor, descripcion= :descripcion
	WHERE id = :id;



