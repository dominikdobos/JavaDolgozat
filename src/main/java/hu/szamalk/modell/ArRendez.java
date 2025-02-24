// VEGE
package hu.szamalk.modell;

import java.util.Comparator;

public class ArRendez implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
        return o1.getAr()-o2.getAr();
    }
}
