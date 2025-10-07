package pluralsight;

import java.util.Scanner;

public class neighborhoodLibrary {

    // Initialize an array of book objects with a maximum size of 20.
    private static Book[] Book = new Book[20];
    // The number of book currently stored in the vehicles array.
    private static int numOfBook = 20;

    public static void main(String[] args) {
        // Create and initialize some book objects and store them in the book array.
        Book[0] = new Book(1, "13: 978-0132350884", "A Handbook of Agile Software Craftsmanship", false, "");
        Book[1] = new Book(2, "13: 978-0135957059", "The Pragmatic Programmer Your Journey to Mastery ", true, "");
        Book[2] = new Book(3, "13: 978-0201616224", "The Pragmatic Programmer ", true, "");
        Book[3] = new Book(4, "13: 978-0201616224", "The Pragmatic Code Programmer ", false, "");
        Book[4] = new Book(5, "12: 978-0439708180", "Harry Potter and the Sorcerer’s Stone", false, "");
        Book[5] = new Book(6, "13: 978-0135957059", "The Hobbit ", true, "");
        Book[6] = new Book(7, "13: 978-0201616224", "The Hunger Games ", true, "");
        Book[7] = new Book(8, "13: 978-0201616224", "TTo Kill a Mockingbird", false, "");
        Book[8] = new Book(9, "13: 978-0132350884", "A Handbook of Agile Software Craftsmanship", false, "");
        Book[9] = new Book(10, "13: 978-0135957059", "The Pragmatic Programmer Your Journey to Mastery ", true, "");
        Book[10] = new Book(11, "13: 978-0201616224", "The Pragmatic Programmer ", true, "");
        Book[11] = new Book(12, "13: 978-0201616224", "The Pragmatic Code Programmer ", false, "");
        Book[12] = new Book(13, "12: 978-0439708180", "Harry Potter and the Sorcerer’s Stone", false, "");
        Book[13] = new Book(14, "13: 978-0135957059", "The Hobbit ", true, "");
        Book[14] = new Book(15, "13: 978-0201616224", "The Hunger Games ", true, "");
        Book[15] = new Book(16, "13: 978-0201616224", "TTo Kill a Mockingbird", false, "");
        Book[16] = new Book(17, "12: 978-0439708180", "Harry Potter and the Sorcerer’s Stone", false, "");
        Book[17] = new Book(18, "13: 978-0135957059", "The Hobbit ", true, "");
        Book[18] = new Book(19, "13: 978-0201616224", "The Hunger Games ", true, "");
        Book[19] = new Book(20, "13: 978-0201616224", "TTo Kill a Mockingbird", false, "");


        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        boolean hasDone = false;

        // Run a loop until the user quits the program.
        while (!hasDone) {

            // Display the options menu to the user.
            System.out.println("The Store Home Screen");
            System.out.println("1. Show Available Books ");
            System.out.println("2. Show Checked Out Books ");
            System.out.println("3. Exit - closes out of the application ");

            // Read the user's input command.
            int comment = scanner.nextInt();

            // Consume the newline character left in the scanner buffer after reading the command.
            scanner.nextLine();

            switch (comment) {
                case 1:
                    show_Available_Books(scanner);
                    break;
                case 2:
                    show_Checked_Out_Books(scanner);
                    break;
                case 3:
                    System.out.println("exit");
                    hasDone = true;
                default:
                    System.out.println("Book not in the list");
                    break;
            }

        }

    }

    public static void show_Available_Books(Scanner scanner) {

        for (int i = 0; i < numOfBook; i++ ) {
            if (!Book[i].isCheckedOut()) ;
            System.out.println(Book[i].getId() + "|" + Book[i].getIsbn() + "| " + Book[i].getTitle());

        }
        System.out.println("Enter the ID of the book to check out or X to return:");

        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("X")) {
            return;
        }
        int bookID = Integer.parseInt(input);
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        //Book[bookID - 1].isCheckedOut(name);
        System.out.println("Checked out to the book " + name);

    }

    public static void show_Checked_Out_Books(Scanner scanner) {

        for (int i = 0; i < numOfBook; i++ ) {
            if (!Book[i].isCheckedOut()) ;
            System.out.println(Book[i].getId() + "|" + Book[i].getIsbn() + "| " + Book[i].getTitle());
            }



            System.out.println("C - Check In a book");
            System.out.println("X - Return to Home Screen");

    String input = scanner.nextLine();
    if (input.equalsIgnoreCase("C")) {
        System.out.print("Enter the ID of the book to check in: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        Book[bookId - 1].checkIn();
        System.out.println("Book checked in successfully.");
    }
}

}



