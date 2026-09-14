// Phase 2 (The Gatekeeper (Encapsulation))


class Guardian {
    public String name;
    public int defenseRating;


    
    public Guardian(String name, int defenseRating) {
        this.name = name; 
        this.defenseRating = defenseRating; 
    }


    // In your main method 
    public static void main(String[] args) {
        // Instantiate multiple Guardian objects in main
        // (instantiating Guardian objects (More than 1 object))
        // and directly modify their fields to see how direct access works.
        // Declare public (String) with public (int) instance variables to store the state of your object.
        Guardian g1 = new Guardian("Jake", 120);
        Guardian g2 = new Guardian("Fin", 120);
        Guardian g3 = new Guardian("Xin", 135);
        
        // Make sure you also print (system.out.println()) out the values 
        // (variables & or objects (String & or Int)) to display them.
        System.out.println(g1.name + " " + g1.defenseRating);
        System.out.println(g2.name + " " + g2.defenseRating);
        System.out.println(g3.name + " " + g3.defenseRating);


        // Private fields to enforce encapsulation
    private String name;
    private int defenseRating;

    // Constructor
    public Guardian(String name, int defenseRating) {
        this.name = name;
        setDefenseRating(defenseRating); // Use setter to apply validation
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("⚠️ Invalid name. Name not updated.");
        }
    }

    // Getter for defenseRating
    public int getDefenseRating() {
        return defenseRating;
    }

    // Setter for defenseRating with validation
    public void setDefenseRating(int defenseRating) {
        if (defenseRating > 0) {
            this.defenseRating = defenseRating;
        } else {
            System.out.println("⚠️ Defense rating must be greater than 0. Value not updated.");
        }
    }

    // Computed property: dynamically checks if legendary
    public boolean isLegendary() {
        return defenseRating > 100;
    }

    // Display method for convenience
    public void displayInfo() {
        System.out.println("Guardian Name: " + name);
        System.out.println("Defense Rating: " + defenseRating);
        System.out.println("Legendary Status: " + (isLegendary() ? "Yes" : "No"));
        System.out.println("---------------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create Guardian objects
        Guardian g1 = new Guardian("Aegis", 120);
        Guardian g2 = new Guardian("Shieldbearer", 80);

        // Display initial info
        g1.displayInfo();
        g2.displayInfo();

        // Test defense rating validation
        System.out.println("Attempting to set negative defense rating for g2...");
        g2.setDefenseRating(-50); // Should print warning
        g2.displayInfo();

        // Test updating defense rating to a valid value
        System.out.println("Updating g2 defense rating to 150...");
        g2.setDefenseRating(150);
        g2.displayInfo();

        // Test name validation
        System.out.println("Attempting to set empty name for g1...");
        g1.setName(""); // Should print warning
        g1.displayInfo();

        // Test updating name
        System.out.println("Updating g1 name to 'Titan'...");
        g1.setName("Titan");
        g1.displayInfo();
        }

    };
};
