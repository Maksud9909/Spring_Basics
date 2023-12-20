package AOP.Tests;

import AOP.Classes.University;
import AOP.Config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University
    }
}
