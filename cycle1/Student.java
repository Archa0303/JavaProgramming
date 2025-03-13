class Student {
    int studentId;
    String name;
    double marks;

    Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }

    void isPassed() {
        if (this.marks >= 40) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 75);
        Student s2 = new Student(102, "Bob", 35);

        s1.displayDetails();
        s1.isPassed();
        
        s2.displayDetails();
        s2.isPassed();
    }
}
