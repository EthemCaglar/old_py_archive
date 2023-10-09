package MaceraOyunu;

import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private int maxObstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation(){
        int obsNumber = this.randomObstacleNumber();
        System.out.println("You are at " + this.getName() + ".");

        if(1 < obsNumber){
            System.out.println("You faced with "+ obsNumber + " " + this.getObstacle().getName() + "s.");
        }else{
            System.out.println("You faced with a "+ this.getObstacle().getName() + ".");
        }

        System.out.println("<F>ight or <R>un away");
        String selectCase = input.nextLine().toUpperCase();
        
        if(selectCase.equals("F") && combat(obsNumber)){
            System.out.println("A victory !!!"); // LOOTS
            if(getName() == "Forest"){
                this.getPlayer().getInventory().setFirewood(true);
                
            }else if(getName() == "Cave"){
                this.getPlayer().getInventory().setFood(true);
            }else if(getName() == "River"){
                this.getPlayer().getInventory().setWater(true);
            }else if(getName() == "Mine"){
                this.getPlayer().getInventory().setOre(true);
            }
            return true;
        }

        if(this.getPlayer().getHealth() <= 0) {
            System.out.println("You are dead. There is no rest to any soul in this island.");
            return false;
        }
        return true;
    }

    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public boolean combat(int obstacleNumber){
        for (int i = 1; i <= obstacleNumber; i++){
            this.getObstacle().setHealth(this.getObstacle().getFullHealth());
            playerStats();
            obstacleStats(i,obstacleNumber);
            while(0 < this.getPlayer().getHealth() && 0 < this.getObstacle().getHealth()){
                System.out.println("<H>it or <F>lee");
                String selectCombat = input.nextLine().toUpperCase();
                if(selectCombat.equals("H")){
                    if(50 < (int)(Math.random()*100)){
                        System.out.println("You Hit first this turn with " + this.getPlayer().getTotalDamage() + " damage.");
                        this.getObstacle().setHealth(this.obstacle.getHealth()-this.getPlayer().getTotalDamage());
                        if(0 < this.getObstacle().getHealth()){
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getArmor().getDamageReduction();
                            if(obstacleDamage < 0){
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            System.out.println(this.getObstacle().getName() + " hits you.");
                        }
                    }else{
                        System.out.println(this.getObstacle().getName() + " hits you first.");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getArmor().getDamageReduction();
                        if(obstacleDamage < 0){
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        if(0 < this.getPlayer().getHealth()){
                            this.getObstacle().setHealth(this.obstacle.getHealth()-this.getPlayer().getTotalDamage());
                            System.out.println("You Hit " + this.getPlayer().getTotalDamage() + " damage.");
                        }else{
                            return false;
                        }
                    }
                    afterhit();
                }else{
                    return false;
                }
            }
        }
        if(this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                return true;
            }else{
                return false;
        }
    }

    public void afterhit(){
        System.out.println(this.getObstacle().getName() + "'s Health: " + this.getObstacle().getHealth() + "/" + this.getObstacle().getFullHealth());
        System.out.println("Your Current Health " + this.getPlayer().getHealth());
    }

    public void playerStats(){System.out.println("   -----------Player Stats-----------   ");
    System.out.println("Weapon= " + this.getPlayer().getWeapon().getName() + 
    "\tWeapon Damage= " + this.getPlayer().getWeapon().getDamage()+ 
    "\nArmor= " + this.getPlayer().getArmor().getName() + 
    "\tDmg Reduction= " + this.getPlayer().getArmor().getDamageReduction()+ 
    "\nTotal Damage= " + this.getPlayer().getTotalDamage() + 
    "\tHealth= " + this.getPlayer().getHealth() + 
    "\tMoney= " + this.getPlayer().getMoney());
    }

    public void obstacleStats(int turn, int obstNum){
        System.out.println(turn + "/" + obstNum + " obstacle remaining");
        System.out.println(getObstacle().getName() + " = " +
            getObstacle().getDamage() + " Damage / " +
            getObstacle().getHealth() + " Health");
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
