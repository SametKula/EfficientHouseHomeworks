package homeworkLessonSpace8;


import static homeworkLessonSpace8.PossibilitiesUtil.*;

public class DiceGames {
    public static void game() {
        java.util.Random rd = new java.util.Random();

        Player player = new Player("player");
        Player computer = new Player("computer");

        boolean gameBegginer = rd.nextBoolean();

        System.out.println("wecome to dice games");


        if (gameBegginer)
            gameStaff(player, computer, rd);
        else
            gameStaff(computer, player, rd);


    }

    public static void gameStaff(Player p1, Player p2, java.util.Random rd) {

        while (true) {
            p1.roll(rd);
            p2.roll(rd);

            Player maxp = maxPlayer(p1, p2);
            Player minp = minPlayer(p1, p2);

            if (maxp.score >= 20)
                if (minp.score > maxp.score - 7) {
                    minp.roll(rd);
                    if (minp.score > maxp.score) {
                        minp.win = true;
                        System.out.printf("win condition fields player's score ==== %d ==== and computer's score ==== %d ====%n", p1.score, p2.score);
                    }
                    else if (minp.score == maxp.score) {
                        minp.win = true;
                        maxp.win = true;
                        System.out.printf("win condition fields player's score ==== %d ==== and computer's score ==== %d ====%n", p1.score, p2.score);

                    } else if (maxp.score > minp.score && maxp.score > 20){
                        maxp.win = true;
                        System.out.printf("win condition fields player's score ==== %d ==== and computer's score ==== %d ====%n", p1.score, p2.score);
                    }
                }else{
                    maxp.win = true;
                    System.out.printf("win condition fields player's score ==== %d ==== and computer's score ==== %d ====%n", p1.score, p2.score);

                }

            System.out.printf("player's score ==== %d ==== and computer's score ==== %d ====%n", p1.score, p2.score);


            if (maxp.win && minp.win) {
                System.out.println("both palyer was won if want to contunie the game enter \"play\" if you enter a different thing you quit the game/ninput: ");
                java.util.Scanner kb = new java.util.Scanner(System.in);
                if (kb.nextLine().equalsIgnoreCase("play")) {
                    p1.score = 0;
                    p2.score = 0;
                    maxp.win = false;
                } else
                    break;

            } else if (maxp.win) {
                System.out.println("the " + maxp.pName + " is winner game will end if want to contunuie pres \"play\" you play one more game if you enter another thin the game will end %n input:  ");
                java.util.Scanner kb = new java.util.Scanner(System.in);
                if (kb.nextLine().equalsIgnoreCase("play")) {
                    p1.score = 0;
                    p2.score = 0;
                    maxp.win = false;
                } else
                    break;


            }


        }


    }

    public static Player maxPlayer(Player p1, Player p2) {
        return p1.score > p2.score ? p1 : p2;
    }

    public static Player minPlayer(Player p1, Player p2) {
        return p1.score > p2.score ? p2 : p1;
    }


}

class Player {
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

}
