package visitor.exercice;

public class FichierWord implements Fichier {

    public FichierWord(String nom, String author, int nbPages) {
        this.nom = nom;
        this.author = author;
        this.nbPages = nbPages;
    }

    private String nom;
    private String author;
    private int nbPages;

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getType() {
        return "docx";
    }

    public String getAuthor() {
        return author;
    }

    public int getNbPages() {
        return nbPages;
    }
}
