package list.types;

import listasMli.DoubleLinkedList;
import listasMli.DoubleNode;

public class ClassB extends ClassA
{
    public void createClassB()
    {
        super.createClassA();
        moveClassB();
    }

    protected void moveClassB() {
        super.moveClassA();


    }
}
