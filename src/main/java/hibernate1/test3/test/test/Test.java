package hibernate1.test3.test.test;

import hibernate1.test3.entity.Department;
import hibernate1.test3.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        try {
//            Session session = factory.getCurrentSession();
//
//            Department hr = new Department("HR", 1500, 400);
//            Employee employee = new Employee("Anna", "Viktorovna", 700);
//            Employee employee1 = new Employee("Olga", "Ivanovna", 590);
//
//            hr.addEmployeeToDepartment(employee);
//            hr.addEmployeeToDepartment(employee1);
//
//            session.beginTransaction();
//
//            session.save(hr);
//
//            session.getTransaction().commit();

            Session session = factory.getCurrentSession();

            session.beginTransaction();

            System.out.println("Get department ..........");
            Department department = session.get(Department.class, 1);
            System.out.println("Get department successful ");

            System.out.println("Get employees from department");
            List<Employee> employees = department.getEmployees();
            System.out.println("Get employees successful ");

            System.out.println("sout employees .........");
            employees.forEach(System.out::println);
            System.out.println("end sout employees .........");

            session.getTransaction().commit();


        } finally {
            factory.close();
        }
    }
}
