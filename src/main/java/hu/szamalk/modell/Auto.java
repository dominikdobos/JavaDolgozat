package hu.szamalk.modell;

import java.util.UUID;

public class Auto extends Jarmu{
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
}
