public class MyBookList {
    public static void main(String[] args) {
        Book bk1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book bk2 = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book bk3 = new Book("Atomic Habits", "James Clear", 2018);
        Book bk4 = new Book("Java Programming", "John Doe", 2020);
        Book bk5 = new Book("Harry Potter", "J.K. Rowling", 1997);
        
        bk1.details();
        bk2.details();
        bk3.details();
        bk4.details();
        bk5.details();
        
        bk1.changePage(50);
        bk3.changePage(100);
        bk5.changePage(27);
        
        bk4.changeAuthor("Jane Smith");
        
        System.out.println("After changing pages: ");
        bk1.details();
        bk3.details();
        bk4.details();
        
        System.out.println("After Changing Author: ");
        bk4.details();
        
        Book[] books = {bk1, bk2, bk3, bk4, bk5};
        System.out.println("Books published after 2010: ");
        for (Book book : books) {  
            if (book.getPublishDate() > 2010) {
                System.out.println(book.getTitle());
            }
        }
    }
}