package iterator.listechainee;

import java.util.List;

public class ListeChainee implements Iterable{
    Noeud debut;



    public void add(String valeur) {
        Noeud noeud = new Noeud(valeur);
        if(this.debut == null){
            this.debut = noeud;
        }
        else{
            Noeud noeudCourant = this.debut;
            while (noeudCourant.getSuivant() != null){
                noeudCourant = noeudCourant.getSuivant();
            }
            noeudCourant.setSuivant(noeud);
        }
    }

    public Noeud getDebut() {
        return debut;
    }

    public void setDebut(Noeud debut) {
        this.debut = debut;
    }

    public ListeChaineeIterator iterator() {
        return new ListeChaineeIterator(this);
    }


}
