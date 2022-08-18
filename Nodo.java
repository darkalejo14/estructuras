public class Nodo {

    public Object dato;
    public Nodo siguiente;

    public Nodo(Object d,Nodo sig){

        this.dato=d;
        this.siguiente=sig;
    }

    public Nodo(Object d){

        this.dato=d;
        this.siguiente=null;

    }

}


