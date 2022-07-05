package homework.packageBook.commands;

public interface Commands {

    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_Books = 2;
    int PRINT_BOOKS_BY_AUTHOR_NAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHORS = 7;
    int SEARCH_AUTHOR_BY_INDEX = 8;
    int CHANGE_BOOK_LESSON = 9;

    static void printCommand() {
        System.out.println("please input " + EXIT + "  for exit");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + PRINT_ALL_Books + " for print all books");
        System.out.println("please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name");
        System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print by genre");
        System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print by price range");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + PRINT_ALL_AUTHORS + " for print all authors");
        System.out.println("please input " + SEARCH_AUTHOR_BY_INDEX + " for search by author index");
        System.out.println("please input " + CHANGE_BOOK_LESSON + " for change book's lesson");

    }
}