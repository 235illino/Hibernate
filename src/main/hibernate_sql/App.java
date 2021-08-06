
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class App {

    public static void main(String[] args) {


        User user = new User();
        user.setName("VADIK");
        user.setEmail("barsick@");
        user.setId(4);

        Session session;
        try (StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
             SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory()) {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }


    }
}
