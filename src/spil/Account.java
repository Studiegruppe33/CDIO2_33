package spil;

public class Account {
    private int score = 1000;

    public Account() {

    }

//Your score for each turn is added to your account
    public void addToScore(int result) {
        if (this.score + result < 0) {
            this.score = 0;
        }
            else if (this.score+result>=3000){
                this.score=3000;

        } else {
            this.score += result;
        }

    }

    public int getScore() {
        return this.score;
    }
}