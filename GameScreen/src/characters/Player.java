package characters;

public class Player
{
    int vidasJugador;

    public Player(int vidasJugador)
    {
        if (vidasJugador > 3)
            throw new IllegalArgumentException("El jugador no puede tener mas de tres vidas");
        this.vidasJugador = vidasJugador;
    }

    public void movimientoDeLaNave()
    {
        //Aqui iria todo lo del movimiento del mouse
    }

    public Missile disparar()
    {
        return new Missile();
    }

    private static class Missile
    {
        int velocidadDisparo = 10;

        protected void movimientoDisparo()
        {
            //Aqui va el movimiento del disparo hacia arriba.
        }

    }
}

