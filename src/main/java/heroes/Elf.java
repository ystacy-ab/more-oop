package heroes;

public class Elf extends Character {
    public Elf() {
        power = 10;
        hp = 10;
    }

    public void kick(Character c) {
        if (c.power < this.power) {
            c.setHp(0);
            System.out.println("Elf kills " + c.getClass().getSimpleName());
        } else {
            c.power = Math.max(0, c.power - 1);
            System.out.println("Elf weakens " + c.getClass().getSimpleName() + " by 1 power");
        }
    }
}
