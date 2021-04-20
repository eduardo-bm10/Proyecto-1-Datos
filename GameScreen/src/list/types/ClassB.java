package list.types;

import listasMli.DoubleLinkedList;

import java.util.Random;

public class ClassB extends ClassA
{
    DoubleLinkedList hilera = super.hilera;
    int posicionJefe = 3;

    public void createClassB()
    {
        super.createClassA();
        moveBasicRow();
    }

    @Override
    protected void moveBasicRow()
    {
        super.moveBasicRow();

        while (hilera.get(0) != null)
        {
            changeBoss(new Random().nextInt(7));

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.err.println("Error en movimiento de enemigo");
            }
        }
    }

    public void changeBoss(int newIndex)
    {

    }
}
