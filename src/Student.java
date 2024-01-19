public class Student extends Person{
    private static int id_gen = 1;
    private int id;
    private String name;

    private String surname;
    private double gpa;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getSurname() {
        return surname;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public Student(){
        this.id = id_gen++;
    }

    public Student(String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
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
        return "Student: " + id + ". " + name + " " + surname + " earns " + getPaymentAmount() + " tenge";
    }


}
