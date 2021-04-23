package listasMli;

import characters.Boss;
import characters.Enemy;

/**
 * Class DoubleLinkedList
 * Permite un doble puntero para leer la informacion ambos punteros tienen direcciones contrarias
 *
 * @author Melisa Oviedo
 * @version 1.0
 * @see DoubleLinkedList
 */
public class DoubleLinkedList<T extends Enemy> implements List<T>
{
    public DoubleNode<T> head;
    private int size;


    /**
     * Metodo DoubleLinkedList
     * Habilita la posibilidad para agregar valores de la lista doble enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     */

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }
    /**
     * Metodo add
     * Permite añadir valores a la lista doble enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     */

    @Override
    public void add(T value)
    {
        DoubleNode<T> newNode = new DoubleNode<T>();
        newNode.setValue(value);
        if(head == null) {
            head = newNode;
            size++;
            return;
        }
        DoubleNode<T> current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        newNode.setPrev(current);
        current.setNext(newNode);
        size++;
    }
    /**
     * Metodo remove
     * Permite remover valores que se encuentre en la lista doble enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     */

    @Override
    public void remove(int index) {
        if(index == 0 && index < size) {
            head = head.getNext();
            size--;
            return;
        }
        DoubleNode<T> current = head;
        int counter = 0;
        while(counter < index-1 && current.getNext() != null) {
            current = current.getNext();
            counter++;
        }
        if(counter == size-2) {
            current.setNext(null);
            size--;
            return;
        } else {
            current.setNext(current.getNext().getNext());
            size--;
            return;
        }
    }
    /**
     * Metodo get
     * Permite acceder a los valores de la lista doble enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     */

    @Override
    public T get(int index) {
        if(index > size-1)
            return null;
        DoubleNode<T> current = head;
        for(int c = 0; c < index; c++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    /**
     * Metodo clear
     * Permite obtener el tamaño de la lista doble enlazada
     *
     * @author Melisa Oviedo
     * @version 1.0
     */
    @Override
    public void clear() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Metodo size
     * Permite poner la posición de la lista doble enlazada en cero
     *
     * @author Melisa Oviedo
     * @version 1.0
     */
    @Override
    public int size() {
        return size;
    }


    @Override
    public void swap(int index)
    {
        T d1 = this.get(index);
        T tmp;
        DoubleNode<T> current = head;
        for(int c = 0; c < size; c++) {
            if(this.get(c) == d1) {
                tmp = current.getValue();
                current.getNext().setValue(current.getValue());
                current.getNext().setValue(tmp);
            } else {
                current = current.getNext();
            }
        }
    }
}

