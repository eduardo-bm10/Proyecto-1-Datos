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
    public Enemy enemigo1 = new Enemy(1);
    public Enemy enemigo2 = new Enemy(1);
    public Enemy enemigo3 = new Enemy(1);
    public Enemy enemigo4 = new Enemy(1);
    public Enemy enemigo5 = new Enemy(1);
    public Enemy enemigo6 = new Enemy(1);
    public Enemy enemigo7 = new Enemy(1);

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
        hilera.add(enemigo1);
        hilera.add(enemigo2);
        hilera.add(enemigo3);
        hilera.add(enemigo4);
        hilera.add(enemigo5);
        hilera.add(enemigo6);
        hilera.add(enemigo7);
        moveBasicRow();
    }

    /**
     * Realiza por separado cada movimiento de cada objeto en la lista enlazada.
     * Mientras la hilera esté en pantalla, se seguirá invocando a la función movimiento.
     * Por medio de un Thread.sleep se da un tiempo y distancia entre cada enemigo.
     *
     * @author Eduardo Bolívar
     *
     * @see listasMli.DoubleLinkedList
     * @see listasMli.DoubleNode
     * @see java.lang.Thread
     * @see display.Display
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

    protected void colision()
    {

    }
}
