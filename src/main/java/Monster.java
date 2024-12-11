public class Monster {

    //Instance variables
    private String name;
    private int healthPoints = 8; // default health point for monster
    private int damage = 1; // default damage
    private String monsterDescription;

    // Constructor
    public Monster(String name) {
        this.name = name;
    }
    // method for retrieving the monster's name
    public String getName() {
        return name;
    }
    // method for retrieving the monster's health points
    public int getHealthPoints() {
        return healthPoints;
    }

    // method for retrieving the monster's description
    public String getMonsterDescription() {
        return monsterDescription;
    }

    // Method to reduce the monster's health when it takes damage
    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }

    // Method to attack a player
    public int attack(Player player) {
        player.takeDamage(damage); // // Call the player's takeDamage method
        System.out.println(name + " attackerar " + player.getName() + " och gör " + damage + " skada!");
        return damage;
    }

}
