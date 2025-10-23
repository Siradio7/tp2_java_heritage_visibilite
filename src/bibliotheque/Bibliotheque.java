package bibliotheque;

import generique.Boite;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Boite<Document>> armoires;

    public Bibliotheque() {
        this.armoires = new ArrayList<>();
    }

    public Bibliotheque(List<Boite<Document>> armoires) {
        this.armoires = armoires;
    }

    public void afficherTousLesDocuments() {
        for (Boite<Document> boite : armoires) {
            for(Document document : boite.getContenu()) {
                document.afficherInfos();
            }
        }
    }
}
