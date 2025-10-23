package bibliotheque;

public class Livre extends Document {
    private int nombreDePages;

    public Livre(String titre, String auteur, String anneeDePublication, int nombreDePages) {
        super(titre, auteur, anneeDePublication);
        this.nombreDePages = nombreDePages;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Livre { titre=" + this.titre + ", auteur=" + this.auteur + ", anneeDePublication=" + this.anneeDePublication + ", nombreDePages=" + this.nombreDePages + " }");
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }
}
