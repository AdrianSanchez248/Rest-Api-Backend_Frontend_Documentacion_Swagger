# Rest-Api-Backend_Frontend_Documentacion_Swagger

# Descripción:

Este es un proyecto que implementa una REST API completa, junto con un frontend y la documentación de la API utilizando Swagger. El proyecto está diseñado para ser un ejemplo completo de cómo desarrollar, documentar y probar una API REST, así como integrarla con un frontend.

# Características:

Backend: Implementado con Node.js y Express.

Frontend: Implementado con React.

Documentación: Generada automáticamente con Swagger.

Base de Datos: MongoDB.

Autenticación: JWT (JSON Web Tokens).

Testing: Jest y Supertest.

# Requisitos:

Antes de comenzar, asegúrate de tener instalados los siguientes requisitos:

Node.js (versión 14 o superior)

MongoDB (versión 4.0 o superior)

npm (versión 6 o superior)

# Instalación:

### Sigue estos pasos para instalar y configurar el proyecto:

Clona el repositorio:

bash

Copiar código

    - git clone https://github.com/AdrianSanchez248/Rest-Api-Backend_Frontend_Documentacion_Swagger.git

Navega al directorio del proyecto:

    - bash

Copiar código

    - cd Rest-Api-Backend_Frontend_Documentacion_Swagger

Instala las dependencias del backend:

    - bash
    - Copiar código
    - cd backend
    - npm install


Instala las dependencias del frontend:

    - bash
    - Copiar código
    - cd ../frontend
    - npm install
    
Configuración:

Configura las variables de entorno necesarias. Crea un archivo .env en la raíz del directorio backend y añade las siguientes variables:

    - env
    - Copiar código
    - PORT=5000
    - MONGODB_URI=mongodb://localhost:27017/tu_basedatos
    - JWT_SECRET=tu_secreto_jwt
    
Configura la base de datos si es necesario:

Asegúrate de que MongoDB esté corriendo y de que la URI de conexión en el archivo .env sea correcta.

Ejecución
Backend
Para iniciar el servidor backend, utiliza el siguiente comando:

    - bash
    - Copiar código
    - cd backend
    - npm start
    
El servidor estará disponible en http://localhost:5000.

Frontend
Para iniciar el servidor frontend, utiliza el siguiente comando:

    - bash
    - Copiar código
    - cd frontend
    - npm start
El frontend estará disponible en http://localhost:3000.

Documentación
La documentación de la API generada por Swagger estará disponible en la siguiente URL:

    - bash
    - Copiar código
    -[http://localhost:5000/api-docs](http://localhost:8080/swagger-ui.html)

## Métodos:
  - GET /citas: Obtiene todas las citas.
    
   Resumen:  Obtener todas las citas.

   Descripción: Devuelve una lista de todas las citas.
   
   Respuesta:
     200: Lista de citas obtenida con éxito.    
     Content-Type: application/json
     Schema:
     
     -Copiar código
     -type: array
     -items:
     -$ref: '#/components/schemas/Cita'
  
- POST /citas: Crea una nueva cita.
  
Resumen: Crear una nueva cita.

Descripción: Crea una nueva cita con los datos proporcionados.

RequestBody:

Requerido: Sí

Content-Type: application/json

Schema:

    -Copiar código
    -$ref: '#/components/schemas/Cita'
    
Respuesta:

201: Cita creada con éxito.

- GET /citas/{id}: Obtiene una cita por su ID.

Resumen: Obtener una cita por ID.

Descripción: Devuelve una cita específica basada en su ID.

Parámetros:

Path:

id: string (requerido)

Respuesta:

200: Cita obtenida con éxito.

404: Cita no encontrada.

Content-Type: application/json

    -$ref: '#/components/schemas/Cita'
    
- PUT /citas/{id}: Actualiza una cita existente por su ID.
  
Resumen: Actualizar una cita por ID.

Descripción: Actualiza los detalles de una cita específica.

Parámetros:

Path:

id: string (requerido)

RequestBody:

Requerido: Sí

Content-Type: application/json


    -$ref: '#/components/schemas/Cita'
    
Respuesta:

200: Cita actualizada con éxito.

404: Cita no encontrada.

- DELETE /citas/{id}: Elimina una cita por su ID.

Resumen: Eliminar una cita por ID.

Descripción: Elimina una cita específica basada en su ID.

Parámetros:

Path:

id: string (requerido)

Respuesta:

204: Cita eliminada con éxito.

404: Cita no encontrada.

## Testing

Para ejecutar las pruebas del proyecto, utiliza el siguiente comando:

    -bash
    -Copiar código
    -npm test
    -Components

## Components

    -type: object
    -properties:
    -  id:
     -   type: string
    -    description: ID de la cita
    -  fecha:
    -    type: string
    -    format: date-time
    -    description: Fecha y hora de la cita
    -  paciente:
    -    type: string
    -    description: Nombre del paciente
    -  motivo:
    -    type: string
    -    description: Motivo de la cita



