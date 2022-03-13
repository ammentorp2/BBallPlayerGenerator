/**
 * Represents a Player object - generated with all appropriate attributes
 * Author : Andrew Ammentorp
 */
package model;

/**
 * Class representing a basketball player, with all appropriate attributes
 */
public class Player {

    private String firstName;
    private String lastName;

    private int heightFeet;
    private int heightInches;
    private int weight;

    private Position primaryPosition;
    private Position secondaryPosition;

    //TODO create enum for position archetypes for playstyle

    private int age;

    /**
     * Initilizes player object
     */
    public Player() {
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets secondary position.
     *
     * @return the secondary position
     */
    public Position getSecondaryPosition() {
        return secondaryPosition;
    }

    /**
     * Sets secondary position.
     *
     * @param secondaryPosition the secondary position
     */
    public void setSecondaryPosition(Position secondaryPosition) {
        this.secondaryPosition = secondaryPosition;
    }

    /**
     * Gets primary position.
     *
     * @return the primary position
     */
    public Position getPrimaryPosition() {
        return primaryPosition;
    }

    /**
     * Sets primary position.
     *
     * @param primaryPosition the primary position
     */
    public void setPrimaryPosition(Position primaryPosition) {
        this.primaryPosition = primaryPosition;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Gets height inches.
     *
     * @return the height inches
     */
    public int getHeightInches() {
        return heightInches;
    }

    /**
     * Sets height (inches).
     *
     * @param heightInches the height (inches)
     */
    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    /**
     * Gets height im feet.
     *
     * @return the height in feet
     */
    public int getHeightFeet() {
        return heightFeet;
    }

    /**
     * Sets height in feet.
     *
     * @param heightFeet the height im feet
     */
    public void setHeightFeet(int heightFeet) {
        this.heightFeet = heightFeet;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        return "";
    }
}
