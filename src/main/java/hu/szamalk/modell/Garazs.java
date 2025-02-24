// VEGE
package hu.szamalk.modell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Garazs implements Iterable<Jarmu> {
    private int ferohely;
    private ArrayList<Jarmu> jarmuvek;
    private static final int MAX_FEROHELY = 5;

    public Garazs(ArrayList<Jarmu> jarmuvek) {
        setJarmuvek(jarmuvek);
        this.ferohely = 5 - jarmuvek.size();
    }

    public ArrayList<Jarmu> getJarmuvek() {
        return new ArrayList<>(this.jarmuvek);
    }

    public void setJarmuvek(ArrayList<Jarmu> jarmuvek) {
        if (jarmuvek.size() <= MAX_FEROHELY) {
            this.jarmuvek = jarmuvek;
        } else {
            throw new RuntimeException("Nincs elég hely a garázsban.");
        }
    }

    public int getFerohely() {
        return ferohely;
    }

    public void jarmuBeall(Jarmu jarmu) {
        if (this.jarmuvek.size() < MAX_FEROHELY) {
            this.jarmuvek.add(jarmu);
            this.ferohely--;
        } else {
            throw new RuntimeException("Nincs elég hely a garázsban.");
        }
    }

    public void jarmuKiall(Jarmu jarmu) {
        if (this.jarmuvek.contains(jarmu)) {
            this.jarmuvek.remove(jarmu);
            this.ferohely++;
        } else {
            throw new RuntimeException("Nincs ilyen jármű a garázsban.");
        }
    }

    @Override
    public String toString() {
        return "Garazs{" +
                "ferohely=" + ferohely +
                ", jarmuvek=" + jarmuvek +
                '}';
    }

    @Override
    public Iterator<Jarmu> iterator() {
        return null;
    }
}
