package homework.packageBoks;

import homework.packageBoks.commands.Commands;
import homework.packageBoks.model.Author;
import homework.packageBoks.model.Book;
import homework.packageBoks.storage.AuthorStorage;
import homework.packageBoks.storage.BookStorage;

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

        bookStorage.add(new Book("Samvel", Sevak, 52.45, 0, "Hayrenasirakan"));
        bookStorage.add(new Book("girq", Viliam, 62.15, 1, "Epos"));
        bookStorage.add(new Book("Hayastan", Silva, 102.52, 2, "Patmakan"));

        while (run) {
            Commands.printCommand();
            int command = Integer.parseInt(scanner.nextLine());



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

        if (authorStorage.getSize() == 0) {
            System.out.println("Please add book");
            addAuthor();
        } else {

            authorStorage.print();

            System.out.println("please choose author index");
            int authorIndex = Integer.parseInt(scanner.nextLine());

            Author author = authorStorage.getAuthorByIndex(authorIndex);
            if (author == null) {
                System.out.println("please input correct index");
                addBook();
            } else {

                System.out.println("Please input book title");
                String title = scanner.nextLine();
                System.out.println("Please input book author");
                String authorName = scanner.nextLine();
                System.out.println("Please input book price");
                String priceStr = scanner.nextLine();
                System.out.println("Please input book count");
                String countStr = scanner.nextLine();
                System.out.println("Please input book genre");
                String genre = scanner.nextLine();

                double price = Double.parseDouble(priceStr);
                int count = Integer.parseInt(countStr);

                Book book = new Book(title, author, price, count, genre);
                bookStorage.add(book);
                System.out.println("Thank you, book added");
            }
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
}

