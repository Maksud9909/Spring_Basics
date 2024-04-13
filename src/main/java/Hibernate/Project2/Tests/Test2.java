package Hibernate.Project2.Tests;

import Hibernate.Project2.Entity.Detail;
import Hibernate.Project2.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Yura","Dud","Blogger",30000);
            Detail detail = new Detail("Finland","340819-45049085","dud5648890@gmail.com");


            session.beginTransaction(); // открываем транзакцию





            Employee detail1 = session.get(Employee.class,3);

            session.delete(detail1);










            System.out.println("Done");
        }
        finally {
            session.getTransaction().commit(); // закрываем ее
            factory.close();
        }

    }
}


//Employee employee = new Employee("Oleg","Salomov","IT",1500);
//            Detail detail = new Detail("Moscow","12359419345","oleg8890@gmail.com");
//            employee.setEmpDetails(detail);