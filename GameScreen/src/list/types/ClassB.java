package list.types;

import listasMli.DoubleLinkedList;
import listasMli.DoubleNode;

/**
 * Clase ClassB genera una hilera a partir de la clase ClassA
 * Hereda de la clase ClassA para implementar sus métodos.
 *
 * @author Eduardo Bolívar
 * @version 2.0
 *
 * @see list.types.ClassA
 */
public class ClassB extends ClassA
{
    /**
     * 
     */
    public void createClassB()
    {
        super.createClassA();
        moveClassB();
    }

    /**
     *
     */
    protected void moveClassB() {
        super.moveClassA();


    }
}
