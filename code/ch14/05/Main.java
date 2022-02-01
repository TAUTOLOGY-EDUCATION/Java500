class Book {
    String bookName, bookStatus;

    public Book(String bookName, String bookStatus) {
        this.bookName = bookName;
        this.bookStatus = bookStatus;
    }

    public Book(String bookName) {
        this.bookName = bookName;
        this.bookStatus = "available";
    }

    public void borrowBook() {
        if (this.bookStatus.equals("available")) {
            System.out.println("borrow successfully");
            this.bookStatus = "unavailable";
        }
        else {
            System.out.println("borrow unsuccessfully");
        }
    }

    public void returnBook() {
        if (this.bookStatus.equals("unavailable")) {
            System.out.println("return successfully");
            this.bookStatus = "available";
        }
        else {
            System.out.println("return unsuccessfully");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Book Book_A = new Book("AI Superpowers");
        System.out.println("Book status : " + Book_A.bookStatus);
        Book_A.borrowBook();
        System.out.println("Book status : " + Book_A.bookStatus);
        Book_A.returnBook();
        System.out.println("Book status : " + Book_A.bookStatus);
    }
}