package co.um.leg;

/**
 * Created with IntelliJ IDEA.
 * User: jucagut94
 * Date: 10/08/13
 * Time: 12:18
 * To change this template use File | Settings | File Templates.
 */
public class LEG<E> {
    protected NodoLEG<E> primero; protected int talla;

    public LEG() {
        this.primero = null;
        this.talla = 0;
    }

    public void insertar(E x){
        primero=new NodoLEG<E>(x,primero); this.talla++;
    }

    public void insertarEnFin(E x){
        NodoLEG<E> nl=new NodoLEG<E>(x); this.talla++;
        NodoLEG<E> aux= primero;
        if (aux==null) primero=nl;
        else {
            while (aux.siguiente!=null) aux=aux.siguiente;
            aux.siguiente=nl;
        }
    }

    public String toString(){
        String res = "";
        for (NodoLEG<E> aux = primero; aux!=null;aux=aux.siguiente){
            res += aux.dato.toString()+"\n";
        }
        return res;
    }

    public boolean eliminar(E x){
        NodoLEG<E> aux=primero, ant = null; boolean res=false;
        while (aux!=null && !aux.dato.equals(x)){
            ant=aux; aux=aux.siguiente;
        }
        if (aux!=null){
            res=true;this.talla--;
            if (ant==null) primero=aux.siguiente;
            else ant.siguiente=aux.siguiente;
        }
        return res;
    }
}
