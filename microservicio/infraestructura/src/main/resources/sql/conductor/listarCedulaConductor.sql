SELECT id, nombre, apellido, fecha_nacimiento as fechaNacimiento, cedula, email, telefono, foto
	FROM conductores
	WHERE cedula LIKE :cedula

