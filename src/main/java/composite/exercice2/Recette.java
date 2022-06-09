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

    public Map<Ingredient, Double> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<Ingredient, Double> ingredients) {
        this.ingredients = ingredients;
    }

    public Map<Recette, Double> getSousRecettes() {
        return sousRecettes;
    }

    public void setSousRecettes(Map<Recette, Double> sousRecettes) {
        this.sousRecettes = sousRecettes;
    }
}
