package spring_intro;

public class Person {
    private Pet pet;

    private String surname;
    private int age;

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
