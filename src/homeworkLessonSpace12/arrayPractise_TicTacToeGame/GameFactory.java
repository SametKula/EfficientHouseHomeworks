package homeworkLessonSpace12.arrayPractise_TicTacToeGame;

public class GameFactory {
    public static Table getTable(){
        Table table = new Table();
        return table;
    }
    public static char[][] setGameTable(Table table, int order, String user){
        switch(order){
            case 1:
                table.getGameTable()[0][0] = user.charAt(0);
                break;
            case 2:
                table.getGameTable()[0][2] = user.charAt(0);
                break;
            case 3:
                table.getGameTable()[0][4] = user.charAt(0);
                break;
            case 4:
                table.getGameTable()[1][0] = user.charAt(0);
                break;
            case 5:
                table.getGameTable()[1][2] = user.charAt(0);
                break;
            case 6:
                table.getGameTable()[1][4] = user.charAt(0);
                break;
            case 7:
                table.getGameTable()[2][0] = user.charAt(0);
                break;
            case 8:
                table.getGameTable()[2][2] = user.charAt(0);
                break;
            case 9:
                table.getGameTable()[2][4] = user.charAt(0);
        }

        return table.getGameTable();
    }

    public static int getInput(java.util.Scanner kb){
        System.out.print("enter your position: ");
        int pos = Integer.parseInt(kb.nextLine());
        return pos;
    }
    public static boolean isPositionAlreadyTaken(Table table, int pos){
        switch(pos){
            case 1:
                if(table.getGameTable()[0][0] != ' '){
                    return true;
                }
                break;
            case 2:
                if(table.getGameTable()[0][2] != ' '){
                    return true;
                }
                break;
            case 3:
                if(table.getGameTable()[0][4] != ' '){
                    return true;
                }
                break;
            case 4:
                if(table.getGameTable()[1][0] != ' '){
                    return true;
                }
                break;
            case 5:
                if(table.getGameTable()[1][2] != ' '){
                    return true;
                }
                break;
            case 6:
                if(table.getGameTable()[1][4] != ' '){
                    return true;
                }
                break;
            case 7:
                if(table.getGameTable()[2][0] != ' '){
                    return true;
                }
                break;
            case 8:
                if(table.getGameTable()[2][2] != ' '){
                    return true;
                }
                break;
            case 9:
                if(table.getGameTable()[2][4] != ' '){
                    return true;
                }
                break;
        }
        return false;
    }
    public static int getRandomNumberForTable(Table table){
        java.util.Random rd = new java.util.Random();

        while(true){
            int pos = rd.nextInt(9) + 1;
            if(!isPositionAlreadyTaken(table, pos)){
                return pos;
            }
        }
    }
    public static void game(boolean gameMode){
        System.out.println("Welcome the Tic Tac Toe game");
        Table table = getTable();
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        boolean turn = true;

        table.printGameTable();

        while(true){
            int pos;
            if (gameMode)
                pos = getInput(keyboard);
            else
                pos = getRandomNumberForTable(table);

            if (pos < 1 || isPositionAlreadyTaken(table, pos)){
                System.out.println("try again you did enter a wrong position");
                continue;
            }


            table.setGameTable(setGameTable(table, pos, turn ? "X" : "O"));
            turn = !turn;

            table.printGameTable();
            if(table.checkTable(!turn ? 'X' : 'O')){
                System.out.printf("Congratulations, %s won!", !turn ? "Player" : "Computer");
                break;
            }
            if ()
        }
    }
    public static boolean isGameTableFull(Table table){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 4; j += 2) {
                if (table.getGameTable()[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        game(false);
    }

}
