package net.manishgiri.categories.ARRAYS.tournamentwinner.attempt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// https://www.algoexpert.io/questions/tournament-winner
class Program {

    String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
    ) {
        // Write your code here.
        String winner = "";
        int winnerMax = -1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < competitions.size(); i++) {
            ArrayList<String> teams = competitions.get(i);
            int result = results.get(i);
            if(result == 0) {
                // away team won
                map.put(teams.get(1), map.getOrDefault(teams.get(1), 0) + 1);
                map.put(teams.get(0), map.getOrDefault(teams.get(0), 0));
            }
            else if(result == 1) {
                // home team won
                map.put(teams.get(0), map.getOrDefault(teams.get(0), 0) + 1);
                map.put(teams.get(1), map.getOrDefault(teams.get(1), 0));
            }
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            if(entry.getValue() > winnerMax) {
                winnerMax = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
    }

}
