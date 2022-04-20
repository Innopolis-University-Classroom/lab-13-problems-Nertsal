public class PlaystationManager {
    private Scanner scanner;
    private Playstation playstation;

    public PlaystationManager() {
        this.playstation = new Playstation();
    }

    public void addGame(Game game) {
        this.playstation.notify(game);
    }

    public void subscribe(Observer<Game> subscriber) {
        this.playstation.subcribe(subscriber);
    }
}