package Hibernate.Project1.Test1;

import Hibernate.Project1.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).
                buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Gulchexra", "Tursunova", "Design", 900);
            session.beginTransaction(); // открываем транзакцию
            session.save(employee);


            int id = employee.getId();

            Employee employeeFromDB = session.get(Employee.class,id);
            System.out.println(employeeFromDB);
            session.getTransaction().commit(); // закрываем ее

            System.out.println("Done");
        }
        finally {
            factory.close();
        }

    }
}
