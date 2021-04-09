package list.types;

import characters.Enemy;

public class Node
{
    Enemy enemigoActual;
    Node next;

    public Node(Enemy enemigoActual)
    {
        this.enemigoActual = enemigoActual;
    }

    public Enemy getEnemigoActual(){ return this.enemigoActual; }

    public void setEnemigoActual(Enemy enemigoActual){this.enemigoActual = enemigoActual;}

    public Node getNext(){return this.next;}

    public void setNext(Node node){this.next = node;}
}
