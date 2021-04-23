package listasMli;


    /**
     * Class Node
     * Permite recorrer la informacion/valores a lo largo de la lista enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see Node
     */



public class Node<T> {
    private T value;
    private Node<T> next;

        /**
         * Metodo Node
         * Posee un nodo que se dirigue al siguiente valor de la lista enlazada
         *
         * @author Melisa Oviedo
         * @version 1.0
         */


    public Node()
    {
        this.value = null;
        next = null;

    }

        /**
         * metodo getValue
         * Permite obtener el valor de la lista enlazada
         *
         * @author Melisa Oviedo
         * @version 1.0
         */

    public T getValue() {
        return value;
    }
        /**
         * Metodo setValue
         * Permite establecer el valor de la lista enlazada
         *
         * @author Melisa Oviedo
         * @version 1.0
         */

    public void setValue(T value) {
        this.value = value;
    }
        /**
         * Metodo getNext
         *Permite obtener el siguiente valor de la lista enlazada
         *
         * @author Melisa Oviedo
         * @version 1.0
         */

    public Node<T> getNext() {
        return next;
    }
        /**
         * Metodo setNext
         * Permite establecer el siguiente valor de la lista enlazada
         *
         * @author Melisa Oviedo
         * @version 1.0
         */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}