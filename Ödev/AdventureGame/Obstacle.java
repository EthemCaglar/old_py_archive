package MaceraOyunu;

public class Obstacle {
    private int id;
    private int damage;
    private int health;
    private String name;
    private int fullHealth;

    public Obstacle(String name, int id, int damage, int health) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.fullHealth = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        if(health < 0){
            health = 0;
        }
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullHealth() {
        return fullHealth;
    }

    public void setFullHealth(int fullHealth) {
        this.fullHealth = fullHealth;
    }

}
