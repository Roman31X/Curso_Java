# INTRODUCCIÓN A __JAVA__

* Java es un lenguaje de alto nivel, compilado y de propósito general.
* Fue creado por __James Gosling__ en __1995__.
* Java sigue siendo uno de los lenguajes de programación más demandados y
utilizados en la industria de software.

## RAZONES PARA APRENDER __JAVA__

### Ofrece __Amplitud__ y __Diversidad de Aplicaciones__

* Podemos decir que Java es omnipresente. Se utiliza en una gran variedad de 
aplicaciones como son:
    -  __Desarrollo de web__ (Spring y Hibernate).
    -  __Aplicaciones Móviles__ (Android).
    -  __Sistemas Empresariales__ (Spring y Jakarta EE).
    -  __Aplicaciones de Escritorio__ (Swing y Java FX).

## CARACTERÍSTICAS DE __JAVA__

- [x] PORTABILIDAD E INDEPENDENCIA DE PLATAFORMA
    + Una de las mayores fortalezas de Java es su lema: ***Escribe una vez, ejecuta
  en cualquier lugar***. Esto significa que el código compilado Java, se puede ejecutar
  en cualquier sistema operativo o plataforma que tenga instalado una máquina virtual
  de Java (JVM - Java Virtual Machine).

- [x] SEGURIDAD Y RENDIMIENTO
    + Java fue diseñada con la seguridad en mente. Su arquitectura incluye características
  que protegen contra una amplia gama de amenazas y vulnerabilidades. Además, las la 
  gestión automática de memoria mediante su recolector de basura y su arquitectura
  multi-hilo la hacen muy eficiente y rápida.

- [x] COMUNIDAD Y ECOSISTEMA
    + Java cuenta con una de las comunidades de desarrolladores más grandes y activas del
  mundo. Esto significa que hay una basta cantidad de recursos, bibliotecas, frameworks y
  herramientas disponibles para facilitar el desarrollo y la solución de problemas.

- [x] OPORTUNIDADES PROFESIONALES
    + El mercado laboral para Java es muy amplio y está en crecimiento. Empresas de todo 
  el mundo busca desarrolladores Java para cubrir posiciones laborales en muy diversos sectores, 
  además de muy bien remunerados.

- [x] INNOVACIONES Y FUTURO
    + Java no solo es un lenguaje de programación es una plataforma versátil y potente que ha 
  resistido la prueba del tiempo. Java sigue evolucionando con nuevas versiones y nuevas 
  características por la que Java sigue siendo una excelente inversion.

## ¿QUE ES EL JDK DE JAVA?

El JDK es (Java Development Kit) de Java nos sirve para ejecutar los programas de Java el 
cual contiene herramientas, como compilador y una máquina virtual de Java. El cual el 
compilador es un programa que traduce el código Java a un lenguaje de bajo nivel o código 
máquina que puede ser ejecutado directamente por el sistema operativo.

### ¿COMO FUNCIONA?

El compilador de Java __(javac)__ convierte el código fuente __(.java)__ en bytecode __(.class).
El bytecode es un formato intermedio que es independiente de plataforma y ejecutado en cualquier
sistema operativo que tenga una Máquina Virtual de Java (JVM).

## RELACIÓN ENTRE JDK Y JRE

- [x] El JDK incluye el JRE más las herramientas de desarrollo necesarias (como el compilador). 
- [x] El JRE incluye solamente lo necesario para ejecutar aplicaciones Java más no para desarrollar.

En resumen, cuando instalamos los JDK, también se instala el JRE como parte de paquete de instalación.
Lo que significa que tendrás todas las herramientas necesarias para desarrollar como para ejecutar
programas Java.

<style>
      .primero {border: thin solid black; padding: 20px;}
      .segundo {border: thin solid red; padding: 20px;}
      .tercero {border: thin solid green; padding: 20px;}
</style>

<div class="primero" align="center">
JDK (comando javac, debugging, herramientas desarrollo)
  <div class="segundo">
    JRE (comando java para ejecutar el bytecode (.class)<br>
    verifica de bytecode, Java API(biblioteca))
    <div class="tercero">
    JVM (Interprete JIT(Just in Time), Recolector Basura)
    </div>
  </div>
</div>
