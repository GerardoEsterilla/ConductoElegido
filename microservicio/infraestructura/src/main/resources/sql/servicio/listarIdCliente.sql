SELECT id, id_conductor as idConductor, id_cliente as idCliente, origen, destino, fecha_servicio as fechaServicio, valor, descripcion
    	FROM servicios
    	Where id_cliente = :idCliente;