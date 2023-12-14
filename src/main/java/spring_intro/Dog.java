package spring_intro;

import org.springframework.stereotype.Component;

//@Component("dogBean")
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog bean created");
    }


    @Override
    public void say(){
        System.out.println("Bow-Wow");

    }
    public void init(){
        System.out.println("Class Dog: Init method");
    }

    public void destroy(){
        System.out.println("Class Dog: Destroy Method");
    }

}


interface Pet {
     void say();
}
