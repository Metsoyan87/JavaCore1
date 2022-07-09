package classwork.students.model;

public class Lesson {

    private String name;
    private String teacherNme;
    private int duration;
    private double price;



    public Lesson() {
    }

    public Lesson(String name, String teacherNme, int duration, double price) {
        this.name = name;
        this.teacherNme = teacherNme;
        this.duration = duration;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherNme() {
        return teacherNme;
    }

    public void setTeacherNme(String teacherNme) {
        this.teacherNme = teacherNme;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", teacherNme='" + teacherNme + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }

    public boolean equalsIgnoreCase(String lessonName) {
        return true;
    }
}
