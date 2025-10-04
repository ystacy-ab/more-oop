package heroes;

import java.util.List;
import java.util.Random;

public class CharacterFactory {
    private static final List<Class<? extends Character>> types = List.of(
        Hobbit.class, Elf.class, King.class, Knight.class
    );

    public Character createCharacter() {
        Random random = new Random();
        try {
            return types.get(random.nextInt(types.size())).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
