package list.types;

import characters.Enemy;

public class LinkedList
{
    Node head;
    int size;

    public LinkedList()
    {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty(){return this.head == null;}

    public int getSize(){return this.size;}

    public void insertFirst(Enemy enemigo)
    {
        Node first = new Node(enemigo);
        first.next = this.head;
        this.head = first;
        this.size++;
    }

    public Node delete(Enemy enemigo)
    {
        Node current = this.head;
        Node previous = this.head;

        while (current != null)
        {
            if (current.getEnemigoActual().equals(enemigo)) {
                if (current == this.head)
                    this.head = this.head.getNext();
                else
                    previous.setNext(current.getNext());
                return current;
            }
            else{
                previous = current;
                current = current.getNext();
            }
        }
        return null;
    }
}
