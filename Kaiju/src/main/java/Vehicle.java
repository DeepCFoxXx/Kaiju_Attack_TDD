public class Vehicle implements IDamage{

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

    public void attackKaijuWithMachineGun(Kaiju kaiju) {
        kaiju.takeDamage(this.attackValue);
    }

    public void attackKaijuWithMainGun(Kaiju kaiju) {
        kaiju.takeDamage(this.attackValue * 5);
    }

    public void takeDamage(int attack){
        this.healthValue -= attack;
    }
}
