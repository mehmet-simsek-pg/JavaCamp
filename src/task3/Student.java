package task3;

public class Student extends User{
    private String takeCourse,homework;

    public Student(int id, String firstName, String lastName,String takeCourse,String homework) {
        super(id, firstName, lastName);
        setTakeCourse(takeCourse);
        setHomework(homework);
    }

    public String getTakeCourse() {
        return takeCourse;
    }

    public void setTakeCourse(String takeCourse) {
        this.takeCourse = takeCourse;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }
}
