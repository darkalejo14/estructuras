public class Lista {

    Nodo inicio,fin;
    int cont=0;

    public Lista(){

        inicio=null;
        fin=null;
    }
    public Lista(Object d){
        Nodo nuevoNodo = new Nodo(d,inicio);
        inicio=nuevoNodo;
        fin=nuevoNodo;
    }


    public boolean estaVacia(){

        return inicio==null; //si inicio está vacía, retorna null
    }

    public void AgregarInicio(Object d){        //agrega elementos al inicio de la lista
        cont++;
        if(estaVacia()){ //verifica si la lista esta vacia

            inicio= new Nodo (d,inicio);
            fin=inicio;
        }else{
            inicio= new Nodo (d,inicio);
        }
    }

    public  int CantNodos(){
        return  cont;
    }

    public void EnseñarLista(){

        Nodo aux=inicio;

        while (aux!=null){//mientras la lista tenga elementos, se ejecuta el while

            System.out.print("|"+aux.dato+"|-");
            aux=aux.siguiente;

        }
    }

    public void AgregarAlFinal(Object d){
            cont++;
        if (estaVacia()){
            inicio= new Nodo (d);
            fin=inicio;
        }else{

            fin.siguiente=new Nodo(d);
            fin=fin.siguiente;

        }


    }

    public boolean EncontrarElemento(Object d){
        boolean encont=false;
        Nodo aux=inicio;

        while (encont!=true){
            if (d.equals(aux.dato)){
                encont=true;
                System.out.println("el elemento "+d+" SI existe.");
                return encont;
            }else{
                aux=aux.siguiente;

        }
    }System.out.println("el elemento "+d+" NO existe.");
        return encont;
    }

    public void EliminarDato(Object d){

        boolean encont=false;
        Nodo aux=inicio;
        Nodo anterior=null;

        for (int i=0;i<cont;i++){

            if (d.equals(aux.dato)){
                if(aux.dato==inicio.dato){
                    inicio=inicio.siguiente;



            }else {
                    anterior.siguiente=aux.siguiente;

                }

            }anterior=aux;
            aux=aux.siguiente;

            }

        }

        public void AnexarConIndice(Object d,int x){
            Nodo nuevo = new Nodo(d);

            Nodo aux=inicio;
            Nodo anterior=null;

            for (int i=0;i<x-1;i++){

                if(inicio==null||fin==null){
                    AgregarInicio(d);
                }else
                {   anterior=aux;
                    aux=aux.siguiente;

                }


            }nuevo.siguiente=aux.siguiente;
            aux.siguiente=nuevo;





        }


    }


