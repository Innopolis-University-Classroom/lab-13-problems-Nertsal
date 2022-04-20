public class Playstation {
    private List<Observer<Game>> mObservers;

    public Playstation() {
        this.mObservers = new ArrayList<>();
    }

    public void subscribe(Observer<Game> subscriber) {
        this.mObservers.add(subsriber);
    }

    public void notify(Game game) {
        for (Observer<Game> observer : mObservers) {
            observer.update(game);
        }
    }
}