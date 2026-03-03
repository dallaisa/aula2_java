package service;

import domain.Player;

public interface ScoreService {
    void addPoints(Player player, int points);
}