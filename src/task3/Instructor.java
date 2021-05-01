package task3;

public class Instructor extends User{
    private String givenCourse;

    public Instructor(int id, String firstName, String lastName,String givenCourse) {
        super(id, firstName, lastName);
        setGivenCourse(givenCourse);
    }

    public String getGivenCourse() {
        return givenCourse;
    }

    public void setGivenCourse(String givenCourse) {
        this.givenCourse = givenCourse;
    }
}
