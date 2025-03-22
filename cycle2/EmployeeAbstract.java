abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class EmployeeAbstract {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("John", 101, 5000);
        PartTimeEmployee pt = new PartTimeEmployee("Jane", 102, 20, 80);

        System.out.println("Full-time Salary: " + ft.calculateSalary());
        System.out.println("Part-time Salary: " + pt.calculateSalary());
    }
}
