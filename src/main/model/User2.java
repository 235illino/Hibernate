package model;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity(name = "User_Shmuser")
public class User2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    // @Basic(optional = false, fetch = FetchType.LAZY)
    @Column(name = "StudName", unique = true, nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private Days days;
    // @Temporal(TemporalType.DATE)
    // @CreationTimestamp
    @UpdateTimestamp
    private Date date;

    private final int age = 20;

    @Formula("id + age")
    private int idPlusAge;
    @Embedded
    private Address address;

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address address) {
        this.address = address;
    }

    public int getIdPlusAge() {
        return idPlusAge;
    }

    public void setIdPlusAge(int idPlusAge) {
        this.idPlusAge = idPlusAge;
    }

    public Days getDays() {
        return days;
    }

    public void setDays(Days days) {
        this.days = days;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", days=" + days +
                ", date=" + date +
                '}';
    }
}
