public class SalaryWorker extends Worker {
    private double annualSalary;

/**
Stores a given person object
@param ID   the persons ID
@param firstName    the persons first name
@param lastName     the persons last name
@param title        given title for the person
@param yearBorn     the year that the person was born
 **/


    public SalaryWorker(String ID, String firstName, String lastName, String title, int yearBorn, double annualSalary) {
        super(ID, firstName, lastName, title, yearBorn);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        return String.format("This week you made $%.2f USD, which is what you make every week due to your salary.", annualSalary / 52);
    }

    /**
     *
     * @return returns CSV format
     */

    public String toCSV(){
        return super.toCSV() + ", " + annualSalary;
    }

    public String toJson(){
        return toCSV();
    }

    public String toXML(){
        return toCSV();
    }
}
