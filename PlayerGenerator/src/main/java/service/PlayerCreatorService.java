/**
 *  Service to create a player
 *
 * Author : Andrew Ammentorp
 */
package service;

import com.github.javafaker.Faker;
import model.Player;
import model.Position;

/**
 * Service to create a player
 */
public class PlayerCreatorService {
    /**
     * Creates a purely random player
     * @return player
     */
    public static Player createPlayer(){
        //purely random
        Player thePlayer = new Player();

        // generate random name
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        // set name
        thePlayer.setFirstName(firstName);
        thePlayer.setLastName(lastName);

        //give player an age
        int age = AgeService.generateAge();
        thePlayer.setAge(age);

        //create a position (and potentially a second position)
        Position primaryPosition = PositionService.generatePosition();
        thePlayer.setPrimaryPosition(primaryPosition);

        Position secondaryPosition = PositionService.generateSecondPosition(primaryPosition);
        thePlayer.setSecondaryPosition(secondaryPosition);

        // generate height
        int playerHeightInInches = HeightService.generateHeight(primaryPosition);
        thePlayer.setHeightInches(playerHeightInInches);

        // generate weight
        int weight = WeightService.generateWeight(primaryPosition,secondaryPosition);
        thePlayer.setWeight(weight);

        // generate playstyle
        String playstyle = PlaystyleService.generatePlaystyle(primaryPosition);
        thePlayer.setPlaystyle(playstyle);

        return thePlayer;
    }

}
