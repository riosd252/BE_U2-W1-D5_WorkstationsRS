package davidrios.BE_U2W1D5_WorkstationsRS.entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    private String fullName;
    private String username;
    private String email;
    @OneToMany(mappedBy = "employee")
    private List<Reservation> reservations;

    public Employee(String fullName, String username, String email) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
    }
}
