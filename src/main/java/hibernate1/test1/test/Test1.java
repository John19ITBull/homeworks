package hibernate1.test1.test;

import hibernate1.test1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
//            Session session = sessionFactory.getCurrentSession();
//
//            Employee employee = new Employee("Zaur2", "Tregulov", "IT", 500);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println(employee);


            Session session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Employee employee1 = session.get(Employee.class, 1);

            session.getTransaction().commit();
            System.out.println(employee1);

        } finally {
            sessionFactory.close();
        }
    }
}