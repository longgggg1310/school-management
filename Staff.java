package package1;

import package1.Position;

public abstract class Staff {
    public String staff_id;
    protected String staff_name;
    public int staff_birth_year;
    private int yob;

    public abstract double getSalary();

    public Staff(String staff_id, String staff_name, int staff_birth_year) {
        this.staff_name = staff_name;
        this.staff_id = staff_id;
        this.staff_birth_year = staff_birth_year;
    }

    public String getStaff_id() {
        return this.staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return this.staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public int getStaff_birth_year() {
        return this.staff_birth_year;
    }

    public void setStaff_birth_year(int staff_birth_year) {
        this.staff_birth_year = staff_birth_year;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

}
