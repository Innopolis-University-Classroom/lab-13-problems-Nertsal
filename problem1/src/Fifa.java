import java.util.ArrayList;
import java.util.List;

public class Fifa {
    private List<Observer<Game>> mObservers;

    public Fifa() {
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