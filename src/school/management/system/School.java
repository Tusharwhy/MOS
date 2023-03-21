package school.management.system;

import java.util.*;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    /**
     * new school object is created
     * @param teachers list of teachers in school
     * @param students list of students in school
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;

        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
    /**
     * this will return list of teachers
     * @return list of teachers
     */
    public List<Teacher> getTeachers() {return this.teachers;}
    /**
     *
     * @param teacher this will add teachers in the school.
     */
    public void addTeacher (Teacher teacher) {
        this.teachers.add(teacher);
    }
    /**
     *
     * @return this will return list of students int the school
     */
    public List<Student> getStudents() {return this.students;}
    /**
     *
     * @param student this will add student in school
     */
    public void addStudent(Student student) {this.students.add(student);}

    /**
     *
     * @return will return total money earned by the school
     */
    public int getTotalMoneyEarned() {return totalMoneyEarned;}

    /**
     *
     * @param MoneyEarned this will add money in total money
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return gives money spent by the school
     */
    public int getTotalMoneySpent() {return totalMoneySpent;}
    /**
     *
     * @param moneySpent money spent by the school. only including salary given to teachers
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
