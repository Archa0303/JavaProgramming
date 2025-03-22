class Person {
    String name, gender, address;
    int age;
    
    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String companyName, qualification;
    double salary;
    
    Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject, department;
    int teacherId;
    
    Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void display() {
        System.out.println("Name: " + name + ", Gender: " + gender + ", Address: " + address + ", Age: " + age);
        System.out.println("EmpId: " + empId + ", Company: " + companyName + ", Qualification: " + qualification + ", Salary: " + salary);
        System.out.println("Subject: " + subject + ", Department: " + department + ", TeacherId: " + teacherId);
        System.out.println();
    }
}

class TeacherArray {
    public static void main(String[] args) {
        Teacher[] teachers = {
            new Teacher("Alice", "Female", "Kollam", 28, 101, "ABC School", "MCA", 50000, "Java", "Computer Applcation", 201),
            new Teacher("Bob", "Male", "Kochi", 40, 102, "XYZ School", "PhD", 60000, "Physics", "Science", 202)
        };

        for (int i = 0; i < teachers.length; i++) {
            teachers[i].display();
        }
    }
}

