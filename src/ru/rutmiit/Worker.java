package ru.rutmiit;

public class Worker extends Human{

    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        setLastName(lastName);
        setWeekSalary(weekSalary);
        setWorkHoursPerDay(workHoursPerDay);
    }

    private void setWeekSalary(double weekSalary) {
        if(!(weekSalary > 10)){
            throw new IllegalArgumentException("Expected value mismatch! Argument: " + weekSalary);
        }
        else{
            this.weekSalary = weekSalary;
        }
    }

    private void setWorkHoursPerDay(double workHoursPerDay) {
        if(!(workHoursPerDay >= 1 && workHoursPerDay <= 12)){
            throw new IllegalArgumentException("Expected value mismatch! Argument: " + workHoursPerDay);
        }
        else{
            this.workHoursPerDay = workHoursPerDay;
        }
    }

    @Override
    protected void setLastName(String lastName){
        if(!(lastName.length() > 3)){
            throw new IllegalArgumentException("Expected length more than 3 symbols! Argument: " + lastName);
        }
        else{
            this.lastName = lastName;
        }
    };

    @Override
    public String toString(){
        return ("First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nWeek Salary: " + String.format("%.2f", weekSalary) +
                "\nHours per day: " + String.format("%.2f", workHoursPerDay) +
                "\nSalary per hour: " + String.format("%.2f", (weekSalary)/(workHoursPerDay*7)));
    }
}
