package classwork.students;

import java.util.Scanner;

public class StudentDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;

        studentStorage.add(new Student("Poxos", "Poxosyan", 22, "093949508", "Gyumri", "Java"));
        studentStorage.add(new Student("Sargis", "Sargsyan", 13, "033949508", "Erevan", "SQL"));
        studentStorage.add(new Student("Petros", "Petrosyan", 16, "098556595", "Ijevan", "PHP"));

        while (run) {
            System.out.println("please input " + EXIT + "  for exit");
            System.out.println("please input " + ADD_STUDENT + " for add student");
            System.out.println("please input " + PRINT_ALL_STUDENTS + " for print all student");
            System.out.println("please input " + PRINT_STUDENTS_COUNT + " for print count");
            System.out.println("please input " + DELETE_STUDENTS_BY_INDEX + " for deleted student");
            System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
            System.out.println("please choose " + CHANGE_STUDENTS_LESSON + " for change student's lesson");

            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_COUNT:
                    System.out.println(studentStorage.getSize());
                    break;
                case DELETE_STUDENTS_BY_INDEX:
                    deleted();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    searchByLesson();
                    break;
                case CHANGE_STUDENTS_LESSON:
                    changeStudentLesson();
                    break;
                default:
                    System.out.println("Invalid command, please try again");

            }

        }

    }

    private static void addStudent() {
        System.out.println("Please input student name");
        String name = scanner.nextLine();
        System.out.println("Please input student surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student city");
        String city = scanner.nextLine();
        System.out.println("Please input student lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);

        System.out.println("student object:");
        System.out.println(student);
    }

    static void changeStudentLesson() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student != null) {
            System.out.println("Please input new lesson name");
            String lessonName = scanner.nextLine();
            if (lessonName != null && !lessonName.trim().equals("")) {
                student.setLesson(lessonName.trim());
                System.out.println("lesson changed for student" + student.getName() + " " + student.getSurname());
            }
        } else {
            System.out.println("invalid index try again");
            changeStudentLesson();
        }
    }

    static void searchByLesson() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLesson(lessonName);
    }

    static void deleted() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }
}
