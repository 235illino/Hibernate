package main.hibernate_sql;

import model.Address;
import model.Days;
import model.User;
import model.User2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Date;

public class App {

    public static void main(String[] args) {


        User2 user2 = new User2();
        user2.setName("Bolt");
        user2.setDays(Days.MONDAY);
        user2.setAdress(new Address("Gavela", 28));


       // user2.setDate(new Date());



        Session session;
        try (StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
             SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory()) {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(user2);
            //User2 userLoad2 = session.load(User2.class, 1);
           // User2 userGet2 = session.get(User2.class, 1);

           // System.out.println(userLoad2.getIdPlusAge());
            session.getTransaction().commit();
        }


    }
}
