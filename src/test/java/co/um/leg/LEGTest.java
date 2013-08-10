package co.um.leg;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: jucagut94
 * Date: 10/08/13
 * Time: 12:40
 * To change this template use File | Settings | File Templates.
 */
public class LEGTest {
    @Test
    public void testInsertar() throws Exception {
        LEG<Integer> l1=new LEG<Integer>();
        l1.insertar(new Integer(9));
        l1.insertar(new Integer(12));
        System.out.println("Lista Integer actual: \n"+ l1.toString());
    }
    @Test
    public void testInsertarEnFin() throws Exception {
        LEG<Integer> l1=new LEG<Integer>();
        l1.insertar(new Integer(9));
        l1.insertar(new Integer(12));
        l1.insertarEnFin(new Integer(4));
        System.out.println("Lista Integer actual: \n"+ l1.toString());
    }
    @Test
    public void testToString() throws Exception {
        LEG<Integer> l1=new LEG<Integer>();
        l1.insertar(new Integer(9));
        l1.insertar(new Integer(12));
        System.out.println("Lista Integer actual: \n"+ l1.toString());
    }
    @Test
    public void testEliminar() throws Exception {
        LEG<Integer> l1=new LEG<Integer>();
        l1.insertar(new Integer(9));
        l1.insertar(new Integer(12));
        System.out.println("Lista Integer actual: \n"+ l1.toString());
        l1.eliminar(new Integer(9));
        System.out.println("Lista Integer borrado: \n"+ l1.toString());

    }
}
