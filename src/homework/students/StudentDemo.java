package classwork.students;

import java.util.Scanner;

public class StudentDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;

        studentStorage.add(new Student("Poxos", "Poxosyan", 22, "093949508", "Gyumri", "Java"));
        studentStorage.add(new Student("Sargis", "Sargsyan", 13, "033949508", "Erevan", "SQL"));
        studentStorage.add(new Student("Petros", "Petrosyan", 16, "098556595", "Ijevan", "PHP"));

        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add student");
            System.out.println("please input 2 for print all student");
            System.out.println("please input 3 for print count");
            System.out.println("please input 4 for deleted student");
            System.out.println("please input 5 for print students by lesson");
            System.out.println("please choose 6 for change student's lesson");

            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    System.out.println(studentStorage.getSize());
                    break;
                case 4:
                    deleted();
                    break;
                case 5:
                    searchByLesson();
                    break;
                case 6:
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
