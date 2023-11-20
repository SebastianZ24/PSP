public class Board {
    char[][] board = {
            {' ', 'W', ' ', 'W', ' ', 'W', ' ', 'W'},
            {'W', ' ', 'W', ' ', 'W', ' ', 'W', ' '},
            {' ', 'W', ' ', 'W', ' ', 'W', ' ', 'W'},
            {'_', ' ', '_', ' ', '_', ' ', '_', ' '},
            {' ', '_', ' ', '_', ' ', '_', ' ', '_'},
            {'B', ' ', 'B', ' ', 'B', ' ', 'B', ' '},
            {' ', 'B', ' ', 'B', ' ', 'B', ' ', 'B'},
            {'B', ' ', 'B', ' ', 'B', ' ', 'B', ' '}
    };

    public void printBoard(){
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int row = 0; row < board.length; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }

    }
}
