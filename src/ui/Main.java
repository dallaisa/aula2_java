package ui;

import application.GameEngine;
import domain.Mission;
import domain.Player;
import service.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Icers");
        Mission mission = new Mission("Deploy em produção", 6);

        MissionValidatorService validator = new AdvancedMissionValidatorService();
        ScoreService scoreService = new BasicScoreService();

        GameEngine engine = new GameEngine(validator, scoreService);

        boolean ok = engine.executeMission(player, mission);

        System.out.println("Missão: " + mission.getName());
        System.out.println("Sucesso? " + ok);
        System.out.println("Score atual: " + player.getScore());
    }
}