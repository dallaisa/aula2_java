package application;

import domain.Mission;
import domain.Player;
import service.MissionValidatorService;
import service.ScoreService;

public class GameEngine {

    private final MissionValidatorService validator;
    private final ScoreService scoreService;

    public GameEngine(MissionValidatorService validator, ScoreService scoreService) {
        this.validator = validator;
        this.scoreService = scoreService;
    }

    public boolean executeMission(Player player, Mission mission) {
        boolean success = validator.validate(mission);

        if (success) {
            scoreService.addPoints(player, mission.getDifficulty() * 10);
        } else {
            scoreService.addPoints(player, -5);
        }

        return success;
    }
}