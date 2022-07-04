package homework.packageBook;

import homework.packageBook.commands.Commands;
import homework.packageBook.exception.AuthorNotFoundException;
import homework.packageBook.model.Author;
import homework.packageBook.model.Book;
import homework.packageBook.storage.AuthorStorage;
import homework.packageBook.storage.BookStorage;


import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {
        boolean run = true;

        Author Sevak = new Author("Paruyr", "Sevak", "sevak@mail.ru", "MALE");
        authorStorage.add(Sevak);
        Author Viliam = new Author("Viliam", "Saroyan", "saroyan@mail.ru", "MALE");
        authorStorage.add(Viliam);
        Author Silva = new Author("Silva", "Kaputikyan", "Kaputikyan@mail.ru", "FEMALE");
        authorStorage.add(Silva);
        Author aaa = new Author("aaa", "aaa", "aaa", "aaa");
        authorStorage.add(aaa);

        bookStorage.add(new Book("Samvel", 52.45, 0, "Hayrenasirakan", Sevak));
        bookStorage.add(new Book("girq", 62.15, 1, "Epos", Viliam));
        bookStorage.add(new Book("Hayastan", 102.52, 2, "Patmakan", Silva));
        bookStorage.add(new Book("Verq", 12.54, 7, "Patmakan", aaa));

        while (run) {
            Commands.printCommand();
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
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_Books:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    searchByBook();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    searchByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    booksByPrice();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                case SEARCH_AUTHOR_BY_INDEX:
                    authorByIndex();
                    break;
                default:
                    System.out.println("Invalid command, please try again");

            }
        }
    }

    private static void addAuthor() {

        System.out.println("Please input author name");
        String name = scanner.nextLine();

        System.out.println("Please input author surname");
        String surname = scanner.nextLine();

        System.out.println("Please input author email");
        String email = scanner.nextLine();

        System.out.println("Please input author gender MALE or FEMALE");
        String gender = scanner.nextLine();

        Author author = new Author(name, surname, email, gender);
        authorStorage.add(author);
        System.out.println("author created!");

    }

    private static void addBook() {

        System.out.println("Please input book title");
        String title = scanner.nextLine();


        System.out.println("Please input author name");
        String name = scanner.nextLine();

        System.out.println("Please input author surname");
        String surname = scanner.nextLine();

        System.out.println("Please input author email");
        String email = scanner.nextLine();

        System.out.println("Please input author gender MALE or FEMALE");
        String gender = scanner.nextLine();

        if (authorStorage.existsByEmail(email)) {
            System.out.println("Author already exists, please try again");
            addAuthor();
        }

        Author author = new Author(name, surname, email, gender);

        authorStorage.add(author);
        System.out.println("author created!");

        System.out.println("Please input book price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input book count");
        String countStr = scanner.nextLine();
        System.out.println("Please input book genre");
        String genre = scanner.nextLine();

        try {
            double price = Double.parseDouble(priceStr);
            int count = Integer.parseInt(countStr);
            Book book = new Book(title, price, count, genre, author);
            bookStorage.add(book);
            System.out.println("Thank you, book added");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    static void searchByBook() {
        System.out.println("Please input book author name");
        String authorName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(authorName);
    }

    static void searchByGenre() {
        System.out.println("Please input book genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    static void booksByPrice() {
        System.out.println("Please input book price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input book price");
        double range = Double.parseDouble(scanner.nextLine());
        bookStorage.printBooksByPriceRange(price, range);
    }

    private static void authorByIndex() {
        try {

            System.out.println("Please input author index");
            int index = Integer.parseInt(scanner.nextLine());
            authorStorage.getAuthorByIndex(index);
        } catch (AuthorNotFoundException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

}

