class Person {
    public String name;
    public String phone;
    public Address address;

    Person() {

    }

    Person(String name, String phone, Address address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone: " + this.phone);
        System.out.println("Address: " + this.address);
    }
}

class Address {
    public String street;
    public String city;
    public double zipCode;

    Address(String street, String city, double zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

}

public class Student extends Person {
    public int id;
    public String dept;
    public double cgpa;
    public Address address;

    Student(String name, String phone, int id, String dept, double cgpa, Address address) {
        super(name, phone, address);
        this.id = id;
        this.dept = dept;
        this.cgpa = cgpa;
    }
    public void display(){
        super.display();
        System.out.println("ID: "+this.id);
        System.out.println("Department: "+this.dept);
        System.out.println("Result: "+this.cgpa);
    }

    public static void main(String[] args) {
        Address address = new Address("123 Main Street", "Anytown", 12345);
        Student student = new Student("John Doe", "123-456-7890", 1, "CS", 3.8, address);

        System.out.println("Student information:");
        student.display();
    }
}