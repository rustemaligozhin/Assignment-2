public class Student extends Person{
    private double gpa;

    public Student() {
        super();
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }

    @Override
    public double getPaymentAmount() {
        if(gpa > 2.67){
            return 36600.0;
        }
        return 0.0;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + " " + getPaymentAmount();
    }


}
