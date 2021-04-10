package list.types;

import characters.Enemy;

public class CircularLinkedList
{
    CircularNode last;

    public CircularLinkedList()
    {
        this.last = null;
    }

    public boolean isEmpty()
    {
        return this.last == null;
    }

    public CircularLinkedList insert(Enemy enemigo)
    {
        CircularNode added = new CircularNode(enemigo);

        if (!isEmpty())
        {
            added.next = last.next;
            last.next = added;
        }
        last = added;
        return this;
    }
}

class CircularNode
{
    Enemy enemigo;
    CircularNode next;

    public CircularNode(Enemy enemigo)
    {
        this.enemigo = enemigo;
        this.next = this;
    }
}
