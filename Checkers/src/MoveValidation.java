public class MoveValidation {
    public static boolean isCapture;
    public static boolean isValidMove(char[][] board, int rowInitial, int colInitial, int rowDestination, int colDestination, boolean isBlackMove) {

        if (rowInitial < 0 || rowInitial >= board.length || colInitial < 0 || colInitial >= board[0].length) {
            return false;
        }

        char currentChoice = board[rowInitial][colInitial];
        if (currentChoice != 'W' && currentChoice != 'B') {
            return false;
        }
        if(isBlackMove && currentChoice == 'W'){
                return false;
        }
        if(!isBlackMove && currentChoice=='B'){
                return false;
        }

        if (rowDestination < 0 || rowDestination >= board.length || colDestination < 0 || colDestination >= board[0].length) {
            return false;
        }

        if (board[rowDestination][colDestination] != '_') {
            return false;
        }
        if(isCapture) isCapture = false;
        char opponent = isBlackMove ? 'W': 'B';
        if (Math.abs(rowInitial - rowDestination) == 2 && Math.abs(colInitial - colDestination) == 2) {
            if (board[(rowInitial + rowDestination) / 2][(colInitial + colDestination) / 2] == opponent) {
                isCapture = true;
                return true;
            }
        }
        if (Math.abs(rowInitial - rowDestination) != 1 || Math.abs(colInitial - colDestination) != 1){
            return false;
        }
        return true;
    }

}
