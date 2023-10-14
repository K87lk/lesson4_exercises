package hero;

public class Magician extends Hero implements PhysicalAttack, MagicalAttack{
    public Magician() {
        super(5, 20, 0, 8, 100);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - 5);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - 20);
    }

    public String toString() {
        if(getHealth() < 0)
            return "Magician is dead";
        return "Magician health: " + getHealth();
    }
}
