package SchoolManagementSystem;

import java.util.List;

public class School {
    private List<Teachers> teachers;
    private List<Student> students;
    private static int totalEarned;
    private static int totalSpent;

    public School(List<Teachers> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalEarned=0;
        totalSpent=0;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalEarned() {
        return totalEarned;
    }

    public int getTotalSpent() {
        return totalSpent;
    }

    public void addTeachers(Teachers teacher) {
        teachers.add(teacher);
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public static void updateTotalEarned(int moneyEarned) {
        totalEarned+=moneyEarned;
    }

    public static void updateTotalSpent(int moneySpent) {
        totalEarned-=moneySpent;
    }
}
