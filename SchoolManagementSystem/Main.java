package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teachers lizzy=new Teachers(1,"Lizzy",2000);
        Teachers Melissa=new Teachers(2,"Melissa",3000);
        Teachers Ann=new Teachers(3,"Ann",4000);

        Student Thisal=new Student(22,"Thisal",3);
        Student Supun=new Student(25,"Supun",3);
        Student Nikini=new Student(29,"Nikini",3);

        List<Teachers> teachersList = new ArrayList<>();
        teachersList.add(lizzy);
        teachersList.add(Melissa);
        teachersList.add(Ann);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Thisal);
        studentList.add(Supun);
        studentList.add(Nikini);

        School UOK=new School(teachersList,studentList);

        Thisal.updateFeesPaid(3000);
        System.out.println("UOK has Earned $"+UOK.getTotalEarned());

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("Paid Salary to "+lizzy.getName()+" and has a balance of $"+UOK.getTotalEarned());


    }
}
