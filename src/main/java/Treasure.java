public class Treasure extends Item {
    private int goldValue;

    public Treasure(String name, String description) {
        super(name, description);
    }

    @Override
    public void use(Player player) {
        System.out.println("Du besegrar draken och samlar skatten.");
    }
}
