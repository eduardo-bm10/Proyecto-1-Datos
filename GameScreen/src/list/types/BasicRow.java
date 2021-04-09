package list.types;

import characters.Enemy;

public class BasicRow
{
    LinkedList lista = new LinkedList();

    Enemy[] enem = new Enemy[6];

    public void crearLista()
    {
        for (int i = 0; i < 6; i++ )
        {
            lista.insertFirst(enem[i]);
        }
    }
}

