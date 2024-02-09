package davidrios.BE_U2W1D5_WorkstationsRS.entities;

import davidrios.BE_U2W1D5_WorkstationsRS.enums.WorkstationType;
import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Table(name = "workstations")
@Getter
@Setter
@NoArgsConstructor
public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    private String description;
    @Enumerated(EnumType.STRING)
    private WorkstationType type;
    private int maxOccupants;
    @ManyToOne
    @JoinColumn(name = "corporate_center_id")
    private CorporateCenter corporateCenter;
    @OneToMany(mappedBy = "workstation")
    private List<Reservation> reservations;

    public Workstation(String description, WorkstationType type, int maxOccupants, CorporateCenter corporateCenter) {
        this.description = description;
        this.type = type;
        this.maxOccupants = maxOccupants;
        this.corporateCenter = corporateCenter;
    }
}
