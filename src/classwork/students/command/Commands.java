package homework.students.command;

public interface Commands {
    int EXIT = 0;
    int ADD_STUDENT = 1;
    int PRINT_ALL_STUDENTS = 2;
    int PRINT_STUDENTS_COUNT = 3;
    int DELETE_STUDENTS_BY_INDEX = 4;
    int PRINT_STUDENTS_BY_LESSON = 5;
    int CHANGE_STUDENTS_LESSON = 6;
    int ADD_LESSON = 7;
    int PRINT_ALL_LESSONS = 8;

    static void printCommands(){
        System.out.println("please input " + EXIT + "  for exit");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_ALL_STUDENTS + " for print all student");
        System.out.println("please input " + PRINT_STUDENTS_COUNT + " for print count");
        System.out.println("please input " + DELETE_STUDENTS_BY_INDEX + " for deleted student");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("please input " + CHANGE_STUDENTS_LESSON + " for change student's lesson");
        System.out.println("please input " + ADD_LESSON + " for Add lesson");
        System.out.println("please input " + PRINT_ALL_LESSONS + " for print all lesson");
    }
}
