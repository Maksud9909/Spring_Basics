package AOP.Classes;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook(String book){
        System.out.println("We take a book from UniLibrary " + book);
    }

    public void getJournal() {
        System.out.println("We take a journal from UniLibrary");
    }

    public void returnMaterial() {
        System.out.println("We return a material to UniLibrary");
    }

}
