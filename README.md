Tarea 2 - Unidad 3: Estructuras de Datos en Java

Descripción

Este proyecto implementa tres tipos de colas en Java: cola estática, cola circular y cola dinámica. Cada implementación permite agregar, eliminar y consultar elementos.

Objetivo

Comprender el funcionamiento de las estructuras de datos tipo cola y comparar sus características, operaciones y administración de memoria.

Estructura del proyecto

src/
├── Estructuras_lineales/
│   ├── Nodo.java
│   └── COLA/
│       ├── ColaEstatica.java
│       ├── ColaCircular.java
│       └── ColaDinamica.java
├── MainEstatica.java
├── MainCircular.java
└── MainDinamica.java

Operaciones implementadas

- "encolar()": agrega un elemento al final de la cola.
- "desencolar()": elimina y devuelve el primer elemento.
- "peek()": consulta el primer elemento sin eliminarlo.
- "contarElementos()": devuelve la cantidad de elementos.
- "mostrar()": muestra los elementos de la cola.
- "estaVacia()": verifica si la cola está vacía.

Tipos de colas

- Cola estática: utiliza un arreglo de capacidad fija.
- Cola circular: reutiliza las posiciones libres del arreglo.
- Cola dinámica: utiliza nodos enlazados y ajusta su tamaño según los elementos almacenados.

Ejecución

El proyecto contiene tres clases principales independientes para probar cada implementación: "MainEstatica", "MainCircular" y "MainDinamica".

Autora

Yajahira Aguilar
