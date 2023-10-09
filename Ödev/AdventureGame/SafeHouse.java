package MaceraOyunu;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player){
        super(player, "Oldmans Shack");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Its a safehouse !");
        System.out.println("Your health replenished.");
        this.getPlayer().setHealth(this.getPlayer().getFullHealth());
        return true;
    }
}
