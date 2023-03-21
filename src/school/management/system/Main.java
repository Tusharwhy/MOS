package school.management.system;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Teacher akash = new Teacher(1,"Akash",1000);
        Teacher swatti = new Teacher(2,"Swatti",1200);


        List<Teacher> teacherList =new ArrayList<>();
        teacherList.add(akash);
        teacherList.add(swatti);

        Student ram = new Student(1,"Ram",5);
        Student rabbita = new Student(2,"Rabbita",9);


        List<Student> studentList = new ArrayList<>();
        studentList.add(ram);
        studentList.add(rabbita);


        School MOS = new School(teacherList,studentList);
        System.out.println("My Own School earned: "+MOS.getTotalMoneyEarned());


        ram.payfees(5000);
        akash.recieveSalary(akash.getSalary());
        System.out.println("My Own School earned: "+MOS.getTotalMoneyEarned());





    }
}
