package training.afpa.cda24060.apidemo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.sql.Date;
import java.time.LocalDate;

@Data
@Entity
@Table(name="user")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="lastname")
    private String lastName;

    @Column(name="firstname")
    private String firstName;

    @Column(name="birthdate")
    private LocalDate birthDate;

}
