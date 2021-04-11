package list.types;

import characters.Boss;
import characters.Enemy;
import display.Display;

public class Row extends LinkedList implements RowFactory
{
    Enemy enemigo = new Enemy(1);
    Boss jefe = new Boss(3);

    @Override
    public void createBasic()
    {
        for (int i = 0; i < 7; i++)
        {
            insertFirst(enemigo);
            Display.window.add(head.getEnemigo());
        }
    }

    @Override
    public void createClassA()
    {
        for (int i = 0; i < 7; i++)
        {
            if (i == 4)
                insertFirst(jefe);
            insertFirst(enemigo);
            Display.window.add(head.getEnemigo());
        }
    }

    @Override
    public void createClassB()
    {
        createClassA();
        jefe.alternatePositionInB();
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

