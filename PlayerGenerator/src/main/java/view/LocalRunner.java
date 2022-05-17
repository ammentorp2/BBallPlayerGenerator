package view;

import model.Player;
import model.Position;
import service.Pair;
import service.PlayerCreatorService;

import java.util.*;

/**
 * Local runner
 */
public class LocalRunner {
    public static void main(String [] args){
        //You can develop here!
        for(int i = 0; i < 5; i++){
            System.out.println(PlayerCreatorService.createPlayer());
        }

    }
}
