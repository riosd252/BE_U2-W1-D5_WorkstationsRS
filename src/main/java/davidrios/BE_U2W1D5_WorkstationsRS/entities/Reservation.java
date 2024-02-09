package davidrios.BE_U2W1D5_WorkstationsRS.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    private LocalDate date;
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "workstation_id")
    private Workstation workstation;

    public Reservation(LocalDate date, Employee employee, Workstation workstation) {
        this.date = date;
        this.employee = employee;
        this.workstation = workstation;
    }
}
