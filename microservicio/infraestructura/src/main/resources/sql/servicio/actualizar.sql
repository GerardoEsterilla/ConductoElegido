UPDATE servicios
	SET id_conductor=:id_conductor, id_cliente=:id_cliente, origen=:origen,
	destino=:destino, fecha_servicio=:fechaServicio, valor=:valor, descripcion= :descripcion
	WHERE id = :id;



