package AOP.Classes;

import org.springframework.stereotype.Component;

@Component("beanSchoolLibrary")
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take a book from SchoolLibrary");
    }
    public void getJournal(){
        System.out.println("We take a journal from SchoolLibrary");
    }

    @Override
    public void returnMaterial() {
        System.out.println("We return a material to SchoolLibrary");
    }


}
