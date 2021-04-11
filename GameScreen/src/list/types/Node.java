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
}
