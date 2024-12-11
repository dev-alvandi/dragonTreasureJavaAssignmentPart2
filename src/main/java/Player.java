import java.util.ArrayList;
import java.util.List;

/**
 * * Class for constructing the player with player name.
 */

public class Player {

    // instance variable
    private String name;
    private int healthPoints = 10; // default healthPoint
    private int damage = 1; // default damage
    private List<Item> inventory = new ArrayList<>(); // player's inventory

    // constructor initializing the player with name
    public Player(String name) {
        this.name = name;
    }

    // method for retrieving the player's name
    public String getName() {
        return name;
    }

/**
* * Methods about healthPoints + healing
*/

    // method for retrieving the health points
    public int getHealthPoints() {
        return healthPoints;
    }

    // method for healing the player
    public void heal(int points) {
        this.healthPoints = Math.min(10, this.healthPoints + points); // Ensure health does not exceed 10
    }

    // Method to reduce the players health when it takes damage
    public void takeDamage(int damage) {
        this.healthPoints -= damage;
        System.out.println(name + " attackerar dig och gör " + damage + " skada och har nu " + healthPoints + " hälsopoäng kvar.");
    }

/**
 * * Methods about damage/attacks
 */

    // method for increasing players damage when using/picking up a weapon
    public void increaseDamage(int boost) {
        this.damage += boost; // add the damage to the players damage
        System.out.println("Din skada har ökad med " + boost + ". Ny skada: " + damage);
    }

    public int getDamage() {
        return damage;
    }

    // method for attacking a monster
    public void attack(Monster monster){
        if (monster != null){
            monster.takeDamage(damage);
            System.out.println("Du attackerar " + monster.getName() + " och gör " + damage + " skada.");
        }
    }

/**
* * Methods about items + inventory
 */

    // method for picking upp an item
    public void pickUpItem(Item item){
        inventory.add(item);
    }

    // method for retrieving the players inventory
    public List<Item> getInventory() {
        return inventory;
    }

    // Method for using an item by its name
    public void useItem(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.use(this); // Call the use method of the item
                inventory.remove(item); // Remove the item after use

                // System.out.println(name + " used " + item.getName() + ".");

                return; // Exit after using the item
            }
        }

        // Item not found
        System.out.println(itemName + " finns ej i inventariet.");
    }

}
