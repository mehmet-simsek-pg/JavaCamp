package task3;

public class UserManager {
    public void add(Student student) {
        System.out.println("first name:"+student.getFirstName() + " lastname:" + student.getLastName()+
                " take course:"+student.getTakeCourse()+" homework:"+student.getHomework());
    }
    public void add(Instructor instructor){
        System.out.println("first name:"+instructor.getFirstName() + " lastname:" + instructor.getLastName()+
                " given course:"+instructor.getGivenCourse());
    }
    public void addMultiple(User[] users) {
        for (User user : users) {
            if (user instanceof Instructor)
            add((Instructor) user);
            else
                add((Student) user);
        }
    }
    public void delete(Student student ){

        System.out.println(student.getFirstName() + " " + student.getLastName() + " deleted.");
    }
    public void delete(Instructor instructor){
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " deleted.");
    }
}