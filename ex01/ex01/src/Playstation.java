import java.util.ArrayList;
import java.util.List;

public class Playstation {
    private List<Observer<Game>> mObservers;

    public Playstation() {
        this.mObservers = new ArrayList<>();
    }

    public void subscribe(Observer<Game> subscriber) {
        this.mObservers.add(subscriber);
    }

    public void notify(Game game) {
        for (Observer<Game> observer : mObservers) {
            observer.update(game);
        }
    }
}