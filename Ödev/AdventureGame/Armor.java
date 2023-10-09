package MaceraOyunu;

public class Armor {
    private String name;
    private int id;
    private int damageReduction;
    private int price;
    
    public Armor(String name, int id, int damageReduction, int price) {
        this.name = name;
        this.id = id;
        this.damageReduction = damageReduction;
        this.price = price;
    }

    public static Armor[] Armors(){
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor("Light", 1, 1, 15);
        armorList[1] = new Armor("Medium", 2, 3, 25);
        armorList[2] = new Armor("Heavy", 3, 5, 40);
        return armorList;
    }

    public static Armor getArmorObj(int id){
        Armor armor = null;
        for (Armor b : Armor.Armors()){
            if(b.getId() == id){
                return b;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
