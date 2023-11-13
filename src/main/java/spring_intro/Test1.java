package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("MyPet",Pet.class);
        pet.say();
        context.close();
        System.out.println("Hello world");
    }
}

