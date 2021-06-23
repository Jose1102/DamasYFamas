# PicasYFamasGame




Este proyecto busca implementar un servidor que tenga la capacidad de responder solicitudes pero usando hilos. 
Para el primer ejercicio propuesto se debe implementar una app web sencilla con una tabla de nombres y una pagina que soporte archivos de tipo imagen,texto,js,etc. Por último, se realizó una datagrama CLIENTE-SERVIDOR, donde el datagrama servidor le devuelva por un intervalo de 5 segundos la hora actual al datagrama de cliente y que este se actualice; algo muy parecido a un servidor [NTP](https://www.tecnozero.com/servidor/ntp/). 

## Despliegue Heroku


[![Heroku](https://www.herokucdn.com/deploy/button.png)](https://famas-picas-game.herokuapp.com/game/agregar)



## Autor ✒️


* **Jose María Castro Ortega** - *Autor*  - *Estudiante de ingeniería de sistemas*
* **21/06/2021** - *Fecha* 


## Tabla de contenido

- [Circleci](#circleci).
- [Requisitos](#requisitos-).
- [Enunciado](#enunciado).
- [Comenzando](#comenzando-).
- [Ejecutando las pruebas](#ejecutando-las-pruebas)
- [Diagrama de clases](#diagrama-de-clases-).
- [Productividad](#productividad).
- [Javadoc](#javaDoc-).
- [Licencia](#licencia-)

## Circleci

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/Jose1102/PicasYFamasGame)

## Requisitos 📋
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Git](https://git-scm.com/) - Software de control de versiones
* [Java](https://www.oracle.com/java/) - Lenguaje de programación

## Enunciado


Construya una aplicación en Spring que implemente el famosos juegos de picas y famas y que esté desplegada en Heroku. Entregue su repositorio en github actualizado y el enlace a la aplicación ejecutándose en Heroku.

## Comenzando 🚀
1. Clonar el repositorio
```
git clone https://github.com/Jose1102/PicasYFamasGame
```

2. Compilar el proyecto

```
mvn package
```

3. Ejecutar el proyecto 

### Ejercicio 1

Ejecutamos el SpringBootApplication o abrirlo desde el despliegue de Heroku


Ingresamos en la entrada un número de 4 cifras y le damos clic en el botón Jugar. Nos aparecerá una tabla con el historial de jugadas, donde nos informará el número que ingresamos,picas y famas
![PoolThread](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/ingresandoNumero.PNG)

Al momento de encontrar el número nos aparecerá que ganamos y tendremos la opción de volver a jugar

![Imagen](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/ganaste.PNG)

Al darle clic en volver a jugar nos remitirá nuevamente a la pagina principal con un juego nuevo

![Imagen](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/reseat.PNG)



## Ejecutando las pruebas

1. Compilar pruebas

```
mvn test
```

![Test](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/tests.PNG)

## Diagrama de clases 📖

Se tiene un controlador llamado DamasYFijasController que realiza el llamado de los métodos get y post y son consumidos por dos páginas html. A demás por medio del atributo service se inyecta y realiza el llamado a la clase IServiceTablero donde está implementa una interface que calcula la cantidad de picas, famas y si es ganador o no.

![WebServer](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/service.PNG)


Por otro lado, aparte de inyectar service la clase DamasYFijasController tambien hace la inyección de repo que es una interface que extiende de JpaRepository.

![Datagram](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/controller.PNG)


La interface ITableroRepo extiende de JpaRepository  en la que se le envía una entidad tipo Tablero y el id de está entidad que para este caso es de tipo Integer

![Datagram](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/jparepository.PNG)


La clase Tablero es una entidad que tiene como atributos un id,picas,famas y el número que ingresa el usuario

![Datagram](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/tablero.PNG)


La clase DamasYFijasController que es el controllador, hace el uso de la entidad Tablero por medio de la inyección repo donde esta hace uso de la interface ITableroRepo que extiende de JpaRepository 

![Datagram2](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/tablerorepo.PNG)





## Productividad
La productividad de este proyecto fue:
* 356 loc / 29 hours

## JavaDoc 📖

Para consultar la carpeta de [JAVADOC](https://github.com/Jose1102/PicasYFamasGame/tree/master/javadoc) .

## Licencia 📌

Este proyecto está bajo la Licencia Pública General GNU - consulte el archivo de [LICENCIA](https://github.com/Jose1102/PicasYFamasGame/blob/master/LICENSE.txt) para obtener más detalles.
