/**
 * Pet.java
 * 
 * Represents a pet for the Pet BAG (Pet Boarding and Grooming) application.
 * This class stores basic pet information and boarding-related details.
 * 
 * NOTE: This project requires creating only the Pet class (no full program needed).
 */
public class Pet {

    // -------------------------
    // Fields (Attributes)
    // -------------------------
    private String petType;     // "Dog" or "Cat"
    private String petName;
    private int petAge;

    private int dogSpaces;      // Number of available dog spaces
    private int catSpaces;      // Number of available cat spaces

    private int daysStay;       // Number of days the pet will stay
    private double amountDue;   // Total amount due for boarding

    // -------------------------
    // Constructors
    // -------------------------

    /**
     * Default constructor.
     * Initializes attributes to reasonable default values as required by the rubric.
     */
    public Pet() {
        this.petType = "";
        this.petName = "";
        this.petAge = 0;

        this.dogSpaces = 0;
        this.catSpaces = 0;

        this.daysStay = 0;
        this.amountDue = 0.0;
    }

    /**
     * Parameterized constructor (optional but helpful).
     * Allows creating a Pet object with starting values.
     */
    public Pet(String petType, String petName, int petAge,
               int dogSpaces, int catSpaces, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    // -------------------------
    // Accessors and Mutators
    // -------------------------

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getDogSpaces() {
        return dogSpaces;
    }

    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    public int getCatSpaces() {
        return catSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}
