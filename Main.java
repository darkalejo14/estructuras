public class Main {

    public static void main(String[] args) {


        Lista lista1 = new Lista();
        System.out.println("\n==========Crear lista con un Elemento==========\n");
        lista1.AgregarInicio("Primer elemento Sofía");

        lista1.EnseñarLista();
        System.out.println("");
        System.out.println("\n==========Agregar Elementos al inicio==========\n");
        for (int i = 0; i < 10; i++) {

            lista1.AgregarInicio(i);

        }
        lista1.EnseñarLista();
        System.out.println("\nCantidad de elementos en la lista: " + lista1.cont);
        System.out.println("");

        System.out.println("\n==========Agregar Elementos al Final==========\n");
        for (int i = 0; i < 10; i++) {

            lista1.AgregarAlFinal(i);
        }
        lista1.EnseñarLista();
        System.out.println("\nCantidad de elementos en la lista: " + lista1.cont);
        System.out.println("");

        System.out.println("\n==========Encontrar elementos en la lista==========\n");
        lista1.EncontrarElemento(9);
        System.out.println("\n==========Elimminar elementos en la lista==========\n\nElemento a eliminar: Primer elemento Sofía");


        lista1.EliminarDato("Primer elemento Sofía");
        lista1.EnseñarLista();
        System.out.println("");
        System.out.println("\n==========Agregar elementos en la lista==========\n\nElemento a eliminar: Primer elemento Sofía. Posición: después del nodo 10.");
        lista1.AnexarConIndice("Primer elemento Sofía", 10);
        lista1.EnseñarLista();

    }
}