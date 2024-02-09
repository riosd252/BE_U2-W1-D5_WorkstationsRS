package davidrios.BE_U2W1D5_WorkstationsRS;

import davidrios.BE_U2W1D5_WorkstationsRS.services.CorporateCenterService;
import davidrios.BE_U2W1D5_WorkstationsRS.services.EmployeeService;
import davidrios.BE_U2W1D5_WorkstationsRS.services.ReservationService;
import davidrios.BE_U2W1D5_WorkstationsRS.services.WorkstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    CorporateCenterService corporateCenterService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    ReservationService reservationService;

    @Autowired
    WorkstationService workstationService;

    @Override
    public void run(String... args) throws Exception {

    }
}
