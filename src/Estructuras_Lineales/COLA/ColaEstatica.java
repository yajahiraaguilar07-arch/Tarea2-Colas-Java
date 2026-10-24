package Estructuras_Lineales.COLA;

public class ColaEstatica {
    private int[] datos;
    private int frente;
    private int fin;
    private int tamano;
    private int capacidad;

    public ColaEstatica(int capacidad) {
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

        datos[++fin] = valor;
        tamano++;
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }

        int valor = datos[frente++];
        tamano--;
        return valor;
    }

    public int peek() {
        return estaVacia() ? -1 : datos[frente];
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
        for (int i = frente; i <= fin; i++) {
            System.out.print("[" + datos[i] + "] ");
        }
        System.out.println("<- Fin");
    }
}
