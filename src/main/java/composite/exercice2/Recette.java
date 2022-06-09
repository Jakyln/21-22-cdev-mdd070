package composite.exercice2;

import java.util.HashMap;
import java.util.Map;

public class Recette {
    private Map<Ingredient, Double> ingredients = new HashMap<>();
    private Map<Recette, Double> sousRecettes = new HashMap<>();

    public void add(double quantite, Ingredient ingredient) {
        ingredients.put(ingredient, quantite);
    }

    public void addSousRecette(double quantite, Recette recette) {
        sousRecettes.put(recette, quantite);
    }

}
