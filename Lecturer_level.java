package package1;

public enum Lecturer_level {
    Bachelor("Bachelor's degree"),
    Master("Master's degree"),
    Doctorate("Doctorate degree");

    private String name;

    Lecturer_level(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
