package listasMli;



/**
 * Class DoubleCircleList
 * Permite un doble puntero para leer la informacion ambos punteros tienen direcciones contrarias
 * Está lista no posee fin
 * @author Melisa Oviedo
 * @version 1.0
 * @see DoubleCircleList
 */

public class DoubleCircleList<T> implements List<T> {
    private DoubleNode<T> head;
    private int size;
    public DoubleCircleList(){
        head = null;
        size =0;
    }

    /**
     * Metodo add
     * Permite añadir valores a la lista circular doble enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */


    @Override
    public void add(T value) {
        DoubleNode<T> newNode = new DoubleNode<T>();
        newNode.setValue(value);
        if(head == null){
            head = newNode;
            head.setNext(head);
            head.setPrev(head);
            ++size;
        }else{
            DoubleNode<T> current = head;
            while (current.getNext() != head){
                current = current.getNext();

            }
            current.setNext(newNode);
            newNode.setNext(head);
            newNode.setPrev(current);
            ++size;
        }

    }


    /**
     * Metodo remove
     * Permite remover valores que se encuentre en la lista circular doble enlazada
     *
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */
    @Override
    public void remove(int index) {
        if(index ==0){
            head.getPrev().setNext(head.getNext());
            head.getNext().setPrev(head.getPrev());
            head = head.getNext();
            --size;
        }else if(index <= size/2){
            DoubleNode<T> current = head;
            for(int c =0;c<=index;c++){
                current = current.getNext();
            }
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());

        }else if(index > size/2){
            DoubleNode<T> current = head;
            for(int c = size; c >= index; c--){
                current = current.getPrev();

            }
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());


        }

    }
    /**
     * Metodo get
     * Permite acceder a los valores de la lista circular doble enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */

    @Override
    public T get(int index) {
        if(index ==0){
            return head.getValue();
        }else if(index<= size/2){
            DoubleNode<T> current = head;
            for(int c =0;c<=index;c++){
                current = current.getNext();
            }
            return current.getValue();
        }else if(index > size/2){
            DoubleNode<T> current = head;
            for(int c = size;c>= index;c--){
                current = current.getNext();
            }
            return current.getValue();

        }else{
            return null;
        }
    }
    /**
     * Metodo size
     * Permite obtener el tamaño de la lista circular doble enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */

    @Override
    public int size() {
        return size;
    }
    /**
     * Metodo clear
     * Permite poner la posición de la lista circular doble enlazada en cero
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */

    @Override
    public void clear() {
        head = null;
        size = 0;

    }
    /**
     * Metodo swap
     * Intercambia los valores de index1 e index2 en la lista circular doble enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     * @see DoubleNode
     */

    @Override
    public void swap(int index1, int index2) {

    }
}
