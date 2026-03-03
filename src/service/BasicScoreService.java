package service;

import domain.Player;

public class BasicScoreService implements ScoreService {

    @Override
    public void addPoints(Player player, int points) {
        player.increaseScore(points);
    }
}