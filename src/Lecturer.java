package src;

import src.Lecturer_level;

public class Lecturer extends Staff implements Account {
    private String field;
    private Lecturer_level lecturer_level;
    private int allowance;
    private int number_of_sessions_per_month;
    private int salary_cofficient;
    private int started_working_year;
    private double basicSalary;
    private int teachingHour;
    private Account account;
    private int year = 2020;

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Lecturer_level getLecturer_level() {
        return this.lecturer_level;
    }

    public void setLecturer_level(Lecturer_level lecturer_level) {
        this.lecturer_level = lecturer_level;
    }

    public int getAllowance() {
        switch (lecturer_level) {
            case Bachelor:
                allowance = 300 * (1 + (getYearsOfService() / 10));
                break;
            case Master:
                allowance = 900 * (1 + (getYearsOfService() / 10));
                break;
            case Doctorate:
                allowance = 2000 * (1 + (getYearsOfService() / 10));
                break;
        }
        return allowance;

    }

    double getCoefficient() {
        return salary_cofficient + getYearsOfService() * 0.3;
    }

    int getYearsOfService() { // lấy số năm làm việc
        return (year - started_working_year);
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public int getNumber_of_sessions_per_month() {
        return this.number_of_sessions_per_month;
    }

    public void setNumber_of_sessions_per_month(int number_of_sessions_per_month) {
        this.number_of_sessions_per_month = number_of_sessions_per_month;
    }

    public int getSalary_cofficient() {
        return this.salary_cofficient;
    }

    public void setSalary_cofficient(int salary_cofficient) {
        this.salary_cofficient = salary_cofficient;
    }

    public int getStarted_working_year() {
        return this.started_working_year;
    }

    public void setStarted_working_year(int started_working_year) {
        this.started_working_year = started_working_year;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getTeachingHour() {
        return this.teachingHour;
    }

    public void setTeachingHour(int teachingHour) {
        this.teachingHour = teachingHour;
    }

    public Lecturer(String staff_id, String staff_name, int staff_birth_year, String field,
            Lecturer_level lecturer_level,
            int allowance, int number_of_sessions_per_month, int salary_cofficient, int started_working_year,
            double basicSalary, int teachingHour) {
        super(staff_id, staff_name, staff_birth_year);
        this.field = field;
        this.lecturer_level = lecturer_level;
        this.allowance = allowance;
        this.number_of_sessions_per_month = number_of_sessions_per_month;
        this.salary_cofficient = salary_cofficient;
        this.started_working_year = started_working_year;
        this.teachingHour = teachingHour;
        this.basicSalary = basicSalary;
        account = new MyAccount(staff_id, 0);
    }

    @Override
    public double getSalary() {
        return salary_cofficient * basicSalary + getAllowance() + getTeachingHour() * 45;
    }

    @Override
    public int getBalance() {
        return account.getBalance();
    }

    @Override
    public int debit(int amount) {
        return account.debit(amount);
    }

    @Override
    public int credit(int amount) {
        return account.credit(amount);
    }

}
