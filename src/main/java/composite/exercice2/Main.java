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


        /*Double prixTotal = 0d;
        List<Recette> recetteATraiter = new ArrayList<>();
        recetteATraiter.add(pizza);
        while (!recetteATraiter.isEmpty()) {
            recetteATraiter.remove(0);
            for (Recette recette : pizza.getSousRecettes().keySet()) {
                for (Ingredient ingredient : recette.getIngredients().keySet()) {
                    prixTotal += ingredient.getPrix() * i;
                    System.out.println(prixTotal);
                }
            }
            //recetteATraiter.addAll(dossier.getSousDossiers());
        }*/

        /*Double prixTotal = 0d;
        List<Recette> recetteATraiter = new ArrayList<>();
        recetteATraiter.add(pizza);
        //recetteATraiter.remove(0);
        for (Map.Entry<Recette, Double> entry : pizza.getSousRecettes().entrySet()) {
            Recette recette = entry.getKey();
            Double quantiteRecette = entry.getValue();
            for (Map.Entry<Ingredient, Double> ingredients : recette.getIngredients().entrySet()) {
                Recette ingredientDeRecette = entry.getKey();
                Double quantiteIngredient = entry.getValue();
                //prixTotal += ingredientDeRecette.getPrix() * quantiteIngredient;
//                System.out.println(ingredientDeRecette.getIngredients());
//                System.out.println(quantiteIngredient);
                for (Map.Entry<Ingredient, Double> ingredients2 : ingredientDeRecette.getIngredients().entrySet()) {
                    Recette ingredientDeRecette2 = entry.getKey();
                    Double quantiteIngredient2 = entry.getValue();
                    System.out.println(ingredientDeRecette.);
                    System.out.println(quantiteIngredient2);
                }
            }
        }*/

       /* for (Recette recette : pizza.getSousRecettes().keySet()) {
            for (Ingredient ingredient : recette.getIngredients().keySet()) {
                prixTotal += ingredient.getPrix() * i;
                System.out.println(prixTotal);
            }
        }*/




        Double prixTotal = 0d;
        List<Recette> recetteATraiter = new ArrayList<>();
        recetteATraiter.add(pizza);
        //recetteATraiter.remove(0);
        //on recupère les ingrédients de Pizza
        for (Map.Entry<Ingredient, Double> ingredientsRoot : pizza.getIngredients().entrySet()) {
            Ingredient ingredientDePizza = ingredientsRoot.getKey();
            Double quantiteIngredientPizza = ingredientsRoot.getValue();
            prixTotal +=  ingredientDePizza.getPrix() * quantiteIngredientPizza;
                /*System.out.println(ingredientDeRecette.getPrix());
                System.out.println(quantiteIngredient);*/
            //On recupère toutes les sous recettes de pizza
            for(Recette recette : pizza.getSousRecettes().keySet()){
                //On veut recup quantité et Ingredient (pour recup prix) pour faire quantite * prix
                for (Map.Entry<Ingredient, Double> ingredients : recette.getIngredients().entrySet()) {
                    Ingredient ingredientDeRecette = ingredients.getKey();
                    Double quantiteIngredient = ingredients.getValue();
                    prixTotal +=  ingredientDeRecette.getPrix() * quantiteIngredient;
                /*System.out.println(ingredientDeRecette.getPrix());
                System.out.println(quantiteIngredient);*/
                }
            }
        }

        //On veut recup que les recettes

        System.out.println(prixTotal);
        /*System.out.println(new DecimalFormat("#.##").format(prixTotal));

        DecimalFormat df = new DecimalFormat(String.valueOf(prixTotal));
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println(df.format(prixTotal));*/


        /*for (Map.Entry<Recette, Double> entry : pizza.getSousRecettes().entrySet()) {
            Recette recette = entry.getKey();
            Double quantiteRecette = entry.getValue();
            for (Map.Entry<Ingredient, Double> ingredients : recette.getIngredients().entrySet()) {
                Recette ingredientDeRecette = entry.getKey();
                Double quantiteIngredient = entry.getValue();
                //prixTotal += ingredientDeRecette.getPrix() * quantiteIngredient;
//                System.out.println(ingredientDeRecette.getIngredients());
//                System.out.println(quantiteIngredient);
                for (Map.Entry<Ingredient, Double> ingredients2 : ingredientDeRecette.getIngredients().entrySet()) {
                    Recette ingredientDeRecette2 = entry.getKey();
                    Double quantiteIngredient2 = entry.getValue();
                    System.out.println(ingredientDeRecette.);
                    System.out.println(quantiteIngredient2);
                }
            }
        }*/

        // 1. Calculer le prix d'une recette de manière naïve = sans le pattern Composite

        // 2. Calculer le prix d'une recette en utilisant le pattern

    }
}
