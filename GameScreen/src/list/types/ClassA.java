package list.types;

import characters.Boss;
import characters.Enemy;
import listasMli.DoubleLinkedList;

public class ClassA extends BasicRow
{
    DoubleLinkedList hilera = new DoubleLinkedList<Boss>();

    public void createClassA()
    {
        for (int i = 0; i < 7; i++)
        {
            if (i == 4)
                hilera.add(new Boss(4));
            else {
                hilera.add(new Enemy(1));
            }
        }
    }

    @Override
    public void moverHilera() {
        super.moverHilera();

    }
}
