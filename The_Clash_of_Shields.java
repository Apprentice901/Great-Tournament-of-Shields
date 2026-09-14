// Phase 4 (The Clash of Shields)

public class The_Clash_of_Shields {
    private String name;
    private int defenseRating;

    // Constructor
    public The_Clash_of_Shields(String name, int defenseRating) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (defenseRating < 0) {
            throw new IllegalArgumentException("Defense rating cannot be negative.");
        }
        this.name = name;
        this.defenseRating = defenseRating;
    }

    // Getter
    public int getDefenseRating() {
        return defenseRating;
    }

    public String getName() {
        return name;
    }

     // Clash this Guardian with another Guardian.
     // @param opponent another Guardian object
    public void clash(The_Clash_of_Shields opponent) {
        if (opponent == null) {
            System.out.println("No opponent to clash with.");
            return;
        }

        System.out.println(this.name + " clashes with " + opponent.getName() + "!");

        if (this.defenseRating > opponent.getDefenseRating()) {
            System.out.println(this.name + " wins the clash!");
        } else if (this.defenseRating < opponent.getDefenseRating()) {
            System.out.println(opponent.getName() + " wins the clash!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        The_Clash_of_Shields g1 = new The_Clash_of_Shields("Aegis", 85);
        The_Clash_of_Shields g2 = new The_Clash_of_Shields("Titan", 90);
        The_Clash_of_Shields g3 = new The_Clash_of_Shields("Shieldbearer", 85);

        g1.clash(g2); // Titan wins
        g2.clash(g1); // Titan wins again
        g1.clash(g3); // Tie
    }
}
