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
        System.out.print("enter your position");
        int pos = Integer.parseInt(kb.nextLine());
        return pos;
    }
    public static void game(){
        System.out.println("Welcome the Tic Tac Toe game");
        Table table = getTable();
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        boolean turn = true;

        table.printGameTable();

        while(true){
            int pos = getInput(keyboard);
            table.setGameTable(setGameTable(table, pos, turn ? "X" : "O"));
            turn = !turn;

            table.printGameTable();
        }
    }

    public static void main(String[] args) {
        game();
    }

}
