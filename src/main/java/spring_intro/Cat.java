package spring_intro;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{


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

    public void destroy(){
        System.out.println("Class Cat: Destroy Method");
    }
}
