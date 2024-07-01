package fr.afpa.animals.pooanimals;
package fr.afpa.heritage;

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

    // Méthodes
    @Override
    public String toString() {
        return "Fish [species=" + species + ", preferredWaterDepth=" + preferredWaterDepth + ", ecosystem=" + ecosystem
                + ", LocomotionType=" + displayLocomotionType() + "]";
    }

    @Override
    public String displayLocomotionType() {
        return "Nage";
    }
}
