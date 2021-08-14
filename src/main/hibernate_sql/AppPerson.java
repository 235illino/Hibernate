package main.hibernate_sql;

import main.person.HomeAddress;
import main.person.Person;
import model.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AppPerson {

    public static void main(String[] args) {
        HomeAddress gavela = new HomeAddress(1, "Gavela");
        Person person = new Person();
        person.setName("Illia");
        person.setAddress(gavela);

        Session session = null;
        try (StandardServiceRegistry build = new StandardServiceRegistryBuilder().configure().build();
             SessionFactory sessionFactory = new MetadataSources(build).buildMetadata().buildSessionFactory()) {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(gavela);
            session.save(person);

            session.getTransaction().commit();
        }


    }

}
