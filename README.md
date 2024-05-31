Rest-Api-Backend_Frontend_Documentacion_Swagger

Descripción
Este es un proyecto que implementa una REST API completa, junto con un frontend y la documentación de la API utilizando Swagger. El proyecto está diseñado para ser un ejemplo completo de cómo desarrollar, documentar y probar una API REST, así como integrarla con un frontend.

Características
Backend: Implementado con Node.js y Express.
Frontend: Implementado con React.
Documentación: Generada automáticamente con Swagger.
Base de Datos: MongoDB.
Autenticación: JWT (JSON Web Tokens).
Testing: Jest y Supertest.
Requisitos
Antes de comenzar, asegúrate de tener instalados los siguientes requisitos:

Node.js (versión 14 o superior)
MongoDB (versión 4.0 o superior)
npm (versión 6 o superior)
Instalación
Sigue estos pasos para instalar y configurar el proyecto:

Clona el repositorio:

bash
Copiar código
git clone https://github.com/AdrianSanchez248/Rest-Api-Backend_Frontend_Documentacion_Swagger.git
Navega al directorio del proyecto:

bash
Copiar código
cd Rest-Api-Backend_Frontend_Documentacion_Swagger
Instala las dependencias del backend:

bash
Copiar código
cd backend
npm install
Instala las dependencias del frontend:

bash
Copiar código
cd ../frontend
npm install
Configuración
Configura las variables de entorno necesarias. Crea un archivo .env en la raíz del directorio backend y añade las siguientes variables:

env
Copiar código
PORT=5000
MONGODB_URI=mongodb://localhost:27017/tu_basedatos
JWT_SECRET=tu_secreto_jwt
Configura la base de datos si es necesario:

Asegúrate de que MongoDB esté corriendo y de que la URI de conexión en el archivo .env sea correcta.

Ejecución
Backend
Para iniciar el servidor backend, utiliza el siguiente comando:

bash
Copiar código
cd backend
npm start
El servidor estará disponible en http://localhost:5000.

Frontend
Para iniciar el servidor frontend, utiliza el siguiente comando:

bash
Copiar código
cd frontend
npm start
El frontend estará disponible en http://localhost:3000.

Documentación
La documentación de la API generada por Swagger estará disponible en la siguiente URL:

bash
Copiar código
http://localhost:5000/api-docs
Controladores y Rutas
Controlador Base (BaseController)
Este es el controlador base que define la ruta base para todos los controladores relacionados con la tienda de comestibles.

Ruta base: /api/grocerystore

Controlador de Clientes (ClientController)
Este controlador maneja las operaciones relacionadas con los clientes.

Ruta base: /clients

Métodos:

GET /clients: Obtiene todos los clientes.
GET /clients/{clientId}: Obtiene un cliente por su ID.
POST /clients: Crea un nuevo cliente.
PUT /clients/{clientId}: Actualiza un cliente existente por su ID.
DELETE /clients/{clientId}: Elimina un cliente por su ID.
Controlador de Productos (ProductController)
Este controlador maneja las operaciones relacionadas con los productos.

Ruta base: /products

Métodos:

GET /products: Obtiene todos los productos o filtra por código si se proporciona.
GET /products/{id}: Obtiene un producto por su ID.
POST /products: Crea un nuevo producto.
PUT /products/{id}: Actualiza un producto existente por su ID.
DELETE /products/{id}: Elimina un producto por su ID.
Controlador de Ventas (SaleController)
Este controlador maneja las operaciones relacionadas con las ventas.

Ruta base: /sales

Métodos:

POST /sales: Crea una nueva venta.
GET /sales/{id}: Obtiene una venta por su ID.
GET /sales: Obtiene todas las ventas.
PUT /sales/{id}: Actualiza una venta existente por su ID.
DELETE /sales/{id}: Elimina una venta por su ID.
Testing
Para ejecutar las pruebas del proyecto, utiliza el siguiente comando:

Backend
bash
Copiar código
cd backend
npm test
Frontend
bash
Copiar código
cd frontend
npm test
Contribuir
Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

Haz un fork del repositorio.
Crea una nueva rama (git checkout -b feature/nueva-caracteristica).
Realiza tus cambios y haz commit (git commit -am 'Añade nueva característica').
Haz push a la rama (git push origin feature/nueva-caracteristica).
Abre un Pull Request.
