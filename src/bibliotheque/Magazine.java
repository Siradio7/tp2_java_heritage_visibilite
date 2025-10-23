package bibliotheque;

public class Magazine extends Document {
    private int numeroMagazine;

    public Magazine(String titre, String auteur, String anneeDePublication, int numeroMagazine) {
        super(titre, auteur, anneeDePublication);
        this.numeroMagazine = numeroMagazine;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Magazine { titre=" + this.titre + ", auteur=" + this.auteur + ", anneeDePublication=" + this.anneeDePublication + ", numeroMagazine=" + this.numeroMagazine + " }");
    }

    public int getNumeroMagazine() {
        return numeroMagazine;
    }

    public void setNumeroMagazine(int numeroMagazine) {
        this.numeroMagazine = numeroMagazine;
    }
}
