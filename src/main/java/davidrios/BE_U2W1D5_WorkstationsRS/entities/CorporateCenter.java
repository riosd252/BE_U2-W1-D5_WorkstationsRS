package davidrios.BE_U2W1D5_WorkstationsRS.entities;

import davidrios.BE_U2W1D5_WorkstationsRS.enums.Cities;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "corporate_centers")
@Setter
@Getter
@NoArgsConstructor
public class CorporateCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    private String name;
    private String address;
    @Enumerated(EnumType.STRING)
    private Cities city;
    @OneToMany(mappedBy = "corporateCenter")
    private List<Workstation> workstations;

    public CorporateCenter(String name, String address, Cities city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }
}
