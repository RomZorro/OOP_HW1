package units;
public abstract class Infantry extends Person {
    int armor; // броня
    public Infantry(String name,float hp, int[] damage, int attack, int armor, int x, int y, int numberTeam) {
        super(name, hp,  damage, attack, x, y, numberTeam);
        this.armor = armor;
    }
}