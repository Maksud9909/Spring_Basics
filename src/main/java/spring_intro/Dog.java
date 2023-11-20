package spring_intro;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog bean created");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");

    }
}

interface Pet {
     void say();
}
