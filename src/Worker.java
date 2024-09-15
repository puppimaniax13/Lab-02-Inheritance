public class Worker extends Person {
    private double hourlyPayRate;

/**
Stores a given person object
@param ID   the persons ID
@param firstName    the persons first name
@param lastName     the persons last name
@param title        given title for the person
@param yearBorn     the year that the person was born
 **/

public Worker(String ID, String firstName, String lastName, String title, int yearBorn) {
    super(ID, firstName, lastName, title, yearBorn);
    this.hourlyPayRate = 0.0; // Default value if not provided
}

public Worker(String ID, String firstName, String lastName, String title, int yearBorn, double hourlyPayRate) {
        super(ID, firstName, lastName, title, yearBorn);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double overTime;
        if(hoursWorked > 40) {
            overTime = hoursWorked - 40;
            return (hoursWorked * hourlyPayRate) + (overTime * (hourlyPayRate * 1.5));
        }
        else {
            return (hoursWorked * hourlyPayRate);
        }

    }

    public String displayWeeklyPay(double hoursWorked) {
        double overTime;
        double otPay;
        if(hoursWorked > 40) {
            overTime = hoursWorked - 40;
            otPay = overTime * (hourlyPayRate * 1.5);
            return String.format("For 40 hours of regular pay you earned $%.2f USD. Then you worked %.2f hours of OT, earning $%.2f USD." +
                    "\nWorking a total of %.2f hours, you earned $%.2f USD", calculateWeeklyPay(40), overTime, otPay, hoursWorked, calculateWeeklyPay(hoursWorked));
        }
        else {
            return String.format("The total amount made for %.2f hours of work is $%.2f USD", hoursWorked, calculateWeeklyPay(hoursWorked));
        }
    }

    /**
     *
     * @return returns CSV format
     */

    public String toCSV(){
        return super.toCSV() + ", " + hourlyPayRate;
    }

    public String toJson(){
        return toCSV();
    }

    public String toXML(){
        return toCSV();
    }
}
