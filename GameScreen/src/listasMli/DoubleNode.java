package listasMli;


/**
 * Class DoubleNode
 * Permite recorrer la información en una lista doble enlazada
 *
 * @author Melisa Oviedo
 * @version 1.0
 * @see DoubleNode
 */
public class DoubleNode<T>
{
    private DoubleNode<T> next;
    private DoubleNode<T> prev;
    private T value;

    /**
     * Metodo DoubleNode
     * Permite que haya un node que obtenga el valor previo y un nodo que obtenga el valor siguiente
     *
     * @author Melisa Oviedo
     * @version 1.0
     */
    public DoubleNode()
    {
        this.next = null;
        this.prev = null;
        this.value = null;
    }
    /**
     * Metodo getNext
     * Permite obtener el siguiente elemento de la lista enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     */

    public DoubleNode<T> getNext() {
        return next;
    }
    /**
     * Metodo setNext
     * Permite establecer el siguiente elemento de la lista enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     */

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }
    /**
     * Metodo getPrev
     * Permite obtener el elemento anterior de la lista enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     */


    public DoubleNode<T> getPrev() {
        return prev;
    }
    /**
     * Metodo setPrev
     * Permite establecer el elemento anterior de la lista enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     */

    public void setPrev(DoubleNode<T> prev) {
        this.prev = prev;
    }
    /**
     * Metodo getValue
     * Permite obtener el valor del nodo
     *
     * @author Melisa Oviedo
     * @version 1.0
     */


    public T getValue() {
        return value;
    }

    /**
     * Metodo setValue
     * Permite establecer el valor del nodo
     *
     * @author Melisa Oviedo
     * @version 1.0
     */
    /**
     * Metodo setValue
     * Permite establecer el valor del nodo
     *
     * @author Melisa Oviedo
     * @version 1.0
     */


    public void setValue(T value) {
        this.value = value;
    }

}
