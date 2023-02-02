package homeworkLessonSpace8;


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

            if (maxp.score >= 20)
                if (minp.score > maxp.score - 7) {
                    minp.roll(rd);
                    if (minp.score > maxp.score)
                        minp.win = true;
                    else if (minp.score == maxp.score) {
                        minp.win = true;
                        maxp.win = true;
                    } else
                        maxp.win = true;
                }else
                    maxp.win = true;



            displayScoreboard(p1,p2);

            if (p1.win || p2.win){
                if (p1.win)
                    p1.winScore++;
                else
                    p2.winScore++;

                p1.playerReset();
                p2.playerReset();

                if (++totalRaunds == 1000)
                    break;
            }






        }
        System.out.println(p2.winScore + "  " + totalRaunds);

    }
    public static void displayScoreboard(Player p1, Player p2){
        System.out.format("|%s  |%d     |%b  |%s  |%d     |%b  |%n",p1.pName,p1.score,p1.win,p2.pName,p2.score,p2.win);
        System.out.format("+----------+-------+------+----------+-------+--------+%n");
    }
    public static Player maxPlayer(Player p1, Player p2) {
        return p1.score > p2.score ? p1 : p2;
    }

    public static Player minPlayer(Player p1, Player p2) {
        return p1.score > p2.score ? p2 : p1;
    }


}

class Player {
    public int winScore;
    public int score;
    public boolean win;

    public String pName;

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
    public void playerReset(){
        this.win = false;
        this.score = 0;
    }


}
