package fr.afpa.animals.pooanimals;

public class Fish extends Animal {

    // Attributs
    protected int preferredWaterDepth;

    // Constructeur
    public Fish(String species, String ecosystem, int preferredWaterDepth) {
        super(species, ecosystem);
        this.preferredWaterDepth = preferredWaterDepth;
    }

    // Getters & Setters
    public int getPreferredWaterDepth() {
        return preferredWaterDepth;
    }

    public void setPreferredWaterDepth(int preferredWaterDepth) {
        this.preferredWaterDepth = preferredWaterDepth;
    }

    @Override
    public String displayLocomotionType() {
        return " Mode de déplacement le plus courant: Nage ";
    }

    // Méthodes
    @Override
    public String toString() {
        return " Fish [species = " + getSpecies()
                + ", preferredWaterDepth = " + getPreferredWaterDepth()
                + ", ecosystem = " + getEcosystem()
                + ", LocomotionType = " + displayLocomotionType() + "]";
    }

}
