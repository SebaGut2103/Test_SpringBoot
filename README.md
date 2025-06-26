# Test_SpringBoot_MiTask

Este repositorio contiene el **Bck-end** del API REST de MiTask , desarrollado en **Java con Spring Boot**. Permite gestionar tareas y proyectos de equipos de trabajos.


---

## 📌 Descripción General

El objetivo es construir una API REST utilizando Spring Boot que permita gestionar tareas y proyectos de un equipo de trabajo. La aplicación debe incluir funcionalidades para crear, consultar, actualizar y eliminar tareas y proyectos, soportar roles de usuario con diferentes niveles de acceso, y manejar relaciones entre proyectos y tareas. El sistema debe estar respaldado por una base de datos y cumplir con los estándares de calidad en desarrollo.


---

### ⚙️ Framework y Herramientas:

* Spring Boot 3.2.3 y JDK 17.
* Uso de JWT para los accesos de usuarios.
* Spring Data JPA para el manejo de entidades y repositorios.
* Swagger para la documentación de la API.


---

### 👥 Gestión de Usuarios y Roles

* Administración de usuarios, asignación de roles y control de acceso.
* Restricciones de acceso según el rol autenticado.


---

## 🧪 Pruebas y Consumo

La API puede ser testeada con herramientas como Postman o directamente desde Swagger. Para consumir los endpoints protegidos, es necesario incluir el token JWT en el encabezado:


---

## ⚙️ Requisitos de Configuración

* Java 17 o superior
* Maven 3.8+
* MySQL o PostgreSQL
* Apache Tomcat (para producción)

Configura tus credenciales de base de datos en `application.properties`.

---

## 📁 Contenido

* Código fuente en Java con Spring Boot.
* Documentación Swagger integrada.
* JWT implementado para acceso seguro.
* README explicativo.
* Listo para desplegar en Tomcat.
