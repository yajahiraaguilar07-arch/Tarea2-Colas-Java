package Estructuras_Lineales.COLA;

public class ColaCircular {
    private int[] datos;
    private int frente;
    private int fin;
    private int tamano;
    private int capacidad;

    public ColaCircular(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException(
                "La capacidad debe ser mayor que cero"
            );
        }

        this.capacidad = capacidad;
        datos = new int[capacidad];
        frente = 0;
        fin = -1;
        tamano = 0;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

    public boolean estaLlena() {
        return tamano == capacidad;
    }

    public void encolar(int valor) {
        if (estaLlena()) {
            System.out.println("La cola está llena");
            return;
        }

        fin = (fin + 1) % capacidad;
        datos[fin] = valor;
        tamano++;
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }

        int valor = datos[frente];
        frente = (frente + 1) % capacidad;
        tamano--;

        return valor;
    }

    public int peek() {
        if (estaVacia()) {
            return -1;
        }

        return datos[frente];
    }

    public int contarElementos() {
        return tamano;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }

        System.out.print("Frente -> ");

        for (int i = 0; i < tamano; i++) {
            int indice = (frente + i) % capacidad;
            System.out.print("[" + datos[indice] + "] ");
        }

        System.out.println("<- Fin");
    }
}
