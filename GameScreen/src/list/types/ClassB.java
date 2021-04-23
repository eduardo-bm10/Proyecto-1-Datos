package list.types;

import characters.Boss;
import display.Display;
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
public class ClassB extends ClassA implements Runnable
{
    /**
     *
     */
    public void createClassB()
    {
        super.createClassA();
    }

    @Override
    protected void moveClassA()
    {
        super.moveClassA();
        new Thread(this).start();
    }

    private void swapBossInB()
    {
        DoubleNode current = hilera.head;
        DoubleNode tmp;
        for (int i = 0; i < 7; i++)
        {
            if (current.getValue() instanceof Boss)
            {
                tmp = current;
                current = current.getNext();
                current.setNext(tmp);
                Display.panel.updateUI();
                System.out.println("If block");
            }
            else{
                current = current.getNext();
                System.out.println("Else block");
            }
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                e.getMessage();
            }
        }
    }
    @Override
    public void run()
    {
        swapBossInB();
    }
}
