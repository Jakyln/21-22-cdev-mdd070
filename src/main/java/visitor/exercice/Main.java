package visitor.exercice;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Fichier> fichiers = new ArrayList<>();

        // Calculer les méta data pour chaque fichiers
        for (Fichier fichier : fichiers) {
            MetaDatas metaDatas = calculerMetaData(fichier);
        }
    }

    private static MetaDatas calculerMetaData(Fichier fichier) {
        MetaDatas metaDatas = new MetaDatas();
        metaDatas.add("nom", fichier.getNom());
        metaDatas.add("type", fichier.getType());
        if (fichier instanceof FichierWord) {
            metaDatas.add("author", ((FichierWord) fichier).getAuthor());
            metaDatas.add("nbPages", ((FichierWord) fichier).getNbPages());
        } else if (fichier instanceof FichierImage) {
            metaDatas.add("hauteur", ((FichierImage) fichier).getHauteur());
            metaDatas.add("largeur", ((FichierImage) fichier).getLargeur());
        }
        return metaDatas;
    }
}
