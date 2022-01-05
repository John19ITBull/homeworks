package hibernate1.test2.test;

import hibernate1.test2.entity.Details;
import hibernate1.test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            Details employee1Details = new Details("Grodno", "999999",
                    "vika@gmail.com");
            Employee employee1 = new Employee("Vika", "Sidorova",
                    "Sales", 600, employee1Details);

            session.beginTransaction();

            session.save(employee1);
            Employee employee = session.get(Employee.class, 4);
            session.delete(employee);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
