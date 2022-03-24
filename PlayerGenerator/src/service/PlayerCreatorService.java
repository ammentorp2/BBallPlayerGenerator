/**
 *  Service to create a player
 *
 * Author : Andrew Ammentorp
 */
package service;

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
        //TODO create a name (maven/gradle dependencies)

        //give player an age
        int age = AgeService.generateAge();
        thePlayer.setAge(age);

        //create a position (and potentially a second position)
        Position primaryPosition = PositionService.generatePosition();
        thePlayer.setPrimaryPosition(primaryPosition);

        Position secondaryPosition = PositionService.generateSecondPosition(primaryPosition);
        thePlayer.setSecondaryPosition(secondaryPosition);

        int playerHeightInInches = HeightService.generateHeight(primaryPosition);
        thePlayer.setHeightInches(playerHeightInInches);

        //TODO give player a weight (influenced by positions)
        int weight = WeightService.generateWeight(primaryPosition,secondaryPosition);

        String playstyle = PlaystyleService.generatePlaystyle(primaryPosition);
        thePlayer.setPlaystyle(playstyle);

        return thePlayer;
    }

}
