package MaceraOyunu;

public class Loot extends NormalLoc{

    public Loot(Player player, String name){
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        int bonusPercentage = 0;
        if(getName() == "Forest"){
            bonusPercentage= 2;
        }else if(getName() == "River"){
            bonusPercentage= 3;
        }else if(getName() == "Cave"){
            bonusPercentage= 4;
        }else if(getName() == "Mine"){
            bonusPercentage= 5;
        }

        if(11*bonusPercentage < randomNumb()){
            Weapon weaponObj;
            if(3*bonusPercentage < randomNumb()){ // silah
                if(this.getWeapon().getId() < 3){
                    if(4*bonusPercentage < randomNumb()){
                        weaponObj = this.getWeapon().getWeaponObj(3);
                        this.getPlayer().getInventory().setWeapon(weaponObj);
                        System.out.println("You got " + this.getWeapon().getName() + ".");
                    }
                }
                if(this.getWeapon().getId() < 2){
                    if(6*bonusPercentage < randomNumb()){
                        weaponObj = this.getWeapon().getWeaponObj(2);
                        this.getPlayer().getInventory().setWeapon(weaponObj);
                        System.out.println("You got " + this.getWeapon().getName() + ".");
                    }
                }
                if(this.getWeapon().getId() < 1){
                    if(10*bonusPercentage < randomNumb()){
                        weaponObj = this.getWeapon().getWeaponObj(1);
                        this.getPlayer().getInventory().setWeapon(weaponObj);
                        System.out.println("You got " + this.getWeapon().getName() + ".");
                    }
                }
            }
            Armor armorObj;
            if(3*bonusPercentage < randomNumb()){
                if(this.getWeapon().getId() < 3){
                    if(4*bonusPercentage < randomNumb()){
                        armorObj = this.getArmor().getArmorObj(3);
                        this.getPlayer().getInventory().setArmor(armorObj);
                        System.out.println("You got " + this.getArmor().getName() + ".");
                    }
                }
                if(this.getArmor().getId() < 2){
                    if(6*bonusPercentage < randomNumb()){
                        armorObj = this.getArmor().getArmorObj(2);
                        this.getPlayer().getInventory().setArmor(armorObj);
                        System.out.println("You got " + this.getArmor().getName() + ".");
                    }
                }
                if(this.getArmor().getId() < 1){
                    if(10*bonusPercentage < randomNumb()){
                        armorObj = this.getArmor().getArmorObj(1);
                        this.getPlayer().getInventory().setArmor(armorObj);
                        System.out.println("You got " + this.getArmor().getName() + ".");
                    }
                }
            }
            int currentMoney = 0;
            if(5*bonusPercentage < randomNumb()){
                if(4*bonusPercentage < randomNumb()){
                    currentMoney = this.getPlayer().getMoney();
                    this.getPlayer().setMoney(currentMoney + 4*bonusPercentage);
                    System.out.println("You got " + 4*bonusPercentage + " money.");
                }else if(6*bonusPercentage < randomNumb()){
                    currentMoney = this.getPlayer().getMoney();
                    this.getPlayer().setMoney(currentMoney + bonusPercentage);
                    System.out.println("You got " + bonusPercentage + " money.");
                }else if(10*bonusPercentage < randomNumb()){
                    currentMoney = this.getPlayer().getMoney();
                    this.getPlayer().setMoney(currentMoney + 1);
                    System.out.println("You got 1 money.");
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public int randomNumb(){
        int random = (int)(Math.random()*100);
        return random;
    }

    public Weapon getWeapon(){
        return this.getPlayer().getInventory().getWeapon();
    }

    public Armor getArmor(){
        return this.getPlayer().getInventory().getArmor();
    }
}