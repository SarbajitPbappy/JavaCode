import java.util.ArrayList;
import java.util.List;

class Person {
    public String name;
    public String phone;

    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone: " + this.phone);
    }
}

class Book {
    public int noOfBook;
    public String nameOfBook;

    Book(int noOfBook, String nameOfBook) {
        this.noOfBook = noOfBook;
        this.nameOfBook = nameOfBook;
    }

    public void display() {
        System.out.println("Number Of Book: " + this.noOfBook);
        System.out.println("Name: " + this.nameOfBook);
    }

}

public class Student_One extends Person {
    public int stdID;
    public double cgpa;
    public List<Book> books;

    Student_One(String name, String phone, List<Book> books, int stdID, double cgpa) {
        super(name, phone);
        this.books = new ArrayList<>(books);
        this.stdID = stdID;
        this.cgpa = cgpa;
    }

    public void display() {
        super.display();
        System.out.println("Student ID: " + stdID);
        System.out.println("CGPA: " + cgpa);

        System.out.println("Books:");
        for (Book book : books) {
            book.display();
        }
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Java Programming"));

        Student_One student = new Student_One("John Doe", "123-456-7890", books, 1, 3.8);

        student.display();
    }
}
