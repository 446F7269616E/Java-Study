package app;

import school.Student;
import school.StudentManager;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 92),
            new Student("Bob", 73),
            new Student("Jack", 48),
            new Student("Tom", 85)
        };

        StudentManager manager = new StudentManager();
        manager.printReport(students);
    }
}
