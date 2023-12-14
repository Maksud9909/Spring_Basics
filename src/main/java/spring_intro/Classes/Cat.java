package spring_intro.Classes;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("catBean")
public class Cat implements Pet {

    @PostConstruct
    public void init(){
        System.out.println("Class Cat: Init method");
    }

    public Cat() {
        System.out.println("Cat bean created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Cat: Destroy Method");
    }
}
