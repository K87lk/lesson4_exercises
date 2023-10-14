package hero;

public class Warrior extends Hero implements PhysicalAttack{
    public Warrior() {
        super(30, 0, 8, 0, 100);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - 30);
    }



    public String toString() {
        if(getHealth() < 0)
            return "Warrior is dead";
        else return "Warrior health: " + getHealth();
    }
}
