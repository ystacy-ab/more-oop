package heroes;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println(c1.getClass().getSimpleName() + " vs " + c2.getClass().getSimpleName());
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (!c2.isAlive()) break;
            c2.kick(c1);
        }
        System.out.println("Winner: " + (c1.isAlive() ? c1.getClass().getSimpleName() : c2.getClass().getSimpleName()));
    }
}
