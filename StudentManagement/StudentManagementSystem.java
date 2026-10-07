package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add student
    public static void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student student =
                new Student(id, name, age, course, marks);

        students.add(student);

        System.out.println("Student added successfully!");
    }

    // Display all students
    public static void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayDetails();
        }
    }

    // Search student
    public static void searchStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (Student student : students) {

            if (student.getStudentId() == id) {
                student.displayDetails();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Update student
    public static void updateStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student student : students) {

            if (student.getStudentId() == id) {

                System.out.print("Enter new course: ");
                String course = sc.nextLine();

                System.out.print("Enter new marks: ");
                double marks = sc.nextDouble();

                student.setCourse(course);
                student.setMarks(marks);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete student
    public static void deleteStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (Student student : students) {

            if (student.getStudentId() == id) {

                students.remove(student);

                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Main method
    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}