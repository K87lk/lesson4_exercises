package hero;

public class WarriorTest {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Palladin palladin = new Palladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(palladin);
        palladin.physicalAttack(magician);
        shaman.healTeammate(magician);
        magician.magicalAttack(palladin);
        shaman.physicalAttack(warrior);
        palladin.healHimself();

        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
        }
        System.out.println(warrior + "\n" + palladin + "\n" + magician + "\n" + shaman);

    }
}
