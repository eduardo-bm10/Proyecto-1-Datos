package list.types;

import characters.Boss;
import characters.Enemy;
import display.Display;

public class Row implements RowFactory
{
    Enemy enemigo = new Enemy(1);
    Boss jefe = new Boss(3);

    @Override
    public void createBasic()
    {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 7; i++)
        {
            list.insertLast(enemigo);
            Display.window.add(list.tail.getEnemigo());
        }
    }

    @Override
    public void createClassA()
    {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 7; i++)
        {
            if (i == 4)
                list.insertFirst(jefe);
            list.insertFirst(enemigo);
            Display.window.add(list.head.getEnemigo());
        }
    }

    @Override
    public void createClassB()
    {
        CircularLinkedList list = new CircularLinkedList();

        createClassA();
        jefe.alternatePositionInB(list);
    }

    @Override
    public void createClassC() {

    }

    @Override
    public void createClassD() {

    }

    @Override
    public void createClassE() {

    }
}

