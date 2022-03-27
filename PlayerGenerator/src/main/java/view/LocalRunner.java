package view;

import model.Player;
import model.Position;
import service.PlayerCreatorService;

public class LocalRunner {
    public static void main(String [] args){
        //Player p = PlayerCreatorService.createPlayer();
        //System.out.println(p);
        //System.out.println(PlayerCreatorService.createPlayerByName("John","Snow"));
        //System.out.println(PlayerCreatorService.createPlayerByPosition(Position.C));
        System.out.println(PlayerCreatorService.createPlayerByPosition(Position.C));
        //System.out.println(PlayerCreatorService.createPlayerByAge(35));
        //System.out.println(PlayerCreatorService.createPlayerByNameAge("John","Snow",34));
    }
}
