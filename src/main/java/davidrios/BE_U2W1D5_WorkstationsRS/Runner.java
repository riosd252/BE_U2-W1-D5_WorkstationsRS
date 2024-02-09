package davidrios.BE_U2W1D5_WorkstationsRS;

import davidrios.BE_U2W1D5_WorkstationsRS.entities.CorporateCenter;
import davidrios.BE_U2W1D5_WorkstationsRS.entities.Workstation;
import davidrios.BE_U2W1D5_WorkstationsRS.services.CorporateCenterService;
import davidrios.BE_U2W1D5_WorkstationsRS.services.EmployeeService;
import davidrios.BE_U2W1D5_WorkstationsRS.services.ReservationService;
import davidrios.BE_U2W1D5_WorkstationsRS.services.WorkstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Runner.class);

        CorporateCenter rome = (CorporateCenter) ctx.getBean("romeCenter");
        CorporateCenter milan = (CorporateCenter) ctx.getBean("milanCenter");
        CorporateCenter barcelona = (CorporateCenter) ctx.getBean("barcelonaCenter");
        CorporateCenter berlin = (CorporateCenter) ctx.getBean("berlinCenter");
        CorporateCenter oslo = (CorporateCenter) ctx.getBean("osloCenter");
        CorporateCenter stockholm = (CorporateCenter) ctx.getBean("stockholmCenter");

        corporateCenterService.save(rome);
        corporateCenterService.save(milan);
        corporateCenterService.save(barcelona);
        corporateCenterService.save(berlin);
        corporateCenterService.save(oslo);
        corporateCenterService.save(stockholm);

       /* workstationService.save((Workstation) ctx.getBean("romeWorkstation"));
        workstationService.save((Workstation) ctx.getBean("milanWorkstation"));
        workstationService.save((Workstation) ctx.getBean("barcelonaWorkstation"));
        workstationService.save((Workstation) ctx.getBean("berlinWorkstation"));
        workstationService.save((Workstation) ctx.getBean("osloWorkstation"));
        workstationService.save((Workstation) ctx.getBean("stockholmWorkstation")); */

    }
}
