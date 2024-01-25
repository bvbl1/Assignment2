package Pakazh;

public class Student extends Person {
    private double gpa;
    public Student(){
        super();
    }
    public Student(String name, String Surname, double gpa){
        super(name, Surname);
        setGpa(gpa);
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }


    @Override
    public String getPosition() {
        return "student";
    }

    @Override
    public double getPaymentAmount() {
        if (gpa>2.67){
            return 41500;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return getPosition() + "\n" + getName() + " " + getSurname() + "\n" + gpa + getPaymentAmount() + "tg";
    }
}
