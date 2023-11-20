public class Game {
    private boolean isBlackMove = true;
    private char currentPlayer;
    Board board;
    public Game(Board board) {
        this.board = board;
    }
    public void makeMove(int rowInitial, int colInitial, int rowDestination, int colDestination) {
        currentPlayer = isBlackMove ? 'B' : 'W';

        if (MoveValidation.isValidMove(board.board, rowInitial, colInitial, rowDestination, colDestination, isBlackMove)) {
            if (MoveValidation.isCapture) {
                board.board[rowDestination][colDestination] = currentPlayer;
                board.board[rowInitial][colInitial] = '_';
                board.board[(rowInitial + rowDestination) / 2][(colInitial + colDestination) / 2] = '_';
            } else {
                board.board[rowInitial][colInitial] = '_';
                board.board[rowDestination][colDestination] = currentPlayer;
            }
            isBlackMove = !isBlackMove;
        } else {
            System.out.println("Invalid move");
        }
    }
    public void checkWin(){
        int blackPieces = 0;
        int whitePieces = 0;
        for(int i = 0; i < board.board.length; i++){
            for(int j = 0 ; j < board.board.length; j++){
                if(board.board[i][j]=='B'){
                    blackPieces++;
                }
                else if(board.board[i][j]=='W'){
                    whitePieces++;
                }
            }
        }
        if(blackPieces==0){
            System.out.println("White won!");
            System.exit(0);
        }
        else if(whitePieces==0){
            System.out.println("Black won!");
            System.exit(0);
        }
    }
}
