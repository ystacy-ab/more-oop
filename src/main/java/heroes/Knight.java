package heroes;

import java.util.Random;

public class Knight extends King {
    public Knight() {
        Random random = new Random();
        power = 2 + random.nextInt(11);
        hp = 2 + random.nextInt(11);
    }
}
