public class Boss extends Enemy
{
    public Boss(int vidasJefe, int tamañoJefe)
    {
        super(vidasJefe, tamañoJefe);
    }

    public void muerteJefeHileraA(){
        super.muerteEnemigo();
        //Destruye al resto de enemigos comunes
    }

    public void muerteJefeHileraC()
    {
        super.muerteEnemigo();
        //Otro enemigo comun se convierte en el jefe
    }
}
