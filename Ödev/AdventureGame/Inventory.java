package MaceraOyunu;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private boolean water;
    private boolean firewood;
    private boolean food;
    private boolean ore;

    public Inventory() {
        this.weapon = new Weapon("Fist", 0, 0, 0);
        this.armor = new Armor("Clothes", 0, 0, 0);
        this.firewood = false;
        this.food = false;
        this.water = false;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isOre() {
        return ore;
    }

    public void setOre(boolean ore) {
        this.ore = ore;
    }

}
