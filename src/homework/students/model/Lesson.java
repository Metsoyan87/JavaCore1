package classwork.students.model;

import java.io.Serializable;
import java.util.Date;

import static homework.packageBook.util.DateUtil.dateToString;

public class Lesson implements Serializable {

    private String name;
    private String teacherNme;
    private int duration;
    private double price;
    private Date startDate;


    public Lesson() {
    }

    public Lesson(String name, String teacherNme, int duration, double price, Date startDate) {
        this.name = name;
        this.teacherNme = teacherNme;
        this.duration = duration;
        this.price = price;
        this.startDate = startDate;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", teacherNme='" + teacherNme + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", startDate=" + dateToString(startDate) +
                '}';
    }
}
