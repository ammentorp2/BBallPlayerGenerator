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
        // generate random name
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();


        //give player an age
        int age = AgeService.generateAge();


        //create a position (and potentially a second position)
        Position primaryPosition = PositionService.generatePosition();

        Position secondaryPosition = PositionService.generateSecondPosition(primaryPosition);

        return createPlayer(new Player.PlayerBuilder().appendFirstName(firstName)
                    .appendLastName(lastName).appendAge(age)
                    .appendPrimaryPosition(primaryPosition)
                    .appendSecondaryPosition(secondaryPosition));
    }

    /**
     * Create a player by name
     * @param firstName player's first name
     * @param lastName player's last name
     * @return the created player
     */
    public static Player createPlayerByName(String firstName,String lastName){
        //give player an age
        int age = AgeService.generateAge();

        //create a position (and potentially a second position)
        Position primaryPosition = PositionService.generatePosition();

        Position secondaryPosition = PositionService.generateSecondPosition(primaryPosition);

        return createPlayer(new Player.PlayerBuilder().appendFirstName(firstName)
                .appendLastName(lastName).appendAge(age)
                .appendPrimaryPosition(primaryPosition)
                .appendSecondaryPosition(secondaryPosition));
    }

    /**
     * Create a player by position
     * @param primaryPosition player's primary position
     * @return created player
     */
    public static Player createPlayerByPosition(Position primaryPosition){
        // generate random name
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();


        //give player an age
        int age = AgeService.generateAge();

        return createPlayer(new Player.PlayerBuilder().appendFirstName(firstName)
                .appendLastName(lastName).appendAge(age)
                .appendPrimaryPosition(primaryPosition));
    }

    public static Player createPlayerByPosition(Position primaryPosition,Position secondaryPosition){

        if(primaryPosition.compareTo(secondaryPosition) == 0
                || Math.abs(primaryPosition.compareTo(secondaryPosition)) > 1){
            throw new RuntimeException("Invalid second position");
        }

        // generate random name
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();


        //give player an age
        int age = AgeService.generateAge();

        return createPlayer(new Player.PlayerBuilder().appendFirstName(firstName)
                .appendLastName(lastName).appendAge(age)
                .appendPrimaryPosition(primaryPosition)
                .appendSecondaryPosition(secondaryPosition));

    }

    /**
     * Create player by age
     * @param age age of player
     * @return created player
     */
    public static Player createPlayerByAge(int age){
        // generate random name
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        //create a position (and potentially a second position)
        Position primaryPosition = PositionService.generatePosition();

        Position secondaryPosition = PositionService.generateSecondPosition(primaryPosition);

        return createPlayer(new Player.PlayerBuilder().appendFirstName(firstName)
                .appendLastName(lastName).appendAge(age)
                .appendPrimaryPosition(primaryPosition)
                .appendSecondaryPosition(secondaryPosition));
    }

    //player by name and position(s)

    //player by name and age

    //player by positions(s) and age

    //player by name, positions(s) and age

    private static Player createPlayer(Player.PlayerBuilder builder) {
        // generate height
        // TODO sg/pg is always 6'5 (???)
        int playerHeightInInches = HeightService.generateHeight(builder.getPrimaryPosition());
        builder.appendHeight(playerHeightInInches);

        // generate weight
        int weight = WeightService.generateWeight(builder.getPrimaryPosition(),builder.getSecondaryPosition());
        builder.appendWeight(weight);

        // generate playstyle
        String playstyle = PlaystyleService.generatePlaystyle(builder.getPrimaryPosition());
        builder.appendPlaystyle(playstyle);

        return builder.build();

    }

}
