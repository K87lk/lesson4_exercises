package hero;

public class Palladin extends Hero implements Healer , PhysicalAttack{
    public Palladin() {
        super(15, 0, 5, 2, 100);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - 15);
    }

    public String toString() {
        if(getHealth() < 0)
            return "Palladin is dead";
        else return "Palladin health: " + getHealth();
    }
}
