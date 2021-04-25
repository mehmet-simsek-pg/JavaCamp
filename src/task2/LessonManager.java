package task2;

public class LessonManager {
    private static int count = 1;
    private int id;
    private String lessonName, details;

    public LessonManager(String lessonName, String details) {
        setId();
        setLessonName(lessonName);
        setDetails(details);
    }

    public void add(LessonManager lesson) {
        System.out.println("Sisteme bu ders eklendi : " + lesson.getId() + " " + lesson.getLessonName() + " " + lesson.getDetails());
    }

    public void delete(LessonManager lesson) {
        System.out.println("Sistemden bu ders silindi :" + lesson.getId() + " " + lesson.getLessonName() + " " + lesson.getDetails());
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = count++;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
