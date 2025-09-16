package ObjectModelling;

import java.util.*;


class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " has students:");
        for (Student s : enrolledStudents) {
            System.out.println("  " + s.getName());
        }
    }
}


class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); 
    }

    public void showCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("  " + c.getCourseName());
        }
    }
}


class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s); 
    }

    public void showStudents() {
        System.out.println("School: " + schoolName + " has students:");
        for (Student s : students) {
            System.out.println("  " + s.getName());
        }
    }
}


public class AssociationAggregationDemo {
    public static void main(String[] args) {
   
        School school = new School("Green Valley School");

  
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        school.addStudent(s1);
        school.addStudent(s2);

    
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

   
        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s2.enrollInCourse(c1);

  
        school.showStudents();

      
        s1.showCourses();
        s2.showCourses();

  
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}