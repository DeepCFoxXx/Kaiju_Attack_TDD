public class Kaiju {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void takeDamage(int attack){
        this.healthValue -= attack;
    }

    public void attackVehicle(Vehicle vehicle) {
        vehicle.takeDamage(attackValue);
    }

    public void attackKaiju(Godzilla godzilla) {
        godzilla.takeDamage(attackValue);
    }
}
