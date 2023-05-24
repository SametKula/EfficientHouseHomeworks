package homeworkLessonSpace12.arrayPractise_TicTacToeGame;

public class Table {
    public char[][] gameTable = {
            {' ', '|', ' ', '|',' '},
            {' ', '|', ' ', '|',' '},
            {' ', '|', ' ', '|',' '}
    };

    public boolean checkTable(char user){
        char[][] gameTable = getGameTable();
        boolean result = false;
        for(int i = 0, j = 2; i < 3 & j <= 4; i++, j += 2)
            if (gameTable[i][0] == user && gameTable[i][2] == user && gameTable[i][4] == user || gameTable[0][j] == user && gameTable[1][j] == user && gameTable[2][j] == user)
                result = true;

        if (gameTable[0][0] == user && gameTable[1][2] == user && gameTable[2][4] == user || gameTable[0][4] == user && gameTable[1][2] == user && gameTable[2][0] == user)
            result = true;

        return result;
    }
    public char[][] getGameTable() {
        return gameTable;
    }
    public void printGameTable(){
        for (char[] row : getGameTable()){
            for (char colum : row)
                System.out.print(colum);
            System.out.println();
        }
    }
    public void setGameTable(char[][] newGameTable){
        gameTable = newGameTable;
    }

}
