package heroes;

import java.util.Random;

public class King extends Character {
    private Random random = new Random();

    public King() {
        power = 5 + random.nextInt(11);
        hp = 5 + random.nextInt(11);
    }

    public void kick(Character c) {
        int damage = random.nextInt(power + 1);
        c.setHp(c.hp - damage);
        System.out.println("King hits " + c.getClass().getSimpleName() + " for " + damage + " HP");
    }
}
