public class Key extends Item {
    public Key(String name, String description) {
        super(name, description);
    }

    @Override
    public void use(Player player) {
        System.out.println("Bla bla nåt med öppna dörren.");
    }
}
