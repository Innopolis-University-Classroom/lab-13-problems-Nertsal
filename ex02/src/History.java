import java.util.ArrayDeque;

public class History<T> {
    private ArrayDeque<Momento<T>> history;

    public History() {
        this.history = new ArrayDeque<>();
    }

    public void push(T state) {
        this.history.add(new Momento<>(state));
    }

    public Momento<T> undo() {
        return history.pop();
    }
}
