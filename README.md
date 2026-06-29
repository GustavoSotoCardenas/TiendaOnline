# 🛒 Tienda Online API

API REST desarrollada con **Spring Boot 4.1.0** para la gestión de clientes y productos de una tienda online. Incluye operaciones CRUD con persistencia en base de datos PostgreSQL.

---

## 🚀 Tecnologías

| Tecnología | Versión |
|---|---|
| Java | 21 |
| Spring Boot | 4.1.0 |
| Spring Data JPA | 4.1.0 |
| Hibernate | 7.4.1.Final |
| PostgreSQL | 16 |
| Lombok | latest |
| Maven | 3.x |

---

## 📁 Estructura del proyecto

```
src/main/java/com/tiendaOnline/
├── TiendaOnlineApplication.java
├── controller/
│   ├── ClienteController.java
│   └── ProductoController.java
├── dto/
│   ├── ClienteRequestDTO.java
│   ├── ClienteResponseDTO.java
│   ├── ProductoRequestDTO.java
│   └── ProductoResponseDTO.java
├── mapper/
│   ├── ClienteMapper.java
│   └── ProductoMapper.java
├── model/
│   ├── Cliente.java
│   └── Producto.java
├── repository/
│   ├── ClienteRepository.java
│   └── ProductoRepository.java
└── service/
    ├── ClienteService.java
    ├── ClienteServiceImpl.java
    ├── ProductoService.java
    └── ProductoServiceImpl.java
```

---

## ⚙️ Configuración

### Requisitos previos

- Java 21+
- PostgreSQL 16 corriendo en `localhost:5432`
- Maven 3.x

### Base de datos

Crea la base de datos en PostgreSQL:

```sql
CREATE DATABASE bootcamp;
```

### Variables de entorno

El proyecto usa un archivo `.env`. Crea el archivo `src/main/resources/application.yaml` con tus credenciales:

```yaml
spring:
  application:
    name: tiendaOnline

  datasource:
    url: jdbc:postgresql://localhost:5432/bootcamp
    username: tu_usuario
    password: tu_contraseña
    driver-class-name: org.postgresql.Driver

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true

server:
  port: 8081
```

> Las tablas `clientes` y `productos` se crean automáticamente al iniciar la aplicación gracias a `ddl-auto: update`.

---

## ▶️ Cómo ejecutar

```bash
# Clonar el repositorio
git clone https://github.com/tu-usuario/tiendaOnline.git
cd tiendaOnline

# Compilar y ejecutar
./mvnw spring-boot:run
```

La API quedará disponible en `http://localhost:8081`

---

## 📡 Endpoints

### Clientes

| Método | Endpoint | Descripción |
|---|---|---|
| `POST` | `/cliente` | Crear un cliente |
| `GET` | `/cliente` | Listar todos los clientes |
| `GET` | `/cliente/{id}` | Obtener cliente por ID |

#### Ejemplo body POST `/cliente`

```json
{
  "nombre": "Juan",
  "apellido": "Pérez",
  "correo": "juan.perez@email.com",
  "telefono": "+56912345678",
  "direccion": "Av. Providencia 1234, Santiago"
}
```

---

### Productos

| Método | Endpoint | Descripción |
|---|---|---|
| `POST` | `/producto` | Crear un producto |
| `GET` | `/producto` | Listar todos los productos |
| `GET` | `/producto/{id_producto}` | Obtener producto por ID |
| `DELETE` | `/producto/{id_producto}` | Eliminar un producto |

#### Ejemplo body POST `/producto`

```json
{
  "nombre_producto": "Laptop Gamer",
  "descripcion": "Laptop de alto rendimiento",
  "precio": 999990.00,
  "stock": 15,
  "categoria": "Electrónica"
}
```

---

## 🗃️ Modelo de datos

### Cliente

| Campo | Tipo | Descripción |
|---|---|---|
| `id` | Long | ID autogenerado |
| `nombre` | String | Nombre del cliente |
| `apellido` | String | Apellido del cliente |
| `correo` | String | Correo electrónico |
| `telefono` | String | Número de teléfono |
| `direccion` | String | Dirección |

### Producto

| Campo | Tipo | Descripción |
|---|---|---|
| `id_producto` | Long | ID autogenerado |
| `nombre_producto` | String | Nombre del producto |
| `descripcion` | String | Descripción |
| `precio` | BigDecimal | Precio |
| `stock` | Integer | Cantidad disponible |
| `categoria` | String | Categoría |

---

## 👤 Autor

**Gustavo Soto Cárdenas**

Proyecto de aprendizaje de Spring Boot con arquitectura en capas (Controller → Service → Repository).
