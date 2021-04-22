package list.types;

import characters.Boss;
import characters.Enemy;
import display.Display;
import listasMli.DoubleLinkedList;

public class ClassA extends BasicRow
{
    DoubleLinkedList hilera = super.hilera;

    public void createClassA()
    {
        for (int i = 0; i < 7; i++)
        {
            if (i == 3)
                hilera.add(new Boss(4));
            else {
                hilera.add(new Enemy(1));
            }
        }

        moveClassA();
    }

    protected void moveClassA()
    {
        super.moveBasicRow();
    }
}
