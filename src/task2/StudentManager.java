package task2;

public class StudentManager {
    private static int count = 1;
    private int id;
    private String firstName, lastName, details;

    public StudentManager(String firstName, String lastName, String details) {
        setId();
        setFirstName(firstName);
        setLastName(lastName);
        setDetails(details);
    }

    public void add(StudentManager student) {

        System.out.println("Sisteme Eklendi : " + student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " " + student.getDetails());
    }

    public void delete(StudentManager student) {

        System.out.println("Sistemden silindi : " + student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " " + student.getDetails());
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


}
