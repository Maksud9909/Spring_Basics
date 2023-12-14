package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
