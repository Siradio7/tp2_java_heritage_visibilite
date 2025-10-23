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

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getAnneeDePublication() {
        return anneeDePublication;
    }

    public void setAnneeDePublication(String anneeDePublication) {
        this.anneeDePublication = anneeDePublication;
    }
}
