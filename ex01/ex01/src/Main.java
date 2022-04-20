import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PlaystationManager manager = new PlaystationManager();

        // Parse game
        while (scanner.hasNextLine()) {
            String title = scanner.nextLine();
            String publisher = scanner.nextLine();
            String company = scanner.nextLine();
            String price = scanner.nextLine();
            String date = scanner.nextLine();
            String trailer = scanner.nextLine();
            String discounts = scanner.nextLine();
            Game game = new Game(title, publisher, company, price, date, trailer, discounts);
            manager.addGame(game);
        }
    }
}
