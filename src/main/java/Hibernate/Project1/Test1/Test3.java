package Hibernate.Project1.Test1;

import Hibernate.Project1.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).
                buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction(); // открываем транзакцию

            List<Employee> employeeList = session.createQuery("from Employee where name = 'Alex' and salary = 450")
                            .getResultList();
            employeeList.forEach(employee -> System.out.println(employee));


            session.getTransaction().commit(); // закрываем ее
            System.out.println("Done");
        }
        finally {
            factory.close();
        }

    }
}
