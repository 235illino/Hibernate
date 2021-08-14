package model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    String street;
    int num;

    public Address(String street, int num) {
        this.street = street;
        this.num = num;
    }

    public Address() {

    }
}
