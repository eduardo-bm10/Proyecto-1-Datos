package list.types;

import characters.Enemy;
import display.Display;
import listasMli.DoubleLinkedList;

/**
 * Clase BasicRow instancia una lista doblemente enlanzada.
 * Permite acceder a sus métodos para crear una hilera básica y mover la hilera.
 *
 * @author Eduardo Bolívar
 * @version 1.0
 *
 * @see listasMli.DoubleLinkedList
 * @see listasMli.DoubleNode
 */
public class BasicRow
{
    DoubleLinkedList hilera = new DoubleLinkedList();

    /**
     * Añade uno por uno, siete enemigos comunes a la lista enlazada previamente instanciada.
     * Invoca al método moveBasicRow para empezar a mover la hilera a través de la ventana.
     *
     * @author Eduardo Bolívar
     *
     * @see listasMli.DoubleLinkedList
     * @see listasMli.DoubleNode
     */
    public void createBasicRow()
    {
        for (int i = 0; i < 7; i++ )
        {
            hilera.add(new Enemy(1));
        }

        moveBasicRow();
    }

    /**
     * 
     */
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
