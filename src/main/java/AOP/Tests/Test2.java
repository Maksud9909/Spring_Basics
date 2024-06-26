package AOP.Tests;

import AOP.Classes.Student;
import AOP.Classes.University;
import AOP.Config.MyConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);


        university.addStudents();

            List<Student>list = university.getStudentList();




        context.close();
    }
}
