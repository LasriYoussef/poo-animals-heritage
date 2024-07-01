package fr.afpa.animals.pooanimals;
package fr.afpa.heritage;

public class Mamal extends Animal {

    // Attributs
    protected String furColor;

    // Constructeur
    public Mamal(String species, String ecosystem, String furColor) {
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

    // Méthodes
    @Override
    public String toString() {
        return "Mamal [species=" + species + ", furColor=" + furColor + ", ecosystem=" + ecosystem
                + ", LocomotionType=" + displayLocomotionType() + "]";
    }

    @Override
    public String displayLocomotionType() {
        return "Marche/course/saut";
    }
}
