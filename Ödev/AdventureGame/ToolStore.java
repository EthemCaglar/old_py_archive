package MaceraOyunu;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player){
        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to my humble shop traveller.");
        System.out.println("Your can check my wares.");
        boolean showMenu = true;
        while(showMenu){
            System.out.println("1 - Weapons\t2 - Armors\t3 - Exit");
            int selectShop = Location.input.nextInt();

            while (selectShop < 1 || 3 < selectShop){
                System.out.println("Those are mine sorry, you can check others.");
                selectShop = Location.input.nextInt();
            }

            switch (selectShop){
                case 1 :
                    printWeapon();
                    buyWeapon();
                    break;
                case 2 :
                    printArmor();
                    buyArmor();
                    break;
                case 3 :
                    System.out.println("Good bye friendo, see you again.");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon(){
        System.out.println("Weapons");
        System.out.println("   Name\t\tDamage\tPrice");
        for(Weapon wpn : Weapon.Weapons()){
            System.out.println(wpn.getId() + "- " + wpn.getName() + "\t" + wpn.getDamage() + "\t" + wpn.getPrice());
        }
        System.out.println("\n0- Çıkış Yap");
    }

    public void buyWeapon(){
        System.out.println("Would you like to buy one?");
        int selectWeaponID = Location.input.nextInt();

        while (selectWeaponID < 0 || Weapon.Weapons().length < selectWeaponID){
            System.out.println("Those are mine sorry, you can check others.");
            selectWeaponID = Location.input.nextInt();
        }

        if(selectWeaponID != 0){
        Weapon selectedWeapon = Weapon.getWeaponObj(selectWeaponID);

            if (selectedWeapon != null){
                if (this.getPlayer().getMoney() < selectedWeapon.getPrice()){
                    System.out.println("Insufficient Money ");
                }else{
                    System.out.println("You bought " + selectedWeapon.getName() + ".");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your current money is " + this.getPlayer().getMoney());
                    System.out.println("Your previous weapon " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Your new weapon " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }
    }

    public void printArmor(){
        System.out.println("Armors");
        System.out.println("   Name\t\tDamage\tPrice");
        for(Armor wpn : Armor.Armors()){
            System.out.println(wpn.getId() + "- " + wpn.getName() + "\t" + wpn.getDamageReduction() + "\t" + wpn.getPrice());
        }
        System.out.println("\n0- Çıkış Yap");
    }

    public void buyArmor(){
        System.out.println("Would you like to buy one?");
        int selectArmorID = Location.input.nextInt();

        while (selectArmorID < 0 || Weapon.Weapons().length < selectArmorID){
            System.out.println("Those are mine sorry, you can check others.");
            selectArmorID = Location.input.nextInt();
        }

        if(selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorObj(selectArmorID);

            if (selectedArmor != null){
                if (this.getPlayer().getMoney() < selectedArmor.getPrice()){
                    System.out.println("Insufficient Money ");
                }else{
                    System.out.println("You bought " + selectedArmor.getName() + ".");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your current money is " + this.getPlayer().getMoney());
                    System.out.println("Your previous armor " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Your new armor " + this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }
    }
    
}
