# Conversor de Monedas

Esta es una aplicación Java que permite convertir entre diferentes monedas utilizando una API externa para obtener las tasas de cambio. La aplicación sigue una arquitectura basada en la Clean Architecture y utiliza una interfaz de línea de comandos para interactuar con el usuario.

## Screenshots

![App Screenshot](https://archive.org/download/captura-de-pantalla-2024-05-22-174344/Captura%20de%20pantalla%202024-05-22%20174344.png)


## Características

- Conversión entre monedas utilizando tasas de cambio en tiempo real.
- Menú interactivo por línea de comandos.
- Registro de todas las conversiones en un archivo de texto.
## Requisitos Previos
- Java Development Kit (JDK) 8 o superior instalado en tu sistema.
- Una clave API válida para acceder a la API de tasas de cambio (ver más abajo).

## Uso
1. **Descarga el código fuente:**

   Clona este repositorio en tu máquina local o descarga el código fuente como un archivo ZIP y extráelo.

2. **Configura la clave API:**

   Renombra el archivo `.envExample` a `.env`. Abre el archivo `.env` en un editor de texto y reemplaza `TU_CLAVE_API` con tu clave API válida obtenida de la API de tasas de cambio. Puedes obtener una clave API registrándote en el servicio de la API de tasas de cambio. Para más información, consulta la [documentación de ExchangeRate-API](https://www.exchangerate-api.com/docs/overview).

3. **Compila el proyecto:**

   Abre una terminal, navega hasta la carpeta raíz del proyecto y ejecuta el siguiente comando para compilar el proyecto:

   ```bash
   javac -d out src/main/java/com/miguelalanis/conversordemoneda/*.java

4. **Ejecuta la aplicacion**

   Después de compilar el proyecto, ejecuta el siguiente comando para ejecutar la aplicación:

     ```bash
     java -cp out com.miguelalanis.conversordemoneda.Main
     
5. **Disfruta la aplicacion**




## Contribuir

Si deseas contribuir a este proyecto, ¡eres bienvenido! Siéntete libre de abrir un problema para discutir nuevas características o mejoras, o envía una solicitud de extracción con tus cambios propuestos.
## Authors

- [@miguelalanis](https://www.github.com/miguelalanis)

