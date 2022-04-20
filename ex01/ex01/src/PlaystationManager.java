import java.util.Scanner;

public class PlaystationManager {
    private Playstation playstation;

    public PlaystationManager() {
        this.playstation = new Playstation();
    }

    public void addGame(Game game) {
        this.playstation.notify(game);
    }

    public void subscribe(Observer<Game> subscriber) {
        this.playstation.subscribe(subscriber);
    }
}