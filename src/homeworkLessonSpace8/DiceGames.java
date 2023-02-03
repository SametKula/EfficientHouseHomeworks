package homeworkLessonSpace8;


import java.util.Formatter;

import static homeworkLessonSpace8.PossibilitiesUtil.*;

public class DiceGames {
    public static void game() {
        java.util.Random rd = new java.util.Random();

        Player player = new Player("player  ");
        Player computer = new Player("computer");

        boolean gameBegginer = rd.nextBoolean();

        System.out.println("wecome to dice games");


        if (gameBegginer)
            gameStaff(player, computer, rd);
        else
            gameStaff(computer, player, rd);


    }

    public static void gameStaff(Player p1, Player p2, java.util.Random rd) {
        int count = 0 , totalRaunds =0;
        while (true) {
            p1.roll(rd);
            p2.roll(rd);

            Player maxp = maxPlayer(p1, p2);
            Player minp = minPlayer(p1, p2);

            displayScoreboard(p1,p2);

            if (maxp.getScore() >= 20){
                if (minp.getScore() < maxp.getScore() - 6){
                    maxp.winRound();
                    maxp.resScore();
                    minp.resScore();
                }else {
                    minp.roll(rd);
                    if (minp.getScore() > maxp.getScore()){
                        minp.winRound();
                    }else {
                        maxp.winRound();
                    }
                    maxp.resScore();
                    minp.resScore();

                }
            }




            if (p1.getWinScore() == 10 || p2.getWinScore() == 10)
                break;

        }
        displayScoreboard(p1,p2);

    }
    public static void displayScoreboard(Player p1, Player p2){


        System.out.format("|%3s|%7d|%7d|%7s|%7d|%7d|%n",p1.pName,p1.getScore(),p1.getWinScore(),p2.pName,p2.getScore(),p2.getWinScore());
        System.out.format("+--------+-------+-------+--------+-------+-------+%n");
    }
    public static Player maxPlayer(Player p1, Player p2) {
        return p1.getScore() > p2.getScore() ? p1 : p2;
    }

    public static Player minPlayer(Player p1, Player p2) {
        return p1.getScore() >= p2.getScore() ? p2 : p1;
    }


}

class Player {
    public String pName;
    private int winScore;
    private int score;

    public Player(String pName) {
        this.pName = pName;
    }

    public void roll(java.util.Random random) {
        int dice = throwDice(random);

        if (dice == 1)
            this.score = 0;
        else
            this.score += dice;
    }
    public void winRound(){
        this.winScore++;
        System.out.printf("%n %nThe %s won %n %n", this.pName);
    }
    public int getWinScore(){
        return this.winScore;
    }
    public int getScore(){
        return this.score;
    }
    public void resScore(){
        this.score = 0;
    }

}
