// Phase 3 (The Tournament Roster)

public class Main {

    // Guardian class definition
    static class Guardian {
        private String name;
        private int rating; // 0–100 is valid

        // Setter for name
        public void setName(String name) {
            if (name != null && !name.trim().isEmpty()) {
                this.name = name.trim();
            } else {
                this.name = "Unknown Guardian";
            }
        }

        // Setter for rating with validation
        public void setRating(int rating) {
            if (rating < 0) {
                System.out.println("Warning: Negative rating for " + name + " — setting to 0.");
                this.rating = 0;
            } else if (rating > 100) {
                System.out.println("Warning: Rating over 100 for " + name + " — setting to 100.");
                this.rating = 100;
            } else {
                this.rating = rating;
            }
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Method to check if Guardian is legendary
        public boolean isLegendary() {
            return rating >= 90; // Legendary if rating is 90 or above
        }
    }

    public static void main(String[] args) {
        // Step 1: Create array of Guardians
        Guardian[] roster = new Guardian[4];

        // Step 2: Populate array with different Guardians
        roster[0] = new Guardian();
        roster[0].setName("Aegis");
        roster[0].setRating(95); // Legendary

        roster[1] = new Guardian();
        roster[1].setName("Sentinel");
        roster[1].setRating(-10); // Negative test

        roster[2] = new Guardian();
        roster[2].setName("Vanguard");
        roster[2].setRating(105); // Over 100 test

        roster[3] = new Guardian();
        roster[3].setName("Protector");
        roster[3].setRating(85); // Normal, not legendary

        // Step 3: Iterate with while loop and print legendary names
        int index = 0;
        System.out.println("\nLegendary Guardians:");
        while (index < roster.length) {
            if (roster[index].isLegendary()) {
                System.out.println(roster[index].getName());
            }
            index++;
        }
    }
}
