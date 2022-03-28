package view;

import model.Player;
import model.Position;
import service.Pair;
import service.PlayerCreatorService;

import java.util.*;

public class LocalRunner {
    public static void main(String [] args){
        List<Integer> heights = new ArrayList<>();
        for(int i = 0 ; i < 1000; i++){
            Player p = PlayerCreatorService.createPlayerByPosition(Position.C);
            heights.add(p.getHeightInches());
        }

        Set<Integer> distinct = new HashSet<>(heights);
        for (Integer i: distinct) {
            System.out.println(i + ": " + Collections.frequency(heights, i));
        }
    }
}
