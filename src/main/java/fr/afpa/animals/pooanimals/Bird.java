package fr.afpa.animals.pooanimals;

public class Bird extends Animal {

    // Attributs
    protected int wingSpan;

    // Constructeur
    public Bird(String species, String ecosystem, int wingSpan) {
        super(species, ecosystem);
        this.wingSpan = wingSpan;
    }

    // Getters & Setters
    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String displayLocomotionType() {
        return " Mode de déplacement le plus courant: Vol ";
    }

    // Méthodes
    @Override
    public String toString() {
        return " Bird [species = " + getSpecies()
                + ", wingSpan = " + getWingSpan()
                + ", ecosystem = " + getEcosystem()
                + ", LocomotionType = " + displayLocomotionType() + "]";
    }

}