package domain;

public class Player {

    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }


    public void increaseScore(int points) {
        this.score += points;
        if (this.score < 0) this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}