# MundoAnimal 🐾

Aplicación en Java que aplica los principios de la POO (herencia, clases abstractas, interfaces, sobrescritura y polimorfismo).

## 📁 Estructura

src/mx/com/animales/
|
├── Animal.java (Abstracta)
|
├── Movible.java (Interfaz)
|
├── Perro.java
|
├── Gato.java
|
├── Vaca.java
|
├── Caballo.java
|
└── Main.java


## 🚀 Ejecución

Clonar: git clone https://github.com/danielamag98/MundoAnimal.git

Abrir en IntelliJ IDEA con JDK 17+.

Ejecutar Main.java.


## 💻 Salida Esperada

Nombre: Milo | Edad: 4 | Sonido: Guau guau | Movimiento: Corre

Nombre: Hoschi | Edad: 7 | Sonido: Guau gua | Movimiento: Ccorre

Nombre: Daicy | Edad: 1 | Sonido: Miau miau | Moverse: Camina sigilosamente

Nombre: Lola | Edad: 11 | Sonido: Muuuuuu | Moverse: Camina lento

Nombre: Spirit | Edad: 8 | Sonido: Brrrr | Moverse: Corre velozmente

Nombre: Luna | Edad: 15 | Sonido: Brrrr | Moverse: Corre velozmente



## ❓ Preguntas de Reflexión
1. ¿Qué se reutiliza al heredar de Animal?
Los atributos (nombre y edad) y los métodos concretos (como mostrarInformacion()), lo que evita duplicar código en las clases hijas.

2. ¿Qué hace super(nombre, edad)?
Llama al constructor de la clase padre (Animal) para inicializar los atributos heredados dentro de la clase hija.

3. ¿Para qué sirve @Override?
Indica que se está sobrescribiendo un método de la clase padre o interfaz, ayudando a tu escribir exactamente lo que quieres en esa clase hija.

4. ¿Por qué el mismo método hacerSonido() produce resultados distintos?
Gracias al polimorfismo y la sobrescritura de métodos, ya que cada clase hija (Perro, Gato, Vaca) define su propia implementación del comportamiento.

5. ¿Cuál es la diferencia entre una clase abstracta y una interfaz?
 - Clase abstracta: Permite compartir código base, atributos y métodos concretos mediante herencia simple (extends).
 - Interfaz: Define un contrato de comportamientos puros sin estado, permitiendo que una clase implemente múltiples contratos a la vez (implements).
