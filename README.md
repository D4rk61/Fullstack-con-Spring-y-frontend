## Proyecto:

He creado un proyecto fullstack haciendo uso de: en el area del frontend, html,css y javascript, por el lado del backend Java y spring como framework, **Por el momento solo he creado la area de gestion de usuarios pero cambiara eso a futuro** (cuando mis conocimientos en spring crezcan).

<br>

### Uso del Proyecto

1. Realizar un "git clone" del proyecto:

```bash
https://github.com/D4rk61/Fullstack-con-Spring-y-frontend.git

```

2. Abrir **intellJ** y abrir el proyecto (la ruta de este)
3. Posterior Maven que es el administrador de dependencias tendra que instalar las dependencias.
4. Ejecutaremos el **Main**
5. Abriremos `localhost:8080/login.html` en nuestro navegador y podremos comenzar a usar la logia
6. PD:. Creo que tambien se tendria que realizar una copia de la base de datos.


### Creación de la Base de datos

```sql

1. Creamos la base de datos:

DO $$ 
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_database WHERE datname = 'cursojava') THEN
        CREATE DATABASE cursojava
            WITH OWNER = 'root'
            ENCODING = 'UTF8'
            LC_COLLATE = 'en_US.UTF-8'
            LC_CTYPE = 'en_US.UTF-8'
            TABLESPACE = pg_default
            CONNECTION LIMIT = -1;
    END IF;
END $$;

2. Ingresamos a ella:

\c cursojava

3. Creamos la tabla usada en el proyecto:



CREATE TABLE usuarios (
    id serial PRIMARY KEY,
    nombre varchar(40),
    apellido varchar(40),
    email varchar(255),
    telefono varchar(40),
    password varchar(255)
);

```
