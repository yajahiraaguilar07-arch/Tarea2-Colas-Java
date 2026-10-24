import Estructuras_Lineales.COLA.ColaCircular;

public class MainCircular {
    public static void main(String[] args) {
        ColaCircular cola = new ColaCircular(3);

        System.out.println("=== COLA CIRCULAR ===");

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        System.out.println("Cola inicial:");
        cola.mostrar();

        System.out.println("Primer elemento (peek): " + cola.peek());
        System.out.println("Cantidad de elementos: " + cola.contarElementos());

        System.out.println("Elemento eliminado: " + cola.desencolar());

        cola.encolar(40);

        System.out.println("Cola después de eliminar 10 y agregar 40:");
        cola.mostrar();

        System.out.println("Primer elemento actual: " + cola.peek());
        System.out.println("Cantidad actual: " + cola.contarElementos());
    }
}
