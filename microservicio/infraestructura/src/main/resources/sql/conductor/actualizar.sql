UPDATE conductores
	SET nombre=:nombre, apellido=:apellido, fecha_nacimiento=:fechaNacimiento, cedula=:cedula, email=:email, telefono=:telefono, foto=:foto
	WHERE id = :id;