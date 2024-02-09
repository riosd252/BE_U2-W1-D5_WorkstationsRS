package davidrios.BE_U2W1D5_WorkstationsRS.services;

import davidrios.BE_U2W1D5_WorkstationsRS.entities.Employee;
import davidrios.BE_U2W1D5_WorkstationsRS.entities.Workstation;
import davidrios.BE_U2W1D5_WorkstationsRS.repositories.EmployeeDao;
import davidrios.BE_U2W1D5_WorkstationsRS.repositories.WorkStationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkstationService {
    @Autowired
    private WorkStationDao workStationDao;

    public void save(Workstation workstation) {
        workStationDao.save(workstation);
    }

    public Workstation findById(long workstationId) throws Exception {
        return workStationDao.findById(workstationId).orElseThrow(Exception::new);
    }
}
