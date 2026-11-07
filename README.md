# CEHGact1_t4

## Programación Web
**Hernandez Guzman Concepcion Escarloeth** 

**Actividad:** Act1. Introducción a Spring Boot: Configuración y Primeros Controladores

## Descripción

En esta actividad configuré mi entorno de desarrollo con Java y Spring Boot, creé un proyecto con Spring Initializr y desarrollé controladores para atender peticiones web. Primero probé el proyecto en mi computadora y después lo desplegué en un VPScon el puerto 8081.

## Lo que realicé

- Verifiqué la instalación del JDK en mi computadora.
- Configuré Visual Studio Code con las extensiones de Java y Spring Boot.
- Creé el proyecto con Maven y las dependencias Spring Web, Thymeleaf y Spring Boot DevTools.
- Desarrollé los ejemplos del video: una respuesta HTML y una respuesta JSON.
- Creé mis propios controladores y endpoints.
- Probé los endpoints en localhost antes de desplegarlos.
- Generé el archivo `.jar` con Maven.
- Instalé Java 21 en el VPS y permití el puerto 8081 en el firewall.
- Subí el `.jar` al VPS con SCP y lo ejecuté con `nohup`.
- Verifiqué que los endpoints respondieran desde fuera del servidor.


## Tecnologías

| Área | Herramienta |
|---|---|
| Lenguaje | Java 21 |
| Framework | Spring Boot 4.1.2 |
| Capa web | Spring Web (Tomcat embebido) |
| Plantillas | Thymeleaf |
| Productividad | Spring Boot DevTools |
| Construcción | Maven y Maven Wrapper (`mvnw`) |
| Editor | Visual Studio Code con Spring Boot Dashboard |
| Servidor | VPS Ubuntu en Hostinger |
| Despliegue | SSH, SCP y `nohup` |
| Control de versiones | Git y GitHub |

## Controladores y endpoints propios

| Controlador | Endpoint | Respuesta | Enlace |
|---|---|---|---|
| ProyectoController | `/proyecto` | Texto con el nombre del proyecto y la autora | http://179.197.82.130:8081/proyecto |
| ProyectoController | `/estado` | JSON con el estado de la aplicación | http://179.197.82.130:8081/estado |
| PerfilController | `/materias` | JSON con una lista de materias | http://179.197.82.130:8081/materias |

## Ejemplos del video

| Controlador | Endpoint | Respuesta | Enlace |
|---|---|---|---|
| EjemploController | `/detalles_info` | Página HTML con Thymeleaf | http://179.197.82.130:8081/detalles_info |
| EjemploRestController | `/detalles_info2` | JSON | http://179.197.82.130:8081/detalles_info2 |

## Ejecución local

```
.\mvnw.cmd spring-boot:run
```

 http://localhost:8081/proyecto 

## Despliegue

Compilar el `.jar`:

```
.\mvnw clean package -DskipTests
```

Subirlo al VPS:

```
scp target\springboot-applications-0.0.1-SNAPSHOT.jar root@179.197.82.130:~/Escarleth/
```

El proyecto corre en el VPS en el puerto **8081**:

```
nohup java -jar ~/Escarleth/springboot-applications-0.0.1-SNAPSHOT.jar --server.port=8081 > ~/Escarleth/app.log 2>&1 &
```