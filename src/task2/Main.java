package task2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Mehmet", "Şimşek", "Öğrenci");
        Student student2 = new Student("Furkan", "Şimşek", "Öğrenci");
        Student student3 = new Student("Kamil", "Ayyıldız", "Öğrenci");

        Student[] students = {student1, student2, student3};

        Lesson lesson1 = new Lesson("Java", "Temel Seviye");
        Lesson lesson2 = new Lesson("Java", "Orta seviye");
        Lesson lesson3 = new Lesson("Java", "İleri Seviye");

        Lesson[] lessons = {lesson1, lesson2, lesson3};

        for (Student student : students) {
            student.add(student);
        }
        for (Lesson lesson : lessons) {
            lesson.add(lesson);
        }


    }
}
