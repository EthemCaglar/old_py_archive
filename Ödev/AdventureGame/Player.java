package MaceraOyunu;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int fullHealth;
    private int money;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;
    
    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();

    }

    public void selectChar(){
        GameChar[] charlist = {new Samurai(), new Archer(), new Knight()};

        System.out.println("----------------------------------------------------------------------");
        for(GameChar gc : charlist){
            System.out.println("Character's Name: "+gc.getName()+
            "\tID: "+gc.getId()+
            "\tDamage: "+gc.getDamage()+
            "\tHealth: "+gc.getHealth()+
            "\tMoney: "+gc.getMoney());
        }

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Which character did you choose (insert ID of it)");
        int selectChar = input.nextInt();

        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
    }

    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
        this.setFullHealth(gameChar.getHealth());
    }

    public void printInfo(){System.out.println(
    "Weapon= " + this.getInventory().getWeapon().getName() + 
    "\tWeapon Damage= " + this.getInventory().getWeapon().getDamage()+ 
    "\nArmor= " + this.getInventory().getArmor().getName() + 
    "\tDmg Reduction= " + this.getInventory().getArmor().getDamageReduction()+ 
    "\nDamage= " + this.getTotalDamage() + 
    "\tHealth= " + this.getHealth() + 
    "\tMoney= " + this.getMoney());
    }

    public int getFullHealth() {
        return fullHealth;
    }

    public void setFullHealth(int fullHealth) {
        this.fullHealth = fullHealth;
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Weapon getWeapon(){
        return this.getInventory().getWeapon();
    }

    public Armor getArmor(){
        return this.getInventory().getArmor();
    }
    
    public boolean isWater(){
        return this.getInventory().isWater();
    }

    public boolean isFirewood(){
        return this.getInventory().isFirewood();
    }

    public boolean isFood(){
        return this.getInventory().isFood();
    }

    public boolean isOre(){
        return this.getInventory().isOre();
    }
}
