public class Employee extends Person {

    private String position;

    private double salary;


    public String getPosition() {
        return "Employee";
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(){
        super();
    }

    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        setSalary(salary);
        setPosition(position);
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }


    public String toString() {
        return position + ": " + super.toString() + " " + getPaymentAmount();
    }
}
