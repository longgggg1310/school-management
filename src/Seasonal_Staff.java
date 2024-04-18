package src;

import src.Staff;

public class Seasonal_Staff extends Staff implements Account{
    private double priceInDay, workday;

    public Seasonal_Staff(String staff_name, int staff_birth_year, int staff_id, double priceInDay, double workday) {
        super(staff_id, staff_name, staff_birth_year);
        this.priceInDay = priceInDay;
        this.workday = workday;
    }

    public double getPriceInDay() {
        return this.priceInDay;
    }

    public void setPriceInDay(double priceInDay) {
        this.priceInDay = priceInDay;
    }

    public double getWorkday() {
        return this.workday;
    }

    public void setWorkday(double workday) {
        this.workday = workday;
    }

}
