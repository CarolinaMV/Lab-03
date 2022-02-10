# Lab-03


## CLASES DE EQUIVALENCIA

### CREAR UN PROYECTO CON MAVEN

```
mvn archetype:generate -Dfilter=maven-archetype-quickstart
```

![image](https://user-images.githubusercontent.com/98135902/153324365-ac3e21a7-7385-4624-8cab-499a982d5a91.png)

### ACTUALIZAR Y CREAR DEPENDENCIAS EN EL PROYECTO

![image](https://user-images.githubusercontent.com/98135902/153321256-2fea5bfd-46ec-4263-8d79-0b8731f182f9.png)

### Compilar y ejecutar

* Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó correctamente y los cambios realizados al archivo pom no generan inconvenientes.

![image](https://user-images.githubusercontent.com/98135902/153324995-694bf536-da60-4e3a-ae4f-1657735feb9f.png)

* Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la clase AppTest con resultado         exitoso.

![image](https://user-images.githubusercontent.com/98135902/153325103-ec01f985-bb56-4277-b8e6-3fe4dbcf974c.png)

## EJERCICIO “REGISTRADURÍA”

### HACER EL ESQUELETO DE LA APLICACION

![image](https://user-images.githubusercontent.com/98135902/153326300-4d0a316e-cd4c-403f-abd7-b7ac0f17fc44.png)

### EJECUTAR LAS PRUEBAS

![image](https://user-images.githubusercontent.com/98135902/153331472-872db07e-49a5-4398-b0b5-78270858d39e.png)

### Finalizar ejercicio

#### Casos de equivalencia

* UNDRERAGE: Cuando la edad de una persona se encuentra entre 0 a 18 años.
* INVALID_AGE: La edad de una persona no puede ser menor a 0 (Un número negativo).
* DEAD: La persona esta muerta.
* VALID: Cuando una persona no incumple con ninguna de las condiciones.
* DUPLICATED: Que el numero de ID no se repita (Que ya no se encuentre registrado).


## EJERCICIO "DESCUENTO DE TARIFAS"

### Para realizar de forma correcta el diseño de sus pruebas responda las preguntas que se encuentran en el documento.

[documento](https://github.com/CarolinaMV/Lab-03/blob/master/EjercicioClasesDeEquivalencia.pdf)

### IMPLEMENTACIÓN DE LAS PRUEBAS 

* Descargue el archivo aerodescuentos.jar y adicione esta nueva dependencia en el archivo pom.xml de su proyecto.
Para adicionar una librería personalizada al repositorio local de maven puede ejecutar el siguiente comando.
```
$ mvn install:install-file -Dfile=aerodescuentos-1.0.0.jar -DgroupId=edu.eci.cvds -DartifactId=aerodescuentos -Dversion=1.0.0 -Dpackaging=jar
```








