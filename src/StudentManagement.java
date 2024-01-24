import java.util.Scanner;

class Student {
    private String name;
    private String address;
    private String course;

    // Constructor
    public Student(String name, String address, String course) {
        this.name = name;
        this.address = address;
        this.course = course;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store student objects
        Student[] students = new Student[3];

        // Input student information
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Course: ");
            String course = scanner.nextLine();

            // Create a new student object
            students[i] = new Student(name, address, course);
            System.out.println();
        }

        // Display student information
        System.out.println("Student Information:");
        for (Student student : students) {
            student.displayInfo();
        }

        scanner.close();
    }
}
