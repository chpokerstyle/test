public interface State {
    String getStatusName();
    void nextStatus(StatusContext documentContext);
    void previousStatus(StatusContext documentContext);
}
