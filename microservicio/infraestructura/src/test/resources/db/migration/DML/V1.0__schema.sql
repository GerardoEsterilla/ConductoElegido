

CREATE TABLE IF NOT EXISTS  Clientes (
                id bigint auto_increment NOT NULL ,
                Nombre VARCHAR NOT NULL,
                Apellido VARCHAR NOT NULL,
                fecha_nacimiento VARCHAR NOT NULL,
                Cedula VARCHAR NOT NULL,
                Email VARCHAR NOT NULL,
                CONSTRAINT clientes_pk PRIMARY KEY (id)
);






CREATE TABLE IF NOT EXISTS Vehiculos (
                id bigint auto_increment NOT NULL  ,
                Marca VARCHAR NOT NULL,
                Modelo VARCHAR NOT NULL,
                Placa VARCHAR NOT NULL,
                id_cliente bigint  NOT NULL,
                CONSTRAINT vehiculo_pk PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS Dias_Laborales (
                id bigint auto_increment NOT NULL ,
                Dias VARCHAR NOT NULL,
                CONSTRAINT dias_laborales_pk PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS Municipios (
                id bigint auto_increment NOT NULL ,
                Pais VARCHAR NOT NULL,
                Departamento VARCHAR NOT NULL,
                Municipio VARCHAR NOT NULL,
                CONSTRAINT municipios_pk PRIMARY KEY (id)
);




CREATE TABLE IF NOT EXISTS Conductores (
                id bigint auto_increment NOT NULL ,
                Nombre VARCHAR NOT NULL,
                Apellido VARCHAR NOT NULL,
                Fecha_nacimiento DATE NOT NULL,
                Cedula VARCHAR NOT NULL,
                Email VARCHAR NOT NULL,
                Telefono VARCHAR NOT NULL,
                Foto VARCHAR NOT NULL,
                CONSTRAINT conductores_pk PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS Servicios (
                id bigint auto_increment NOT NULL ,
                id_conductor bigint  NOT NULL,
                id_cliente bigint  NOT NULL,
                Origen VARCHAR NOT NULL,
                Destino VARCHAR NOT NULL,
                Fecha_servicio VARCHAR NOT NULL,
                Valor INTEGER NOT NULL,
                descripcion VARCHAR NOT NULL,
                CONSTRAINT servicios_pk PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Estados_Servicios (
                id bigint auto_increment NOT NULL  ,
                Estados_servicio VARCHAR NOT NULL,
                Servicios_id bigint  NOT NULL,
                CONSTRAINT estados_servicios_pk PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS conductor_dias (
                id_conductor bigint NOT NULL,
                id_dias bigint  NOT NULL
);


CREATE TABLE IF NOT EXISTS conductor_municipio (
                id_conductor bigint  NOT NULL,
                id_municipio bigint  NOT NULL
);

