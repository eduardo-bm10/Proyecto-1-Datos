package list.types;

import characters.Enemy;
import characters.Boss;

public class BasicRow
{
    Node posicion;

    public void crearLista(Enemy enemigo)
    {
        int contador = 6;

        while (contador > 0)
        {
            posicion = new Node(enemigo);
            posicion.next = posicion;
            contador --;
        }
    }

    Thread mover = new Thread();
    public void movimientoHilera()
    {

        mover.start();
    }
}

