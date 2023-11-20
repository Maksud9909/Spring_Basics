package spring_intro;

public class Person {
    private Pet pet;

    public Person() {
    }

    public Person(Pet pet) {
        System.out.println("Person bean created");
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my Pet");
        pet.say();
    }
}
