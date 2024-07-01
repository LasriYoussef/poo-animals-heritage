package fr.afpa.animals.pooanimals;

public abstract class Animal {
    // Attributs
    protected String species;
    protected String ecosystem;

    // Constructeur
    public Animal(String species, String ecosystem) {
        this.species = species;
        this.ecosystem = ecosystem;
    }

    // Getters & Setters
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

    public abstract String displayLocomotionType();

    // Méthodes
    @Override
    public String toString() {
        return " Animal [ \n species = " + getSpecies()
                + ",\n ecosystem = " + getEcosystem()
                + ",\n displayLocomotionType() = " + displayLocomotionType() + "]";
    }

}
