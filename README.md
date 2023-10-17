# HackathonJump2digital - API de Skins 🎮

## ¿Qué es la API de Skins?

La API de Skins es una aplicación que te permite gestionar **skins** para un juego. Los skins son elementos visuales que cambian el aspecto de los personajes, armas u objetos del juego. Con esta API, los usuarios pueden:

- **Comprar** skins.
- **Obtener** skins.
- **Gestionar** sus skins.

## ¿Qué necesitas para usar la API de Skins?

Para usar la API de Skins, necesitas tener instalado lo siguiente en tu ordenador:

- **Java 17**: Es el lenguaje de programación que se usa para desarrollar la API. Puedes descargarlo desde  [este enlace](https://www.oracle.com/java/technologies/javase-downloads.html).
- **Maven**: Es una herramienta que se encarga de gestionar las dependencias y construir el proyecto. Si no lo tienes instalado, puedes obtenerlo [aquí](https://maven.apache.org/).
- **MySQL**: Es el sistema de gestión de bases de datos que se usa para almacenar la información de los usuarios y los skins. Asegúrate de tenerlo instalado. Puedes descargarlo desde el [sitio oficial de MySQL](https://dev.mysql.com/downloads/mysql/).

## ¿Cómo configurar la API de Skins?

Sigue estos pasos para configurar la API de Skins:

1. Clona este repositorio en tu ordenador:

   ```bash
   git clone https://github.com/tuusuario/HackathonJump2digital.git

- Crea una base de datos llamada `skin_db` en MySQL.
- Actualiza las credenciales de la base de datos en el archivo `src/main/resources/application.properties`.
- Compila el proyecto con el siguiente comando:

  ```bash
  cd HackathonJump2digital
  mvn clean install

- Ejecuta la aplicación con el siguiente comando:

  ```bash
  mvn spring-boot:run

- La aplicación se iniciará en http://localhost:8080.

## Guía de Uso de la API de Skins

La **API de Skins** te ofrece diversas funciones para interactuar con los skins del juego. Para aprovechar esta API, debes enviar solicitudes HTTP a sus puntos finales. Estos puntos finales son las direcciones web que te permiten interactuar con la API.

## Desarrollo de la API

La API de Skins se ha desarrollado siguiendo las especificaciones del proyecto, proporcionando una plataforma robusta y eficiente para la gestión de skins en un juego. A continuación, se describen algunos aspectos clave del desarrollo:

### Arquitectura

La aplicación se basa en una arquitectura de tipo RESTful, lo que significa que utiliza los métodos HTTP estándar para realizar operaciones en recursos. Está construida siguiendo el patrón Modelo-Vista-Controlador (MVC), lo que permite una separación clara de las responsabilidades.

### Endpoints

Se han implementado varios endpoints para permitir a los usuarios realizar diversas acciones:

- **GET /skins/available**: Permite a los usuarios obtener una lista de las skins disponibles para comprar. Esto se logra a través del método `getAvailableSkins` del servicio de skins.

- **POST /skins/buy**: Permite a los usuarios comprar una nueva skin y guardarla en la base de datos. El servicio correspondiente es `buySkin`.

- **GET /skins/myskins**: Devuelve una lista de las skins compradas por el usuario autenticado. Se utiliza el servicio `getMySkins`.

- **PUT /skins/color/{id}**: Permite a los usuarios cambiar el color de una skin comprada. Esto se logra con el servicio `updateSkinColor`.

- **DELETE /skins/delete/{id}**: Permite a los usuarios eliminar una skin comprada. La operación se lleva a cabo utilizando el servicio `deleteSkin`.

- **GET /skins/getskin/{id}**: Devuelve una skin específica por su ID. El servicio correspondiente es `getSkinById`.

### Lógica de Negocio

La lógica de negocio detrás de la API de Skins garantiza que las operaciones se realicen de manera segura y eficiente. Se gestionan aspectos como la disponibilidad de las skins.

### Persistencia de Datos

La aplicación utiliza una base de datos MySQL para almacenar información sobre las skins, como nombre, tipo, precio, color, descripción, imagen y disponibilidad. La capa de persistencia se implementa a través de JPA y Spring Data.
