package list.types;

import listasMli.DoubleLinkedList;
import listasMli.DoubleNode;

public class ClassB extends ClassA
{
    DoubleLinkedList hilera = super.hilera;

    public void createClassB()
    {
        super.createClassA();
        moveClassB();
    }

    protected void moveClassB() {
        super.moveClassA();


    }
}
