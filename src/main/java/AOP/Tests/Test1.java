package AOP.Tests;


import AOP.Classes.Book;
import AOP.Classes.SchoolLibrary;
import AOP.Classes.UniLibrary;
import AOP.Config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book",Book.class);
        uniLibrary.addBook("Maksud",book);















        context.close();
    }
}
