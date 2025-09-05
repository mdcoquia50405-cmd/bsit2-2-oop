import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== Library Management System ===");

        do {
            manager.showBooks();

            System.out.println("Choose an option:");
            System.out.println("1. Show Books");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        manager.showBooks();
                        break;
                    case 2:
                        manager.addBook();
                        break;
                    case 3:
                        manager.removeBook();
                        break;
                    case 4:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter 1-4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number!");
                choice = 0;
            }

        } while (choice != 4);

        System.out.println("Program completed successfully.");
    }
}
