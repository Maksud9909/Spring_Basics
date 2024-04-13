package Hibernate.Project1.Test1;

import Hibernate.Project1.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).
                buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction(); // открываем транзакцию


            session.createQuery("update Employee set salary = 3000").executeUpdate();

            List<Employee> empQA = session.createQuery("from Employee").getResultList();
            System.out.println(empQA);

            session.getTransaction().commit(); // закрываем ее
            System.out.println("Done");
        }
        finally {
            factory.close();
        }

    }
}
