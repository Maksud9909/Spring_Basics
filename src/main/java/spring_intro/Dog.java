package spring_intro;

public class Dog implements Pet{
    @Override
    public void say(){
        System.out.println("Bow-Wow");

    }
}

interface Pet {
     void say();
}
