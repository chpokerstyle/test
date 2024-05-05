public class StatusFabric implements State {
    StatusName statusName;

    public StatusFabric(StatusName statusName) {
        this.statusName = statusName;
    }

    @Override
    public String getStatusName() {
        return null;
    }

    @Override
    public void nextStatus(StatusContext documentContext) {
        if(documentContext.getStatusName().equals(StatusName.PUBLISH)){
        }
    }

    @Override
    public void previousStatus(StatusContext documentContext) {

    }
}
