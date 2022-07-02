package homework.students;

import homework.students.command.Commands;
import homework.students.exception.LessonNotFoundException;
import homework.students.model.Lesson;
import homework.students.model.Student;
import homework.students.storage.LessonStorage;
import homework.students.storage.StudentStorage;

import java.util.Scanner;

public class StudentDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        boolean run = true;

        Lesson Java = new Lesson("Java", "Gago", 3, 35000);
        lessonStorage.add(Java);
        Lesson JavaScript = new Lesson("JavaScript", "Vanik", 2, 30000);
        lessonStorage.add(JavaScript);
        Lesson SQL = new Lesson("SQL", "Artur", 1, 25000);
        lessonStorage.add(SQL);

        studentStorage.add(new Student("Poxos", "Poxosyan", 22, "093949508", "Gyumri", Java));
        studentStorage.add(new Student("Sargis", "Sargsyan", 13, "033949508", "Erevan", JavaScript));
        studentStorage.add(new Student("Petros", "Petrosyan", 16, "098556595", "Ijevan", SQL));

        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

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
                    System.out.println("students counts = " + studentStorage.getSize());
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
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command, please try again");

            }

        }

    }

    private static void addLesson() {

        System.out.println("Please input lesson name");
        String name = scanner.nextLine();

        System.out.println("Please input lesson teacher name");
        String teacherName = scanner.nextLine();

        System.out.println("Please input lesson duration by mount");
        int duration = Integer.parseInt(scanner.nextLine());

        System.out.println("Please input lesson price");
        double price = Double.parseDouble(scanner.nextLine());

        Lesson lesson = new Lesson(name, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("Lesson created!");

    }


    private static void addStudent() {

        if (lessonStorage.getSize() == 0) {
            System.out.println("Please add lesson");
            addLesson();
        } else {

            lessonStorage.print();

            System.out.println("please choose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            try {
                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);

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

                int age = Integer.parseInt(ageStr);
                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);

                System.out.println("Thank you, student added");

            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
                addStudent();
            }
        }
    }

    static void changeStudentLesson() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student != null) {
            System.out.println("Please input new lesson index");
            lessonStorage.print();
            System.out.println("please choose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());

            try {
                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                student.setLesson(lesson);
                System.out.println("Lesson changed!");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
                changeStudentLesson();
            }


        } else {
            System.out.println("Invalid index please try again");
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
