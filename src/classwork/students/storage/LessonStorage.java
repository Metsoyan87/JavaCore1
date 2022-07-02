package homework.students.storage;

import homework.students.exception.LessonNotFoundException;
import homework.students.model.Lesson;

public class LessonStorage {
    private Lesson[] array = new Lesson[10];
    private int size = 0;

    public void add(Lesson lesson) {
        if (size == array.length) {
            extend();
        }
        array[size++] = lesson;
    }

    private void extend() {
        Lesson[] temp = new Lesson[array.length + 10];
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
                System.out.println("lesson deleted");
            }
            size--;
        } else {
            System.out.println("Index out of bounds");
        }
    }


    public Lesson getLessonByIndex(int index) throws LessonNotFoundException {
        if (index >= 0 && index < size) {
            return array[index];

        } else {
            throw new LessonNotFoundException("Lesson with " + index + "index does not exists ");
        }
    }
}





