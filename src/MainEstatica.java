import Estructuras_Lineales.COLA.ColaEstatica;

public class MainEstatica {
    public static void main(String[] args) {
        ColaEstatica cola = new ColaEstatica(5);

        System.out.println("=== COLA ESTATICA ===");

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        System.out.println("Elementos de la cola:");
        cola.mostrar();

        System.out.println("Primer elemento (peek): " + cola.peek());
        System.out.println("Cantidad de elementos: " + cola.contarElementos());

        System.out.println("Elemento eliminado: " + cola.desencolar());

        System.out.println("Cola después de eliminar:");
        cola.mostrar();

        System.out.println("Primer elemento actual: " + cola.peek());
        System.out.println("Cantidad actual: " + cola.contarElementos());
    }
}
