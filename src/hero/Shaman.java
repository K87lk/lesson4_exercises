package hero;

public class Shaman extends Hero implements Healer, PhysicalAttack, MagicalAttack{
    public Shaman() {
        super(10, 15, 2, 2, 100);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - 15);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - 10);
    }

    public String toString() {
        if(getHealth() < 0)
            return "Shaman is dead";
        return "Shaman health: " + getHealth();
    }
}
