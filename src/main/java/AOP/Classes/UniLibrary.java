package AOP.Classes;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getBook(){
        System.out.println("We take a book from UniLibrary ");
        System.out.println("---------------------------");
    }

    public void getMagazine() {
        System.out.println("We take a magazine from UniLibrary");
        System.out.println("---------------------------");
    }
    public void returnMagazine() {
        System.out.println("We take a magazine from UniLibrary");
        System.out.println("---------------------------");
    }

    public void returnBook() {
        System.out.println("We return a book to UniLibrary");
        System.out.println("---------------------------");
    }

    public void addBook(String person_name,Book book){
        System.out.println("We add book to UniLibrary");
    }
    public void addMagazine(){
        System.out.println("We add book to Magazine");
        System.out.println("---------------------------");

    }

}
