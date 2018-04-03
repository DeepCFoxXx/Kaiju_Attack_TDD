public class JetJaguar extends Kaiju {

    public JetJaguar(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String speak() {
        return "To the moon";
    }

    public String fly() {
        return "Jet Jaguar takes to the sky";
    }
}
