package hu.szamalk.modell;

import java.text.Collator;
import java.util.Objects;
import java.util.UUID;

public class Auto extends Jarmu implements AutoInterface {
    private String rendszam;
    private int ferohely;
    private int ar;

    public Auto(UUID id, String szin, Tulajdonos tulaj, String rendszam, int ferohely, int ar) {
        super(id, szin, tulaj);
        setRendszam(rendszam);
        this.ferohely = ferohely;
        this.ar = ar;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        if (rendszam.length() >= 6) {
            this.rendszam = rendszam;
        } else {
            throw new NemLetezoAutoException("A rendszám nem megfelelő!");
        }
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return ferohely == auto.ferohely && Objects.equals(rendszam, auto.rendszam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rendszam, ferohely);
    }

    public FerohelyRendez ferohelyRendezes() {
        return new FerohelyRendez();
    }

    public ArRendez arRendezes() {
        return new ArRendez();
    }

    @Override
    public int compareTo(Auto o1, Auto o2) {
        Collator collator = Collator.getInstance();

        return collator.compare(o1.getRendszam(), o2.getRendszam());
    }

}
