package src;

public enum Position {
    HEAD("HEAD"),
    DEPUTY("DEPUTY"),
    EMPLOYEE("EMPLOYEE");

    private String displayName;

    Position(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
