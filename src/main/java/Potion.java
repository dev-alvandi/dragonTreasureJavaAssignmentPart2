public class Potion extends Item {
    private int healing;

    public Potion(String name, String description, int healing) {
        super(name, description);
        this.healing = healing;
    }

    @Override
    public void use(Player player) {
        player.heal(healing); // Heal the player by the potion's healing value
        System.out.println("Du dricker hälsodrycken och återfår " + healing + " hälsopoäng.");
    }

}
