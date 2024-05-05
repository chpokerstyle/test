public class StatusContext {
    private State state;

    public State getState() {
        return state;
    }

    public void nextDocumStatus() {
        state.nextStatus(this);
    }

    public void previousDocumStatuc() {
        state.previousStatus(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getStatusName() {
        return state.getStatusName();
    }
}
