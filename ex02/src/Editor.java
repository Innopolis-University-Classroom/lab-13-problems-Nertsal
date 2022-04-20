public class Editor<T> {
    private History<T> history;

    public Editor() {
        this.history = new History<>();
    }

    public void write(T state) {
        this.history.push(state);
    }

    public T undo() {
        return this.history.undo().state;
    }
}
