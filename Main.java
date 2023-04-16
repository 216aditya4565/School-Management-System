package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aditya on 4/16/2023.
 */
public class Main {
    public static void main(String[] args) {
        Teacher mubarak = new Teacher(1,"Mubarak's",500);
        Teacher yogesh = new Teacher(2,"Yogesh's",700);
        Teacher gita = new Teacher(3,"Gita's",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(mubarak);
        teacherList.add(yogesh);
        teacherList.add(gita);


        Student tamasha = new Student(1,"Aryan",4);
        Student aditya = new Student(2,"Aditya Pawar",12);
        Student rabbi = new Student(3,"",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(aditya);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        tamasha.payFees(5000);
        aditya.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        mubarak.receiveSalary(mubarak.getSalary());
        System.out.println("GHS has spent for salary to " + mubarak.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());

        gita.receiveSalary(gita.getSalary());
        System.out.println("GHS has spent for salary to " + gita.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(aditya);

        yogesh.receiveSalary(yogesh.getSalary());

        System.out.println(yogesh);


    }
}