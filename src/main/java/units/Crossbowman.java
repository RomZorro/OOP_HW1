package units;

public class Crossbowman extends Shooter{
    public Crossbowman(String name, int x, int y, int numberTeam) {
        super(name, 30, new int[]{-3,-5}, 12, 2, 12, x, y, numberTeam);
    }
}
