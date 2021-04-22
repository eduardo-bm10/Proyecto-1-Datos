package list.types;

import listasMli.DoubleLinkedList;
import listasMli.DoubleNode;

public class ClassB extends ClassA
{
    DoubleLinkedList hilera = super.hilera;

    public void createClassB()
    {
        super.createClassA();
        moveBasicRow();
    }

    @Override
    protected void moveClassA() {
        super.moveClassA();

        hilera.swap(3);
    }
}
