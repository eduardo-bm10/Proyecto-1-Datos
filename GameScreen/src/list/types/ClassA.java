package list.types;

import characters.Boss;
import characters.Enemy;
import display.Display;
import listasMli.DoubleLinkedList;

/**
 * Clase ClassA instancia una hilera a partir de la clase BasicRow.
 * Crea una hilera de seis enemigos comunes y un enemigo jefe y la añade a la pantalla.
 * Hereda de la clase BasicRow.
 *
 * @author Eduardo Bolívar
 * @version 2.0
 *
 * @see list.types.BasicRow
 */
public class ClassA extends BasicRow
{
    DoubleLinkedList hilera = super.hilera;

    /**
     * Añade uno por uno, los siete enemigos a la hilera previamente instanciada.
     * En la posición cuatro de la hilera, añade al enemigo jefe.
     * Invoca al método moveClassA.
     *
     * @author Eduardo Bolívar
     *
     * @see listasMli.DoubleLinkedList
     */
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

    /**
     * Permite el movimiento de la hilera a partir del método moveBasicRow.
     *
     * @author Eduardo Bolívar
     *
     * @see list.types.BasicRow
     */
    protected void moveClassA()
    {
        super.moveBasicRow();
    }
}
