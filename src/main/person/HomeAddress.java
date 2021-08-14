package main.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "address")
public class HomeAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String street;



    public HomeAddress(int id, String street) {
        this.id = id;
        this.street = street;
    }

    public HomeAddress() {

    }
}
