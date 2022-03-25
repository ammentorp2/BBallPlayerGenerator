package view;

import model.Player;
import model.Position;
import service.PlayerCreatorService;

public class LocalRunner {
    public static void main(String [] args){
        Player p = PlayerCreatorService.createPlayer();
        System.out.println(p);

    }
}
