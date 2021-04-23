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
    public Enemy enemigo1 = new Enemy(1);
    public Enemy enemigo2 = new Enemy(1);
    public Enemy enemigo3 = new Enemy(1);
    public Enemy enemigo4 = new Enemy(1);
    public Enemy enemigo5 = new Enemy(1);
    public Enemy enemigo6 = new Enemy(1);
    public Enemy jefe1 = new Boss(4);

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
        hilera.add(enemigo1);
        hilera.add(enemigo2);
        hilera.add(enemigo3);
        hilera.add(jefe1);
        hilera.add(enemigo4);
        hilera.add(enemigo5);
        hilera.add(enemigo6);
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
