package composite.exercice2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Ingredient tomate = new Ingredient(0.3, "piece");
        Ingredient oignon = new Ingredient(0.1, "piece");
        Ingredient huile = new Ingredient(10, "litre");
        Ingredient farine = new Ingredient(2, "kg");
        Ingredient sel = new Ingredient(0.5, "kg");
        Ingredient eau = new Ingredient(0.1, "litre");
        Ingredient mozzarella = new Ingredient(3, "piece");

        Recette sauceTomate = new Recette();
        sauceTomate.add(3, tomate);
        sauceTomate.add(1, oignon);
        sauceTomate.add(0.1, huile);

        Recette pate = new Recette();
        pate.add(0.250, farine);
        pate.add(0.001, sel);
        pate.add(0.250, eau);
        pate.add(0.010, huile);

        Recette pizza = new Recette();
        pizza.addSousRecette(1, sauceTomate);
        pizza.addSousRecette(1, pate);
        pizza.add(2, mozzarella);

        Double prixTotal = 0d;
        //on recupère les ingrédients de Pizza
        for (Map.Entry<Ingredient, Double> mapIngredientsPizza : pizza.getIngredients().entrySet()) {
            Ingredient ingredientDePizza = mapIngredientsPizza.getKey();
            Double quantiteIngredientPizza = mapIngredientsPizza.getValue();
            prixTotal +=  ingredientDePizza.getPrix() * quantiteIngredientPizza;

            //On recupère toutes les sous recettes de pizza
            for(Recette sousRecette : pizza.getSousRecettes().keySet()){

                //On veut recup quantité et Ingredient (pour recup prix) pour faire quantite * prix
                for (Map.Entry<Ingredient, Double> mapIngredientsDeSousRecette : sousRecette.getIngredients().entrySet()) {
                    Ingredient ingredientDeSousRecette = mapIngredientsDeSousRecette.getKey();
                    Double quantiteIngredient = mapIngredientsDeSousRecette.getValue();
                    prixTotal +=  ingredientDeSousRecette.getPrix() * quantiteIngredient;
                }
            }
        }
        //Pour rendre le resultat plus lisible avec 3 décimal
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.FLOOR);
        String result =  df.format(prixTotal);
        System.out.println(result);

        // 1. Calculer le prix d'une recette de manière naïve = sans le pattern Composite

        // 2. Calculer le prix d'une recette en utilisant le pattern

    }
}
