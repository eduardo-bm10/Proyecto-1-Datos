package listasMli;




/**
 * Class CircleList
 *La lista de circular posee un punto inicial
 * Permite pasar por cada valor solo que está lista no posee fin.
 *
 * @author Melisa Oviedo
 * @version 1.0
 *
 * @see CircleList
 */
public class CircleList<T> implements List<T>{
    private Node<T> head;
    private int size;

    public CircleList(){
        head = null;
        size =0;

    }
    /**
     * Metodo add
     *Permite añadir valores a la lista circular enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */

    @Override
    public void add(T value) {
        Node<T> newNode = new Node<T>();
        newNode.setValue(value);
        if(head == null){
            head = newNode;
            head.setNext(head);
            ++size;
        }else{
            Node<T> current = head;
            while(current.getNext()!=head){
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setNext(head);
            ++size;
        }

    }
    /**
     * Metodo remove
     *Permite remover valores que se encuentre en la lista circular enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */

    @Override
    public void remove(int index) {
        if (index == 0 && index < size) {
            head = head.getNext();
        } else {
            Node<T> current = head;
            int count = 0;
            while (count < index - 1) {
                current = current.getNext();
                count++;
            }
            current.setNext(current.getNext().getNext());
        }
        --size;
    }
    /**
     * Metodo get
     *Permite acceder a los valores de la lista circular enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */

    @Override
    public T get(int index) {
        Node<T> current = head;
        for(int i =0;i<index;i++){
            current = current.getNext();
        }
        return current.getValue();
    }
    /**
     * Metodo size
     *Permite obtener el tamaño de la lista circular enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */

    @Override
    public int size() {
        return this.size;
    }

    /**
     * Metodo clear
     * Permite poner la posición de la lista circular enlazada en cero
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */

    @Override
    public void clear() {
        this.head=null;
        this.size = 0;

    }
    /**
     * Metodo swap
     * Intercambia los valores de index1 e index2 en la lista circular enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */

    @Override
    public void swap(int index1, int index2) {

    }
}
