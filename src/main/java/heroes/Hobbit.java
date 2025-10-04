package heroes;

public class Hobbit extends Character {
    public Hobbit() {
        power = 0;
        hp = 3;
    }

    public void kick(Character c) {
        System.out.println("Hobbit cries and does nothing!");
    }
}
