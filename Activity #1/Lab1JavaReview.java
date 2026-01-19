import java.util.Scanner;

public class LibrarySystem {
    static final int MAX_BOOKS = 5;

    // Arrays para sa mga books
    static String[] titles = new String[MAX_BOOKS];
    static String[] status = new String[MAX_BOOKS];
    static int count = 0; // number of books stored

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // main menu
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book Status");
            System.out.println("3. Show All Books");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    updateBookStatus(sc);
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    generateReport();
                    break;
                case 5:
                    System.out.println("===Exiting system... Goodbye!===");
                    break;
                default:
                    System.out.println("===Invalid choice. Try again.===");
            }
        } while (choice != 5);

        sc.close();
    }

    // 2. Add Book
    public static void addBook(Scanner sc) {
        if (count >= MAX_BOOKS) {
            System.out.println("Book limit reached. Cannot add more.");
            return;
        }
        System.out.print("===Add Book===");
        System.out.print("\nEnter book title: ");
        String title = sc.nextLine();

        titles[count] = title;
        status[count] = "Available"; // default status
        count++;

        System.out.println("===Book added successfully!===");
    }

    // 3. Update Book Status
    public static void updateBookStatus(Scanner sc) {
        if (count == 0) {
            System.out.println("No books to update.");
            return;
        }

        showBooks();
        System.out.print("Enter book number to update: ");
        int num = sc.nextInt();

        if (num < 1 || num > count) {
            System.out.println("Invalid book number!");
            return;
        }

        int index = num - 1; 
        if (status[index].equals("Available")) {
            status[index] = "Borrowed";
        } else {
            status[index] = "Available";
        }

        System.out.println("===Book status updated.===");
    }

    // 4. Show All Books
    public static void showBooks() {
        if (count == 0) {
            System.out.println("No books in the system.");
            return;
        }

        System.out.println("\n--- Book List ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + titles[i] + " - " + status[i]);
        }
    }

    // 5. Generate Report
    public static void generateReport() {
        System.out.println("\n--- Library Report ---");
        System.out.println("Total books: " + count);

        int available = 0;
        int borrowed = 0;

        for (int i = 0; i < count; i++) {
            if (status[i].equals("Available")) {
                available++;
            } else {
                borrowed++;
            }
        }

        System.out.println("Available books: " + available);
        System.out.println("Borrowed books: " + borrowed);
    }
