import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Game game = new Game(board);
        while (true) {
            board.printBoard();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select initial row: ");
            int rowInitial = scanner.nextInt();
            System.out.println("Select initial column: ");
            int colInitial = scanner.nextInt();
            System.out.println("Select destination row: ");
            int rowDestination = scanner.nextInt();
            System.out.println("Select destination column: ");
            int colDestination = scanner.nextInt();
            game.makeMove(rowInitial, colInitial, rowDestination, colDestination);
            game.checkWin();
        }
    }
}