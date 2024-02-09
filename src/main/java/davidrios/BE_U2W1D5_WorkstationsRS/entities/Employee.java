package davidrios.BE_U2W1D5_WorkstationsRS.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
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
    private List<Reservation> reservations;

    public Employee(String fullName, String username, String email) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
    }
}
