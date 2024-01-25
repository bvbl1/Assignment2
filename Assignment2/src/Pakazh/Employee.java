package Pakazh;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
        this.position = "Employee";
        this.salary = getSalary();
    }

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.position = "Employee";
        setSalary(salary);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public String getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return position + "\n" + getName() + " " + getSurname() + "\n" + salary + "tg";
    }
}
