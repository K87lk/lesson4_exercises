package hero;

public abstract class Hero {
    private int physicalAttack;
    private int magicalAttack;
    private int physicalDefence;
    private int magicalDefence;
    private int health;

    public Hero(int physicalAttack, int magicalAttack, int physicalDefence, int magicalDefence, int health) {
        this.physicalAttack = physicalAttack;
        this.magicalAttack = magicalAttack;
        this.physicalDefence = physicalDefence;
        this.magicalDefence = magicalDefence;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPhysicalAttack() {
        return physicalAttack;
    }

    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    public int getMagicalAttack() {
        return magicalAttack;
    }

    public void setMagicalAttack(int magicalAttack) {
        this.magicalAttack = magicalAttack;
    }

    public int getPhysicalDefence() {
        return physicalDefence;
    }

    public void setPhysicalDefence(int physicalDefence) {
        this.physicalDefence = physicalDefence;
    }

    public int getMagicalDefence() {
        return magicalDefence;
    }

    public void setMagicalDefence(int magicalDefence) {
        this.magicalDefence = magicalDefence;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hero{");
        sb.append("physicalAttack=").append(physicalAttack);
        sb.append(", magicalAttack=").append(magicalAttack);
        sb.append(", physicalDefence=").append(physicalDefence);
        sb.append(", magicalDefence=").append(magicalDefence);
        sb.append(", health=").append(health);
        sb.append('}');
        return sb.toString();
    }
}
