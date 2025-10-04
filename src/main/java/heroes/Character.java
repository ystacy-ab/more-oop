package heroes;

public abstract class Character {
    protected int power;
    protected int hp;

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public int getHp() {
        return hp;
    }

    public abstract void kick(Character c);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
