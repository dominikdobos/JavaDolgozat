// VEGE
package hu.szamalk.modell;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class GarazsTest {
    @Test
    void testFerohely() {
        ArrayList<Jarmu> lista = new ArrayList<Jarmu>();
        lista.add(new Auto(UUID.randomUUID(), "kék", new Tulajdonos("Sanyi"), "123456", 4, 1000000));
        lista.add(new Auto(UUID.randomUUID(), "piros", new Tulajdonos("Pisti"), "654321", 4, 1000000));
        Garazs g = new Garazs(lista);
        assertEquals(3, g.getFerohely());
    }

    @Test
    void testGetJarmuvek() {
        ArrayList<Jarmu> lista = new ArrayList<Jarmu>();
        lista.add(new Auto(UUID.randomUUID(), "kék", new Tulajdonos("Sanyi"), "123456", 4, 1000000));
        lista.add(new Auto(UUID.randomUUID(), "piros", new Tulajdonos("Pisti"), "654321", 6, 2000000));
        Garazs g = new Garazs(lista);

        ArrayList<Jarmu> ujLista = g.getJarmuvek();
        ujLista.add(new Auto(UUID.randomUUID(), "zöld", new Tulajdonos("Pali"), "111111", 2, 10000000));

        assertEquals(2, g.getJarmuvek().size());
    }

    @Test
    void testMaxOtAuto() {
        ArrayList<Jarmu> lista = new ArrayList<Jarmu>();
        Garazs g = new Garazs(lista);
        for (int i = 0; i < 6; i++) {
            g.jarmuBeall(new Auto(UUID.randomUUID(), "kék", new Tulajdonos("Sanyi"), "123456", 4, 1000000+i));
        }
//        assertThrows();
    }
}