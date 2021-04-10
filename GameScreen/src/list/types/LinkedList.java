package list.types;

import characters.Enemy;

//La clase es llamada LinkedList, sin embargo, es una lista doblemente enlazada
public class LinkedList
{
    Node head;
    Node tail;
    int size;

    public LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){return this.head == null;}

    public int getSize(){return this.size;}

    public void insertFirst(Enemy enemigo)
    {
        if (isEmpty()) {
            this.head = this.tail = new Node(enemigo);
        }
        else {
            Node first = new Node(enemigo);
            first.next = this.head;
            this.head = first;
        }
        this.size++;
    }

    public void insertLast(Enemy enemigo)
    {
        if (isEmpty())
            this.head = this.tail = new Node(enemigo);
        else {
            Node last = new Node(enemigo);
            last.previous = this.tail;
            this.tail = last;
        }
    }

    public Node delete(Enemy enemigo)
    {
        Node current = this.head;
        Node previous = this.head;

        while (current != null)
        {
            if (current.getEnemigo().equals(enemigo)) {
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

class Node
{
    Enemy enemigo;
    Node next;
    Node previous;

    public Node(Enemy enemigo)
    {
        this.enemigo = enemigo;
    }

    public Enemy getEnemigo()
    {
        return this.enemigo;
    }

    public void setEnemigo(Enemy enemigo)
    {
        this.enemigo = enemigo;
    }

    public Node getNext()
    {
        return this.next;
    }

    public void setNext(Node node)
    {
        this.next = node;
    }
}
