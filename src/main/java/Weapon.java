public class Weapon extends Item {
    private int increaseDamage;

    public Weapon(String name, String description, int increaseDamage) {
        super(name, description);
        this.increaseDamage = increaseDamage;
    }

    @Override
    public void use(Player player) {
        System.out.println("Du tog upp " + getName());
        player.increaseDamage(increaseDamage);
    }
}
