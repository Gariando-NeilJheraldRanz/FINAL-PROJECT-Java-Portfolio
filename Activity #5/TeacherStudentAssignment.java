public class TeacherStudentAssignment {
    public static void main(String[] args) {

        Student student1 = new Student("Neil Gariando", 19, "Male", 124);
        Course c1 = new Course("DCIT50A", "Object Oriented Programming");
        Course c2 = new Course("COSC55A", "Discrete Structures 2");

        Course[] coursesForTeacher1 = { c1, c2 };

        Teacher teacher1 = new Teacher("Mr. Pamatian", 19, "Male", "DCS", coursesForTeacher1);

        System.out.println("======STUDENT INFORMATION======");
        student1.displayStudent();
        System.out.println("======TEACHER INFORMATION======");
        teacher1.displayTeacher();
        System.out.println("===============================");
        c1.displayCourse();
    }
}

class Person {
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
    int studentId;

    Student(String name, int age, String gender, int studentId) {
        super(name, age, gender);
        this.studentId = studentId;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Student ID: " + studentId);
    }
}

class Course {
    String courseCode;
    String courseName;

    Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
    }
}

class Teacher extends Person {
    String department;
    Course[] courses;

    Teacher(String name, int age, String gender, String department, Course[] courses) {
        super(name, age, gender);
        this.department = department;
        this.courses = courses;
    }

    void displayTeacher() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Courses Handled:");

        if (courses != null && courses.length > 0) {
            for (Course course : courses) {
                course.displayCourse();
                System.out.println("----------------");
            }
        } else {
            System.out.println("No courses assigned.");
        }
    }
