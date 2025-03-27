public class EJ_Interface {
    public static void main(String[] args) {
        Nodo N1 = new Nodo("Nodo 1", 30);
        Nodo N2 = new Nodo("Nodo 2", 40);
        Nodo N3 = new Nodo("Nodo 3", 50);

        N1.conectarDerecha(N2);
        System.out.println(N1.nombre + " conectado con " + N1.nodoDerecha.nombre);
        System.out.println(N2.nombre + " conectado con " + N2.nodoIzquierda.nombre);

        N2.conectarDerecha(N3);
        System.out.println(N2.nombre + " conectado con " + N2.nodoDerecha.nombre);
        System.out.println(N3.nombre + " conectado con " + N3.nodoIzquierda.nombre);

    }
}
interface Conectable{
    void conectarDerecha(Nodo otro);
    void conectarIzquierda(Nodo otro);
}

 class Nodo implements Conectable{
    String nombre;
    int valor;
    Nodo nodoIzquierda;
    Nodo nodoDerecha;

    public Nodo(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
        this.nodoIzquierda = null;
        this.nodoDerecha = null;
    }

     @Override
     public void conectarDerecha(Nodo otro) {
         this.nodoDerecha = otro;
         otro.conectarIzquierda(this);
     }

     @Override
     public void conectarIzquierda(Nodo otro) {
         this.nodoIzquierda = otro;
         if(otro.nodoDerecha!=this){
             otro.nodoDerecha = this;
         }
     }
 }
