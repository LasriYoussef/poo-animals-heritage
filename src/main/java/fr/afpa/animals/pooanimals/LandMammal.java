package fr.afpa.animals.pooanimals;

public class LandMammal extends Animal {

    // Attributs
    protected String furColor;

    // Constructeur
    public LandMammal(String species, String ecosystem, String furColor) {
        super(species, ecosystem);
        this.furColor = furColor;
    }

    // Getters & Setters
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String displayLocomotionType() {
        return " Mode de déplacement le plus courant: Marche / course / saut ";
    }

    // Méthodes
    @Override
    public String toString() {
        return " Mamal [species = " + getSpecies()
                + ", furColor = " + getFurColor()
                + ", ecosystem = " + getEcosystem()
                + ", LocomotionType = " + displayLocomotionType() + "]";
    }

}
