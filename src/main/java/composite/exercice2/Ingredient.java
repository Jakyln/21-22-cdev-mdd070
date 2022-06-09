package composite.exercice2;

public class Ingredient implements CookingComponent{
    private double prix;
    private String unite;

    public Ingredient(double prix, String unite) {
        this.prix = prix;
        this.unite = unite;
    }

    public double getPrix() {
        return prix;
    }
}
