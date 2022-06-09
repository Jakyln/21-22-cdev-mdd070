package composite.exercice;

import java.util.ArrayList;
import java.util.List;

public class Dossier implements DossierComponent{

    private List<DossierComponent> components = new ArrayList<>();
    String titre;

    public Dossier(String titre) {
        this.titre = titre;
    }


    public void addSousDosser(Dossier dossier2) {
        components.add(dossier2);
    }

    public void addFichier(Fichier fichier1) {
        components.add(fichier1);
    }

    public int getTaille(){
        int taille = 0;
        for(DossierComponent dossierComponent : components){
            taille += dossierComponent.getTaille();
        }
        return taille;
    };

//    public List<Fichier> getFichiers() {
//        return components;
//    }

//    public List<Dossier> getSousDossiers() {
//        return components;
//    }

    //fonction getTaille

}