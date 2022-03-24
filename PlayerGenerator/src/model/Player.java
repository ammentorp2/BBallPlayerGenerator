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

    private int heightInches; /* height in inches */
    private int weight;

    private Position primaryPosition;
    private Position secondaryPosition;

    private String playstyle;

    private int age; /* age in years */

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
     * @param firstName player's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets playstyle.
     *
     * @return the playstyle of player
     */
    public String getPlaystyle() {
        return playstyle;
    }

    /**
     * Sets playstyle.
     *
     * @param playstyle the playstyle of the player
     */
    public void setPlaystyle(String playstyle) {
        this.playstyle = playstyle;
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
     * Gets formatted height.
     *
     * @return the formatted height
     */
    public String getFormattedHeight() {
        int feet = 0;
        int heightInchesCopy = heightInches;

        while(heightInchesCopy >= 12){
            feet++;
            heightInchesCopy -= 12;
        }

        return feet + "-" + heightInchesCopy;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * toString
     * @return formatted output of object
     */
    public String toString(){
        String res = firstName + " " + lastName + "\n" + this.getFormattedHeight() + ","
                    + weight + "lbs |" + primaryPosition;
        if(secondaryPosition != null)
            res += "/" + secondaryPosition;

        res += "\n" + age + " years old " + playstyle;
        return res;
    }


}
