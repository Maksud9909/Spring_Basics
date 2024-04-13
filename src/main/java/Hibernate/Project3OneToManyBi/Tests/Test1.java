package Hibernate.Project3OneToManyBi.Tests;



import Hibernate.Project3OneToManyBi.Entity.Department;
import Hibernate.Project3OneToManyBi.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Hibernate.Project3OneToManyBi.Entity.Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            Department department = new Department("IT",400,1000);
            Employee employee1 = new Employee("Maksud","Rustamov",800);
            Employee employee2 = new Employee("Ricardo","Mils",780);
            Employee employee3 = new Employee("Oleg","Antonov",923);
            employee1.setDepartment(department);
            employee2.setDepartment(department);
            employee3.setDepartment(department);
            department.addEmployeesToDepartments(employee1);
            department.addEmployeesToDepartments(employee2);
            department.addEmployeesToDepartments(employee3);







            session.beginTransaction(); // открываем транзакцию


            Department department1 = session.get(Department.class,3);
            session.delete(department1);











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