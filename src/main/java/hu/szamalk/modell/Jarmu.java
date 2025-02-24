package hu.szamalk.modell;

import java.util.UUID;

public abstract class Jarmu {
    private UUID id;
    private String szin;
    private Tulajdonos tulaj;

    public Jarmu(UUID id, String szin, Tulajdonos tulaj) {
        this.id = id;
        this.szin = szin;
        this.tulaj = tulaj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
