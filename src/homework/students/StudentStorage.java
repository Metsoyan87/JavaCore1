package classwork.students;

public class StudentStorage {
    Student[] array = new Student[10];
    int size = 0;

    void add(Student student) {
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
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }
        }

    }

    public void updateLesson(int number, String ln) {
        if (number >= 0 && number < size) {
            for (int i = number; i < size; i++) {
                array[i].setLesson(ln);
                break;
            }
        }
    }
}




