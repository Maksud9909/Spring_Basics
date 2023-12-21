package AOP.Tests;


import AOP.Classes.UniLibrary;

import AOP.Config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary",UniLibrary.class);
        uniLibrary.returnBook();


        context.close();
        System.out.println("Method main ends");
    }
}
