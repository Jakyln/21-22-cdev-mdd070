package composite.exercice2;

import composite.exercice.DossierComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recette implements CookingComponent{
    private Map<Ingredient, Double> ingredients = new HashMap<>();
    private Map<Recette, Double> sousRecettes = new HashMap<>();

    private List<CookingComponent> components = new ArrayList<>();


    public void add(double quantite, Ingredient ingredient) {
        ingredients.put(ingredient, quantite);
    }

    public void addSousRecette(double quantite, Recette recette) {
        sousRecettes.put(recette, quantite);
    }

    public Map<Ingredient, Double> getIngredients() {
        return ingredients;
    }

    public Map<Recette, Double> getSousRecettes() {
        return sousRecettes;
    }

    @Override
    public double getPrix() {
        double prixTotale = 0;
        for (CookingComponent component : components) {
            double prix = component.getPrix();
            prixTotale += prix;
        }
        return prixTotale;
    }
}
