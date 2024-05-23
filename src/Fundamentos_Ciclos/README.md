## Ciclos en Java

Los ciclos o bucles en Java se utilizan para ejecutar de manera
repetitiva un bloque de código mientras la condición a evaluar sea 
verdadera.

## Existen 3 tipos de ciclos:

### Ciclo ***While***
- Este bucle se ejecutará cuantas veces sea posible hasta que la 
condición deje de ser verdadero.
- [x] Sintaxis
```java
while(condición){
    //Bloque de código a ejecutar
}
```

### Ciclo ***do while***
- El ciclo do - while en Java e suna estructura de control que permite 
ejecutar un bloque de código al menos una vez y luego repetir la ejecución
del bloque mientras la condición a evaluar sea verdadera.
- A diferencia del ciclo while, el ciclo do - while evalúa la condición
después de ejecutar el bloque de código, garantizando que el bloque se ejecute
al menos una vez.
- [x] Sintaxis
```java
do{
    //Bloque de código a ejecutar
}while(condición);
```

### Ciclo ***for***
- El ciclo for se utiliza para ejecutar repetidamente un bloque de código un 
número específico de veces.
- Es especialmente útil cuando se conoce de antemano cuántas veces se debe repetir
una acción.
- [x] Inicialización: solo se ejecuta una vez, al inicio del ciclo. No se vuelve
a ejecutar con cada iteración.
- [x] Condición: si la condición es verdadera, se ejecuta el bloque de código, si
es falsa el ciclo termina.
- [x] Actualización: Se ejecuta al final de cada iteración del ciclo y se utiliza 
para actualizar las variables de control, como el incremento o descuento de las 
variables de tipo contador.
- [x] Sintaxis
```java
for(inicialización; condición; actualización){
    //Bloque de código a ejecutar
}
```
## Uso de ***break*** en Java
- La palabra clave break se utiliza para salir de un ciclo antes de que haya 
terminado normalmente. Cuando se encuentra break dentro de un ciclo, el control 
del programa se transfiere inmediatamente a la línea de código que sigue al ciclo.
- [x] Sintaxis
```java
for(inicialización; condición; actualización){
    //Bloque de código a ejecutar
    if(condición){
        break;
    }
    //más código
}
```

## Uso de ***continue*** en Java
- La palabra continue se utiliza para saltar la iteración actual del ciclo y continuar
con la siguiente. Cuando se encuentra continue dentro de un ciclo, el control del programa
se transfiere inmediatamente al comienzo de la próxima iteración del ciclo.
- [x] Sintaxis
```java
for(inicialización; condición; actualización){
    //Bloque de código a ejecutar
    if(condición){
        continue;
    }
    //más código
}
```