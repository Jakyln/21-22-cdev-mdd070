package iterator.listechainee;

public class Noeud {
    private String valeur;
    private Noeud suivant;

    public Noeud(String valeur) {
        this.valeur = valeur;
    }

    public Noeud() {
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Noeud getSuivant() {
        return suivant;
    }

    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }
}
