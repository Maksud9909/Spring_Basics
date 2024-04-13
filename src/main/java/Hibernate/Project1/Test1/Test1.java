package Hibernate.Project1.Test1;

import Hibernate.Project1.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).
                buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Alex", "Noskov", "QA", 450);
            session.beginTransaction(); // открываем транзакцию
            session.save(employee);
            session.getTransaction().commit(); // закрываем ее
            System.out.println("Done");
        }
        finally {
            factory.close();
        }

    }
}
