CREATE SEQUENCE clientes_id_seq;

CREATE TABLE IF NOT EXISTS  Clientes (
                id INTEGER NOT NULL DEFAULT nextval('clientes_id_seq'),
                Nombre VARCHAR NOT NULL,
                Apellido VARCHAR NOT NULL,
                fecha_nacimiento VARCHAR NOT NULL,
                Cedula VARCHAR NOT NULL,
                Email VARCHAR NOT NULL,
                CONSTRAINT clientes_pk PRIMARY KEY (id)
);


ALTER SEQUENCE clientes_id_seq OWNED BY Clientes.id;

CREATE SEQUENCE vehiculo_id_seq;

CREATE TABLE IF NOT EXISTS Vehiculos (
                id INTEGER NOT NULL DEFAULT nextval('vehiculo_id_seq'),
                Marca VARCHAR NOT NULL,
                Modelo VARCHAR NOT NULL,
                Placa VARCHAR NOT NULL,
                id_cliente INTEGER NOT NULL,
                CONSTRAINT vehiculo_pk PRIMARY KEY (id)
);


ALTER SEQUENCE vehiculo_id_seq OWNED BY Vehiculo.id;

CREATE SEQUENCE dias_laborales_id_seq;

CREATE TABLE IF NOT EXISTS Dias_Laborales (
                id INTEGER NOT NULL DEFAULT nextval('dias_laborales_id_seq'),
                Dias VARCHAR NOT NULL,
                CONSTRAINT dias_laborales_pk PRIMARY KEY (id)
);


ALTER SEQUENCE dias_laborales_id_seq OWNED BY Dias_Laborales.id;

CREATE SEQUENCE municipios_id_seq;

CREATE TABLE IF NOT EXISTS Municipios (
                id INTEGER NOT NULL DEFAULT nextval('municipios_id_seq'),
                Pais VARCHAR NOT NULL,
                Departamento VARCHAR NOT NULL,
                Municipio VARCHAR NOT NULL,
                CONSTRAINT municipios_pk PRIMARY KEY (id)
);


ALTER SEQUENCE municipios_id_seq OWNED BY Municipios.id;

CREATE SEQUENCE conductores_id_seq;

CREATE TABLE IF NOT EXISTS Conductores (
                id INTEGER NOT NULL DEFAULT nextval('conductores_id_seq'),
                Nombre VARCHAR NOT NULL,
                Apellido VARCHAR NOT NULL,
                Fecha_nacimiento DATE NOT NULL,
                Cedula VARCHAR NOT NULL,
                Email VARCHAR NOT NULL,
                Telefono VARCHAR NOT NULL,
                Foto VARCHAR NOT NULL,
                CONSTRAINT conductores_pk PRIMARY KEY (id)
);


ALTER SEQUENCE conductores_id_seq OWNED BY Conductores.id;

CREATE SEQUENCE servicios_id_seq;

CREATE TABLE IF NOT EXISTS Servicios (
                id INTEGER NOT NULL DEFAULT nextval('servicios_id_seq'),
                id_conductor INTEGER ,
                id_cliente INTEGER NOT NULL,
                Origen VARCHAR NOT NULL,
                Destino VARCHAR NOT NULL,
                Fecha_servicio VARCHAR NOT NULL,
                Valor INTEGER ,
                descripcion VARCHAR NOT NULL,
                CONSTRAINT servicios_pk PRIMARY KEY (id)
);


ALTER SEQUENCE servicios_id_seq OWNED BY Servicios.id;

CREATE SEQUENCE estados_servicios_id_seq;

CREATE TABLE IF NOT EXISTS Estados_Servicios (
                id INTEGER NOT NULL DEFAULT nextval('estados_servicios_id_seq'),
                Estados_servicio VARCHAR NOT NULL,
                Servicios_id INTEGER NOT NULL,
                CONSTRAINT estados_servicios_pk PRIMARY KEY (id)
);


ALTER SEQUENCE estados_servicios_id_seq OWNED BY Estados_Servicios.id;

CREATE TABLE IF NOT EXISTS conductor_dias (
                id_conductor INTEGER NOT NULL,
                id_dias INTEGER NOT NULL
);


CREATE TABLE IF NOT EXISTS conductor_municipio (
                id_conductor INTEGER NOT NULL,
                id_municipio INTEGER NOT NULL
);


ALTER TABLE Servicios ADD CONSTRAINT clientes_servicios_fk
FOREIGN KEY (id_cliente)
REFERENCES Clientes (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Vehiculo ADD CONSTRAINT clientes_vehiculo_fk
FOREIGN KEY (id_cliente)
REFERENCES Clientes (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE conductor_dias ADD CONSTRAINT dias_laborales_conductor_dias_fk
FOREIGN KEY (id_dias)
REFERENCES Dias_Laborales (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE conductor_municipio ADD CONSTRAINT municipios_conductor_municipio_fk
FOREIGN KEY (id_municipio)
REFERENCES Municipios (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE conductor_municipio ADD CONSTRAINT conductores_conductor_municipio_fk
FOREIGN KEY (id_conductor)
REFERENCES Conductores (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE conductor_dias ADD CONSTRAINT conductores_conductor_dias_fk
FOREIGN KEY (id_conductor)
REFERENCES Conductores (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Servicios ADD CONSTRAINT conductores_servicios_fk
FOREIGN KEY (id_conductor)
REFERENCES Conductores (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Estados_Servicios ADD CONSTRAINT servicios_estados_fk
FOREIGN KEY (Servicios_id)
REFERENCES Servicios (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;