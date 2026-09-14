// Phase 1 (The Guardian's Identity)

// Create a Class (Guardian)
    // 2 Public fields: 
    // name ("String")
    // defense rating (Int)

// DO NOT FIX THE ERRORS. 
// Sort the Instructions (Don't read the instructions that out of order)
// Do Not Copy and Paste Code from another source.

// Create a class to represent a Guardian. 
class Guardian {// This class should have two public fields (2 Fields (String & Int) in 1 Class(Guardian)):
    public String name;
    public int defenseRating;
    // A public (Visible Anywhere) field name (String) &
    // public (Visible Anywhere) field defense rating (int).


    // Is this what im missing?
    public Guardian(String name, int defenseRating) { // Question... What is this?
        this.name = name; // Question... What is this?
        this.defenseRating = defenseRating; // Question... What is this?
    }
    // Is this what im missing?


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

        };
    };



