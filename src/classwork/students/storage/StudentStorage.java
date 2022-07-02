package homework.students.storage;

import homework.students.model.Lesson;
import homework.students.model.Student;

public class StudentStorage {
    Student[] array = new Student[10];
    int size = 0;

    public void add(Student student) {
        if (size == array.length) {
            extend();
        }
        array[size++] = student;
    }

    private void extend() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }
    }

    public int getSize() {
        return size;
    }

    public void delete(int index) {

        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[index] = array[index + 1];
                System.out.println("student deleted");
            }
            size--;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void printStudentsByLesson(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equalsIgnoreCase(lessonName)) {
                System.out.println(array[i]);
            }

    }

}

    public void updateLesson(int index, Lesson lessonName) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {

                array[i].setLesson(lessonName);
                break;
            }
        }

    }

    public Student getStudentByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];

        }
        return null;
    }
}





