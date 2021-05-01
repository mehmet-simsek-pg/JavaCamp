package task3;

public class Main {
    public static void main(String[] args) {
        Instructor instructor=new Instructor(1,"Engin","Demirog","Java and React Course");
        Student student=new Student(2,"Mehmet","Simsek","Java and React Course","Task3");


        UserManager userManager=new UserManager();

        userManager.add(instructor);
        userManager.add(student);
        userManager.delete(instructor);
        userManager.delete(student);

        userManager.addMultiple(new User[]{instructor,student});

    }
}
