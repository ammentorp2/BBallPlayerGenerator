/**
 *  Service to create a random height
 *
 * Author : Andrew Ammentorp
 */
package service;

import model.Position;

import java.util.ArrayList;
import java.util.Random;

/**
 *  Service to create a random height
 */
public class HeightService {
    /**
     * height dist gotten from https://www.thehoopsgeek.com/average-nba-height/
     * using 21-22 as year as of 3/24/2022
     */

    private static ArrayList<Pair<Integer,Double>> pgHeightDist = new ArrayList<Pair<Integer, Double>>(){
        {
            add(new Pair(69,0.2));
            add(new Pair(70,1.5));
            add(new Pair(71,1.5));
            add(new Pair(72,9.8));
            add(new Pair(73,24.6));
            add(new Pair(74,15.9));
            add(new Pair(75,19.3));
            add(new Pair(76,8.3));
            add(new Pair(77,9.7));
            add(new Pair(78,5.5));
            add(new Pair(79,3.7));
        }
    };

    private static  ArrayList<Pair<Integer,Double>> sgHeightDist = new ArrayList<>(){
        {
            add(new Pair(70,0.1));
            add(new Pair(73,4.4));
            add(new Pair(74,5.6));
            add(new Pair(75,10.2));
            add(new Pair(76,29.1));
            add(new Pair(77,27.8));
            add(new Pair(78,13.2));
            add(new Pair(79,8.1));
            add(new Pair(80,1.6));
        }
    };


    private static  ArrayList<Pair<Integer,Double>> sfHeightDist = new ArrayList<>(){
        {
            add(new Pair(75,3.8));
            add(new Pair(76,6.7));
            add(new Pair(77,21.6));
            add(new Pair(78,20.4));
            add(new Pair(79,22.2));
            add(new Pair(80,16.1));
            add(new Pair(81,8.9));
            add(new Pair(82,0.4));
        }
    };

    private static  ArrayList<Pair<Integer,Double>> pfHeightDist = new ArrayList<>(){
        {
            add(new Pair(77,4.6));
            add(new Pair(78,14.1));
            add(new Pair(79,16.6));
            add(new Pair(80,24.7));
            add(new Pair(81,20.6));
            add(new Pair(82,6.8));
            add(new Pair(83,6.6));
            add(new Pair(84,4.6));
            add(new Pair(86,0.1));
            add(new Pair(87,1.5));
        }
    };

    private static  ArrayList<Pair<Integer,Double>> centerHeightDist = new ArrayList<>(){
        {
            add(new Pair(79,1.6));
            add(new Pair(80,11.0));
            add(new Pair(81,14.6));
            add(new Pair(82,23.8));
            add(new Pair(83,29.5));
            add(new Pair(84,15));
            add(new Pair(85,4));
            add(new Pair(86,0.3));
            add(new Pair(87,0.1));
            add(new Pair(90,0.1));
        }
    };

    final static double TOTAL_WEIGHT = 100.0;

    private static int getHeightBasedOnPosition(ArrayList<Pair<Integer,Double>> heightDist){
        int index = 0;
        Random rand = new Random(System.currentTimeMillis() % 37);
        for (double r = rand.nextDouble() * TOTAL_WEIGHT; index < heightDist.size() - 1; ++index) {
            r -= heightDist.get(index).getR();
            if (r <= 0.0) break;
        }
        return heightDist.get(index).getL();
    }

    /**
     * Generate a height (in inches) of player
     * @param primaryPosition player's primary position
     * @return height (in inches) of player
     */
    public static int generateHeight(Position primaryPosition) {
        if (primaryPosition == null)
            throw new RuntimeException("Primary position can't be null");


        if(primaryPosition == Position.PG){
            return getHeightBasedOnPosition(pgHeightDist);
        }
        else if(primaryPosition == Position.SG){
            return getHeightBasedOnPosition(sgHeightDist);
        }
        else if(primaryPosition == Position.SF){
            return getHeightBasedOnPosition(sfHeightDist);
        }
        else if(primaryPosition == Position.PF){
            return getHeightBasedOnPosition(pfHeightDist);
        }
        else if(primaryPosition == Position.C){
            return getHeightBasedOnPosition(centerHeightDist);
        }
        return 0;

    }
}
