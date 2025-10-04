package heroes;

import org.junit.jupiter.api.Test;

public class GameManagerTest {
    @Test
    void testFight() {
        Character c1 = new Elf();
        Character c2 = new Hobbit();
        GameManager gm = new GameManager();
        gm.fight(c1, c2);
    }
}
