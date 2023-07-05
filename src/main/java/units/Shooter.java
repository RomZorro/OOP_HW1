package units;

public abstract class Shooter extends Person {
    int range; // дальность выстрела
    int capacity; // количество выстрелов до перезарядки
    public Shooter(String name,float hp, int[] damage, int attack, int range, int capacity, int x, int y, int numberTeam) {
        super( name, hp,  damage, attack, x, y, numberTeam);
        this.range = range;
        this.capacity = capacity;
    }
}