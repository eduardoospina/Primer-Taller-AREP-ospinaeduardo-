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

lo unico que toca tener cuidado es con la rutas adicionales para llegar a el API: 

- /Calculator/celsius/valor
- /calculator/fahrenheit/valor

### Tecnologias Implementadas.

* [Heroku](https://heroku.com) - Plataforma de despliegue en la nube.

* [Maven](https://maven.apache.org/) - Administrador de dependencias.

* [Spark](http://sparkjava.com) - Framework para desarrollo de aplicaciones web.

### Arquitectura implementada

### Limitaciones

### Extender

### Licencia.

