import java.util.*;

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Department {
    ArrayList<Teacher> teachers = new ArrayList<>();
}

class College {
    Department dept = new Department();
}

class Course {
    String name;

    Course(String name) {
        this.name = name;
    }
}

class Student {
    Course course;

    Student(Course course) {
        this.course = course;
    }
}

public class Main {
    public static void main(String[] args) {
        College c = new College();
        Teacher t = new Teacher("Rahul");
        c.dept.teachers.add(t);

        Course course = new Course("Java");
        Student s = new Student(course);

        System.out.println("College has a Department");
        System.out.println("Department has Teacher: " + t.name);
        System.out.println("Student studies: " + s.course.name);
    }
}
