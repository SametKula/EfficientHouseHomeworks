package homeworkLessonSpace12.arrayPractise_TicTacToeGame;

public class Table {
    public char[][] gameTable = {
            {' ', '|', ' ', '|',' '},
            {' ', '|', ' ', '|',' '},
            {' ', '|', ' ', '|',' '}
    };

    public char[][] getGameTable() {
        return gameTable;
    }
    public void setGameTable(char[][] newGameTable){
        gameTable = newGameTable;
    }
    public void printGameTable(){
        for (char[] row : getGameTable()){
            for (char colum : row)
                System.out.print(colum);
            System.out.println();
        }
    }


}
