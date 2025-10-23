package generique;

import java.util.ArrayList;
import java.util.List;

public class Boite<T> {
    private List<T> contenu;

    public Boite() {
        this.contenu = new ArrayList<>();
    }

    public Boite(List<T> contenu) {
        this.contenu = contenu;
    }

    public List<T> getContenu() {
        return this.contenu;
    }

    public void setContenu(List<T> contenu) {
        if (contenu == null) return;
        this.contenu = contenu;
    }

    public void add(T element) {
        if (element == null) return;
        this.contenu.add(element);
    }

    public void remove(T element) {
        this.contenu.remove(element);
    }

    public boolean contains(T element) {
        return this.contenu.contains(element);
    }

    public void clear() {
        this.contenu.clear();
    }

    public int size() {
        return this.contenu.size();
    }
}
