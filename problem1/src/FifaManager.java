public class FifaManager {
    private Fifa fifa;

    public FifaManager() {
        this.fifa = new Fifa();
    }

    public void addGame(Game game) {
        this.fifa.notify(game);
    }

    public void subscribe(Observer<Game> subscriber) {
        this.fifa.subscribe(subscriber);
    }
}