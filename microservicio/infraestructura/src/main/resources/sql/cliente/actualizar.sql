UPDATE clientes
	SET nombre=:nombre, apellido=:apellido, fecha_nacimiento=:fechaNacimiento,
	cedula=:cedula, email=:email
	WHERE id = :id;


