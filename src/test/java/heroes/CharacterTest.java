package heroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {
    @Test
    void testElfKillsWeaker() {
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        elf.kick(hobbit);
        assertFalse(hobbit.isAlive());
    }

    @Test
    void testKingDamage() {
        King king = new King();
        Hobbit hobbit = new Hobbit();
        king.kick(hobbit);
        assertTrue(hobbit.hp <= 3);
    }
}
