# Decisiones en Java

Las sentencias de decisión nos permiten controlar el flujo de ejecución 
de un programa.

- La estructuras que podemos usar son:
## Sentencia if:
```java
if(condición){
    //Bloque de código a ejecutar
    //si la condición es true
}
```
## Sentencia if - else:
- La sentencia else se usa para ejecutar un bloque de código cuando
- la condicion del if es falsa.
```java
if(condición){
    //Bloque de código a ejecutar
    //si la condición es true
}else{
    //Bloque de código a ejecutar
    //si la condición es false
}
```
## Sentencia switch:
- La sentencia permite seleccionar una de varias opciones para ejecutar
un bloque de código cuando el valor corresponda a una opcion.
```java
switch(condición){
    case 1: código; break; //evalua si el valor corresponde realiza código y con break sale.
    case 2: código; break; //evalua si el valor corresponde realiza código y con break sale.
    case 3: código; break; //evalua si el valor corresponde realiza código y con break sale.
    default: código; //valor por defecto si no se selecciona una de las opciones
}
```
- La sentencia mejorada
```java
switch(condición){
    case 1 -> { código;} //evalua si el valor corresponde realiza código NO ES NECESARIO break PARA sale.
    case 2 -> { código;} //evalua si el valor corresponde realiza código NO ES NECESARIO break PARA sale.
    case 3 -> { código;} //evalua si el valor corresponde realiza código NO ES NECESARIO break PARA sale.
    default -> { código;} //valor por defecto si no se selecciona una de las opciones
}
```
