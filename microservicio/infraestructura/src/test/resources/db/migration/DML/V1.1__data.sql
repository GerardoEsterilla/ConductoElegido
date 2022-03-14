INSERT INTO vehiculos( marca, modelo, placa , id_cliente)
VALUES ('Chevrolet','2022', 'FXC123', 1);

INSERT INTO conductores( nombre, apellido, fecha_nacimiento , cedula, email,telefono,foto)
	VALUES ('test','test', now(), 'test', 'test','test', 'test');

INSERT INTO clientes( nombre, apellido, fecha_nacimiento , cedula, email)
    	VALUES ('test','test', now(), 'test', 'test');

INSERT INTO estados_servicios(estados_servicio, servicios_id)
       	VALUES ( 'EstadoTest', 1);


INSERT INTO servicios(id_conductor, id_cliente, origen, destino, fecha_servicio, valor, descripcion)
	VALUES (1, 1,'A','B',now(),1 ,'ViajeTest' );