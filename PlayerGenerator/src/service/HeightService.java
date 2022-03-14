/**
 *  Service to create a random height
 *
 * Author : Andrew Ammentorp
 */
package service;

import model.Position;

/**
 *  Service to create a random height
 */
public class HeightService {

    /**
     * Generate a height (in inches) of player
     * @param primaryPosition player's primary position
     * @param secondaryPosition player's secondary position
     * @return height (in inches) of player
     */
    public static int generateHeight(Position primaryPosition, Position secondaryPosition) {
        //TODO
        if (primaryPosition == null)
            throw new RuntimeException("Primary position can't be null");

        int height;

        return 0;
    }
}
