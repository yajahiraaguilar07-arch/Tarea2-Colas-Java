import Estructuras_lineales.COLA.ColaDinamica;

public class MainDinamica {
    public static void main(String[] args) {
        ColaDinamica cola = new ColaDinamica();

        System.out.println("=== COLA DINAMICA ===");

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
