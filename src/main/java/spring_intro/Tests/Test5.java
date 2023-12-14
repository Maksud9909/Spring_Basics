package spring_intro.Tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_intro.Classes.Person;
import spring_intro.MyConfig.MyConfig;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
