package StudentManagement;

class Student extends Person {

    private int studentId;
    private String course;
    private double marks;

    // Constructor
    public Student(int studentId, String name, int age,
                   String course, double marks) {

        super(name, age);

        this.studentId = studentId;
        this.course = course;
        this.marks = marks;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    // Setters
    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Calculate grade
    public String getGrade() {

        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    // Pass/Fail
    public String getStatus() {

        if (marks >= 40) {
            return "PASS";
        }

        return "FAIL";
    }

    // Polymorphism
    @Override
    public void displayDetails() {

        System.out.println("----------------------------");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + getName());
        System.out.println("Age        : " + getAge());
        System.out.println("Course     : " + course);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + getGrade());
        System.out.println("Status     : " + getStatus());
    }
}