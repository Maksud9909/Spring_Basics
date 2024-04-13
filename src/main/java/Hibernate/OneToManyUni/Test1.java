package Hibernate.OneToManyUni;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee employee1 = new Employee("Maksud","Rustamov",1800);
            Employee employee2 = new Employee("Oleg","Sankov",2000);
            Employee employee3 = new Employee("Sergey","Rahmonov",3000);
            Department department = new Department("Sales",400,3000);
//            department.addEmployeesToDepartments(employee1);
            department.addEmployeesToDepartments(employee2);
            department.addEmployeesToDepartments(employee3);




            session.beginTransaction(); // открываем транзакцию




            List<Department> departmentList = session.createQuery("from Department").getResultList();
            System.out.println(departmentList);
//            departmentList.forEach(department1 -> System.out.println(department1.getEmps()));










            System.out.println("Done");
        }
        finally {
            session.getTransaction().commit(); // закрываем ее
            factory.close();
        }

    }
}
