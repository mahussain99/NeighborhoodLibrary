package pluralsight;

import java.util.Scanner;

public class neighborhoodLibrary {

    // Initialize an array of book objects with a maximum size of 20.
    private static Book[] Book = new Book[20];
    // The number of book currently stored in the vehicles array.
    private static int numOfBook = 4;

    public static void main(String[] args) {
        // Create and initialize some book objects and store them in the book array.
        Book[0] = new Book(1, "139-78-0132350884", "A Handbook of Agile Software Craftsmanship", false, ""  );
        Book[1] = new Book(2, "13-978-0135957059", "The Pragmatic Programmer: Your Journey to Mastery ", true, "");
        Book[2] = new Book(3, "13: 978-0201616224", "The Pragmatic Programmer: ", true, "");
        Book[3] = new Book(3, "13: 978-0201616224", "The Pragmatic Programmer: ", false, "");
        
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        boolean isDone = false;

        // Run a loop until the user quits the program.
        while (!isDone) {

            // Display the options menu to the user.
            System.out.println("1. Show Available Books ");
            System.out.println("2. Show Checked Out Books ");
            System.out.println("3. Exit - closes out of the application ");

            // Read the user's input command.
            int comment = scanner.nextInt();
            // Consume the newline character left in the scanner buffer after reading the command.
            scanner.nextLine();

            switch (comment) {
                case 1:
                    listOfBooks(scanner);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("exit");
                    isDone = true;
                default:
                    System.out.println("Book not in the list");
                    break;
            }

        }

    }
    public static void listOfBooks(Scanner scanner) {
        System.out.println("We have books in the list");
        for (int i = 0; i < numOfBook; i++) {
            System.out.println(Book[i]);

        }
    }
    public static  void available_Books(Scanner scanner){
        System.out.println("Enter book name or title");
        String title = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < numOfBook; i++) {
            if (Book[i].getTitle().equalsIgnoreCase(title));
            System.out.println(Book[i]);
            found = true;

            if (! found)
                System.out.println("Book not available");
            
        }
            
        }
    }

