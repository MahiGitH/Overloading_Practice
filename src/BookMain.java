import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book("Searching for the Ark of the Covenant", 226, 2005);
        Book book2 = new Book("The Battle of Adwa: African Victory in the Age of Empire", 432);
        Book book3 = new Book(288, 1997);
        Book book4 = new Book("The Orthodox Church of Ethiopia");
        Book book5 = new Book(34);
        Book book6 = new Book();
        books.add(book1); books.add(book2); books.add(book3); books.add(book4);books.add(book5);books.add(book6);


        while (true) {
            System.out.println("Book information");
            System.out.println("Entering an empty string as the name of the book ends the reading process.");
            System.out.print("The title of a book: " + "\n");
            String bookName = scanner.nextLine();

            if (bookName.equalsIgnoreCase("")) {
                break;
            }

            System.out.println("Number of book pages: ");
            int bookPages = Integer.parseInt(scanner.nextLine());

            System.out.print("The book publication year: " + "\n");
            int bookPublication = Integer.parseInt(scanner.nextLine());

            books.add(new Book(bookName, bookPages, bookPublication));
            System.out.println("New book has been added.");
        }

        while (true) {
            System.out.print("Please enter 'name' to print just the Book title or 'everything' to print all the book information" + "\n");
            System.out.print("What information will be printed? ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("everything")) {
                for (Book book : books) {
                    System.out.println(book);
                }
                return;
            } else if (userInput.equalsIgnoreCase("name")) {
                for (Book book : books) {
                    System.out.println(book.getBookTitle());
                }
                return;
            } else {
                System.out.println("Invalid entry");
            }
        }
    }
}
