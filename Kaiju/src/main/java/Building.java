public class Building implements IDamage {

    private int structuralIntegrity;

    public Building(int structuralIntegrity){
        this.structuralIntegrity = structuralIntegrity;
    }

    public void takeDamage(int attack){
        this.structuralIntegrity -= attack;
    }

    public int getIntegrity() {
        return structuralIntegrity;
    }

    public int getStructuralIntegrity() {
        return structuralIntegrity;
    }

    public void setStructuralIntegrity(int structuralIntegrity) {
        this.structuralIntegrity = structuralIntegrity;
    }

}
