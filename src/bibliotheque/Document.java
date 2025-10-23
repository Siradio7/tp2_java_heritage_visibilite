package bibliotheque;

public abstract class Document {
    protected String titre;
    protected String auteur;
    protected String anneeDePublication;

    public Document(String titre, String auteur, String anneeDePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneeDePublication = anneeDePublication;
    }

    public abstract void afficherInfos();
}
