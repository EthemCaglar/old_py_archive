package MaceraOyunu;

public class Somewhere extends NormalLoc{
    public Somewhere(Player player){
        super(player, "unnamed place in island");
    }
    @Override
    public boolean onLocation() {
        return true;
    }
}
