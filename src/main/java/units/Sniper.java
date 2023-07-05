package units;

public class Sniper extends Shooter{
    public Sniper(String name, int x, int y, int numberTeam){
        super(name, 10, new int[]{-3,-5}, 12, 10, 20, x, y, numberTeam);
    }
}