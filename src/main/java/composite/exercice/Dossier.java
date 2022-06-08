package composite.exercice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Dossier {

    private List<Dossier> dossiers = new ArrayList<>();
    private List<Fichier> fichiers = new ArrayList<>();
    private String titre;

    public Dossier(String titre) {
        this.titre = titre;
    }


    public void addSousDosser(Dossier dossier2) {
        dossiers.add(dossier2);
    }

    public void addFichier(Fichier fichier1) {
        fichiers.add(fichier1);
    }

    public List<Fichier> getFichiers() {
        return fichiers;
    }

    public List<Dossier> getSousDossiers() {
        return dossiers;
    }
}
