// VEGE
package hu.szamalk.modell;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    @Test
    void testRendszamException() {
        new Auto(UUID.randomUUID(), "kék", new Tulajdonos("Sanyi"), "12345", 4, 1000000);
//        assertThrows();
    }
}