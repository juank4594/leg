package co.um.leg;

/**
 * Created with IntelliJ IDEA.
 * User: jucagut94
 * Date: 10/08/13
 * Time: 12:16
 * To change this template use File | Settings | File Templates.
 */
public class NodoLEG<E> {
    E dato;
    NodoLEG<E> siguiente;

    public NodoLEG(E dato) {
        this.dato = dato;
    }

    public NodoLEG(E dato, NodoLEG<E> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
