import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an ArrayList to hold Worker instances
        ArrayList<Worker> workers = new ArrayList<>();

        // Create 3 Worker instances with reasonable hourly rates
        Worker worker1 = new Worker("W001", "Alice", "Johnson", "Ms.", 1985, 25.0); // Hourly rate: $25.00
        Worker worker2 = new Worker("W002", "Bob", "Smith", "Mr.", 1990, 20.0); // Hourly rate: $20.00
        Worker worker3 = new Worker("W003", "Charlie", "Brown", "Mr.", 1988, 30.0); // Hourly rate: $30.00

        // Add Worker instances to the ArrayList
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);

        // Create 3 SalaryWorker instances with reasonable annual salaries
        SalaryWorker salaryWorker1 = new SalaryWorker("SW001", "David", "Wilson", "Mr.", 1980, 75000.0); // Salary: $75,000
        SalaryWorker salaryWorker2 = new SalaryWorker("SW002", "Eva", "Taylor", "Mrs.", 1975, 95000.0); // Salary: $95,000
        SalaryWorker salaryWorker3 = new SalaryWorker("SW003", "Frank", "Miller", "Mr.", 1972, 120000.0); // Salary: $120,000

        // Add SalaryWorker instances to the ArrayList
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        double[][] weeklyPayments = new double[workers.size()][3]; // 3 weeks for each worker

        // Week 1: 40 hours
        for (int i = 0; i < workers.size(); i++) {
            Worker worker = workers.get(i);
            weeklyPayments[i][0] = worker.calculateWeeklyPay(40);
        }

        for (int i = 0; i < workers.size(); i++) {
            Worker worker = workers.get(i);
            weeklyPayments[i][1] = worker.calculateWeeklyPay(50);
        }

        // Week 3: back to 40 hours
        for (int i = 0; i < workers.size(); i++) {
            Worker worker = workers.get(i);
            weeklyPayments[i][2] = worker.calculateWeeklyPay(40);
        }

        // Display the profits made from each week
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Name", "Week 1", "Week 2", "Week 3");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < workers.size(); i++) {
            Worker worker = workers.get(i);
            System.out.printf("%-20s $%-14.2f $%-14.2f $%-14.2f%n",
                    worker.fullName(),  // Use fullName() to get the worker's full name
                    weeklyPayments[i][0],
                    weeklyPayments[i][1],
                    weeklyPayments[i][2]);
        }
    }
}