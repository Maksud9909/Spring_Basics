package spring_intro.Tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_intro.Classes.Cat;
import spring_intro.Classes.Person;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person = context.getBean("myPerson",Person.class);
        Cat pet  = context.getBean("myPet",Cat.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        System.out.println("------");




        context.close();
    }
}
