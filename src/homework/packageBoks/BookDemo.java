package homework.packageBoks;

import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;

        bookStorage.add(new Book("Samvel", "Raffi", 52.45, 0, "Hayrenasirakan"));
        bookStorage.add(new Book("girq", "Sevak", 62.15, 1, "Epos"));
        bookStorage.add(new Book("Xachagoxi Hishatakaran", "Gugo", 102.52, 2, "Vep"));


        while (run) {
            System.out.println("please input " + EXIT + "  for exit");
            System.out.println("please input " + ADD_BOOK + " for add book");
            System.out.println("please input " + PRINT_ALL_Books + " for print all books");
            System.out.println("please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name");
            System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print by genre");
            System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print by price range");

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
                    searchByPrice();
                    break;
                default:
                    System.out.println("Invalid command, please try again");

            }
        }
    }

    private static void addBook() {
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        System.out.println("Please input book authorName");
        String authorName = scanner.nextLine();
        System.out.println("Please input book price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input book count");
        String countStr = scanner.nextLine();
        System.out.println("Please input book genre");
        String genre = scanner.nextLine();

        double price = Double.parseDouble(priceStr);
        int count = Integer.parseInt(countStr);

        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);

        System.out.println("book object:");
        System.out.println(book);
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

    static void searchByPrice() {
        System.out.println("Please input book price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input book price");
        double range = Double.parseDouble(scanner.nextLine());
        bookStorage.printBooksByPriceRange(price,range);
    }
}

