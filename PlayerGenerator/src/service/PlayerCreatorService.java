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
        //create a name

        //create a position (and potentially a second position)
        Position primaryPosition = PositionService.generatePosition();
        thePlayer.setPrimaryPosition(primaryPosition);

        Position secondaryPosition = PositionService.generateSecondPosition(primaryPosition);
        thePlayer.setSecondaryPosition(secondaryPosition);


        //for said position come up with a height and weight (influenced by POS and secondary POS)

        //generate a playstyle (based on position(s))

        return thePlayer;
    }
}
