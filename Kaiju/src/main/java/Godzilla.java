public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "Roar!";
    }

    public String move() {
        return "Godzillas feet damages everything in the area";
    }
}
