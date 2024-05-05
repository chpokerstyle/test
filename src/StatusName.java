public enum StatusName {
    ARCHIVE("archive", "Архивация шаблона"),
    PUBLISH("publish", "Публикация шаблона"),
    DELETE("delete", "удаление шаблона");

    private String statusName;
    private String description;

    private StatusName(String statusName, String description) {
        this.statusName = statusName;
        this.description = description;
    }

    public String getStatusName() {
        return statusName;
    }

    public String getDescription() {
        return description;
    }
}
