package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.clear();
        students.add(new Student(1, "Amina", 3.6));
        students.add(new Student(2, "Daniyar", 1.7)); // will be removed
        students.add(new Student(3, "Alina", 2.9));
        students.add(new Student(4, "Timur", 4.0));
        students.add(new Student(5, "Nursultan", 1.9)); // will be removed
    }

    public void removeLowGPA() {
        students.removeIf(s -> s.getGpa() < 2.0);
        System.out.println("Removed students with GPA < 2.0");
    }

    public void findHighestGPA() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        Student best = students.get(0);
        for (Student s : students) {
            if (s.getGpa() > best.getGpa()) best = s;
        }
        System.out.println("Highest GPA student: " + best);
    }

    public void insertAtIndex() {
        Student newStudent = new Student(99, "New Student", 3.2);

        // index 2 is the 3rd position (0,1,2)
        if (students.size() >= 2) {
            students.add(2, newStudent);
            System.out.println("Inserted at index 2: " + newStudent);
        } else {
            students.add(newStudent);
            System.out.println("List too small, added to end: " + newStudent);
        }
    }

    public void printStudents() {
        System.out.println("=== Students ===");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}