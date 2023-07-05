package units;

public abstract class Witch extends Person {
    int mana;
    public Witch(String name,float hp, int[] damage, int attack, int mana, int x, int y, int numberTeam) {
        super(name, hp, damage, attack, x, y, numberTeam);
        this.mana = mana;
    }
}
