package training.afpa.cda24060.apidemo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="user")
public class Person {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="lastname")
    private String lastname;

    @Column(name="firstname")
    private String firstname;
}
