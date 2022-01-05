package hibernate1.test1.test;

import hibernate1.test1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//            List<Employee> employees = session.createQuery("from Employee", Employee.class)
//                    .getResultList();
//
//            session.getTransaction().commit();
//            System.out.println(employees);


//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            List<Employee> employees = session.createQuery("from Employee where name = 'Zaur2'", Employee.class)
//                    .getResultList();
//
//            session.getTransaction().commit();
//            System.out.println(employees);
//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            session.createQuery("update Employee set salary = 1000 " + "where name = 'Zaur2'").executeUpdate();
//            session.getTransaction().commit();

            Session session = factory.getCurrentSession();

            session.beginTransaction();
            session.createQuery("delete Employee " + "where name = 'Oleg'").executeUpdate();
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
