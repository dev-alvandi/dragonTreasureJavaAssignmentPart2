public class Item {

    //Instance variables
    private String name;
    private String itemDescription;

    //Constructors
    public Item(String name, String itemDescription) {
        this.name = name;
        this.itemDescription = itemDescription;

    }

    public String getName() {
        return name;
    }
    public String getItemDescription() {
        return itemDescription;
    }

    public void use(Player player) {
    }
}

