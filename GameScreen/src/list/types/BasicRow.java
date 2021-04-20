package list.types;

import characters.Enemy;
import display.Display;
import listasMli.DoubleLinkedList;

public class BasicRow
{
    DoubleLinkedList hilera = new DoubleLinkedList();

    public void createBasicRow()
    {
        for (int i = 0; i < 7; i++ )
        {
            hilera.add(new Enemy(1));
        }

        moveBasicRow();
    }

    protected void moveBasicRow()
    {
        int i = 0;
        while (hilera.get(i) != null)
        {
            Display.panel.add(hilera.get(i));
            Display.panel.updateUI();
            new Thread(hilera.get(i)).start();
            i++;
            try
            {
                Thread.sleep(400);
            }
            catch (InterruptedException e)
            {
                System.err.println("Error en tiempo de generar enemigos");
            }
        }
    }
}
