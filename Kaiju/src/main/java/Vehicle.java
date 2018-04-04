public class Vehicle {

    private String type;
    private int healthValue;
    private int attackValue;

    public Vehicle(String type, int healthValue, int attackValue){
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
