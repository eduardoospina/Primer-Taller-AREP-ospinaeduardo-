# AREP- ARQUITECTURAS EMPRESARIAL - Laboratorio 1.

## AUTOR.

> Eduardo Ospina Mejia

## INTRODUCCIÓN MVN-GIT Y HEROKU.

### Introduccion.

Para este laboratorio se requieren conocimientos de tres herramientas para su desarrollo, siendo estas :
1) MVN
2) GIT
3) Heroku
4) Spark

Al ya cumplir con estos requerimientos, el objetivo de este proyecto es el de implementar una calculadora
capaz de convertir de grados Celsius a grados Fahrenheit. Implementando una API y una implementacion front-end
en donde se explica la API y se implementa una demonstration de la funcionalidad del API.

Al hacer uso de las las herramientas y unificar los conocimientos pasados se logra completar la implementacion deseada
aprendioendo contanmente el mejor uso de las herraientas y aumentando los conocimientos necesarios para el desarrollo del curso.

Se implmentan pruebas unitarias para completar el desarrollo y comprobar que funciona de la mejor manera. Al no tener tanta experiencia 
al crear pruebas unitaria coincurrentes que se conecten y simulen dentro de lo que construimos, se llegaron a encontrar varios problemas
con la realicacion de estas pruebas unitarias.

### Desplegando localmente.

En esta seccion se daran intrucciones de como descargar y correr localmente la aplicacion y la API de conversion de tempraturascon el proposito 
de correrlo en la maquina de cada uno:

##### Requisitos:
1)   [Java 8](https://www.java.com/download/ie_manual.jsp) 
2)   [Maven](https://maven.apache.org/download.cgi) 
3)   [Git](https://git-scm.com/downloads) 
4)   IDE de java.

##### Despliegue local API

para esto se siguen los siguientes pasos:

1) clonar el repositorio, ya se a traves de cmd o de GIT: 

![](https://i.postimg.cc/8zHQ5STd/Capture1.png)

![](https://i.postimg.cc/VNky0VNx/Capture2.png)

![](https://i.postimg.cc/fb2GcftJ/Capture3.png)

2) ingresamos al proyecto clonado y desde cmd hacer uso de mvn para clean y package. 

```maven
mvn clean package
```

![](https://i.postimg.cc/1zRxN5BR/Capture4.png)

3) Ejecutamos el proyecto utilizando los comandos en el cmd o corremos directamente desde la ide.

```maven
mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.SparkWebApp"
```

![](https://i.postimg.cc/y8gjpqNh/Capture5.png)

![](https://i.postimg.cc/0jjX0Z6q/Capture7.png)
![](https://i.postimg.cc/3JDnrkm9/Capture8.png)

4) abrirlo en el navegador utilizando localhost con la ruta del api /Calculator/celsius/valor oo /calculator/fahrenheit/valor: 

![](https://i.postimg.cc/267NqLR5/Capture6.png)

##### Despliegue local recurso webb

1) seguir los paso anteriores para correr el recurso de forma local: 

![](https://i.postimg.cc/0jjX0Z6q/Capture7.png)
![](https://i.postimg.cc/3JDnrkm9/Capture8.png)

2) abrilo en el navegador sin ninguna ruta en especifico: 

![](https://i.postimg.cc/jdm86qhQ/Capture9.png)

### Ejecutar Pruebas.

Para ejecutar pruebas unitarias se corre desde cmd: 

![](https://i.postimg.cc/tCxcMVJm/Capture10.png)

### Desplegando de forma remota.

Ya se encuentra desplguegado de forma remota, utilizando el recurso de heroku se esta cumpliendo esta funcion por lo que paracorrer el API o el recurso web 
se puede lograr ingresando la url: 

**https://calc-api-be.herokuapp.com/**

![](https://i.postimg.cc/JnThv26m/Capture11.png)

lo unico que toca tener cuidado es con la rutas adicionales para llegar a el API: 

- /Calculator/celsius/valor
- /calculator/fahrenheit/valor

![](https://i.postimg.cc/rpxFJCB3/Capture12.png)
![](https://i.postimg.cc/3RZrMrJZ/Capture13.png)



### Tecnologias Implementadas.

* [Heroku](https://heroku.com) - Plataforma de despliegue en la nube.

* [Maven](https://maven.apache.org/) - Administrador de dependencias.

* [Spark](http://sparkjava.com) - Framework para desarrollo de aplicaciones web.

### Arquitectura implementada

Se implemento la arquitectura Rest, ya que uno de los requerimientos para el desarrollo de este trabajo era implementar una API REST. lo que uno tiene
que tener en cuenta principalmente para esta arquitectura es: 
- la comunicacion sin estado dentro del proceso que cumple el API. 
- tener recursos que se puedan representar de diferentes maneras. 
- crear los vinculos necesarios para el funcionamiento de la API y la parte web.
- el manejo de id, principalmente para el manejo de html y js.

todo esto se hace para poder cumplir con la arquitectura y desarrollar de la mejor manera este producto. 

### Limitaciones

En este momento, falta la parte de pruebas concurrentes, ya que la iplementacion que se encuentra actualmente no permite la funcionalidad correctmente. 
A parte de esto cuenta lo unicos calculos que se pueden realizar son los de fahrenheit a celcius, no llega a tener en cunta otras temperaturas, por lo que faltaria 
extenderlo para que se deslimite en ese caso. 

una ultima limitacion que puede tener es la de que no tenga la capacidad para responder a varios request al mismo tiempo, ya que a causa del problema encontrado con 
las pruebas concurrentes por lo que esta limitacion se mantiene. 

### Extender

Este proyecto, en mi opinion, tiene un nivel medio de extensibilidad. Ya que como lo desarrolle no cuenta con herraientas que harian su extensibilidad mas sencilla. esto causa
que si se quieren agregar nuevos elementos toca necesariamente clases con las nuevas conversiones, por parte del SparkWeb si esta mas sencillo que si logra poder adicionar 
los paths y los gets mucho mas facil adicioando esas nuevas funcionalidades que se agregaron. Para finalizar, para extender el demo web si se encuentra tambien en un punto medio
por los mismo motivos mencionados. pero el programa llega a no contar con un acoplamiento muy elevado. 

## Construido con
-   HTML
-   javascript
-   java

## Despliegue Heroku:

[![ProjectDesign](https://www.herokucdn.com/deploy/button.png)](https://calc-api-be.herokuapp.com/)



### Licencia.

Licencia.

