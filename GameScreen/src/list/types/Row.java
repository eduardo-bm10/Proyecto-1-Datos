package list.types;

import characters.Enemy;
import characters.Boss;

public class Row
{
    public static class BasicRow
    {
        Enemy enemigo1 = new Enemy(1,1);
        Enemy enemigo2 = new Enemy(1,1);
        Enemy enemigo3 = new Enemy(1,1);
        Enemy enemigo4 = new Enemy(1,1);
        Enemy enemigo5 = new Enemy(1,1);
        Enemy enemigo6 = new Enemy(1,1);
        Enemy enemigo7 = new Enemy(1,1);

        public void addToList(Enemy addedEnemy){}
    }
    public static class ClassARow extends BasicRow
    {
        Enemy jefe1 = new Boss(5,2);

        public void addBossToList()
        {
            super.addToList(jefe1);
        }
    }
    public static class ClassBRow extends ClassARow
    {

    }
    public static class ClassCRow extends ClassARow
    {

    }
    public static class ClassDRow extends ClassCRow
    {

    }
    public static class ClassERow extends ClassCRow
    {

    }
}
