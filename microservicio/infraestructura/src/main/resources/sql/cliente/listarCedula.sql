SELECT id, nombre, apellido, fecha_nacimiento as fechaNacimiento, cedula, email
	FROM clientes
	WHERE cedula LIKE :cedula


