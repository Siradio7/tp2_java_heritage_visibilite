package bibliotheque;

public class DVD extends Document {
    private String duree;

    public DVD(String titre, String auteur, String anneeDePublication, String duree) {
        super(titre, auteur, anneeDePublication);
        this.duree = duree;
    }

    @Override
    public void afficherInfos() {
        System.out.println("DVD { titre=" + this.titre + ", auteur=" + this.auteur + ", anneeDePublication=" + this.anneeDePublication + ", duree=" + this.duree + " }");
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }
}
