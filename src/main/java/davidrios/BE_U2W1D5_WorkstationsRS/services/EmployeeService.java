package davidrios.BE_U2W1D5_WorkstationsRS.services;

import davidrios.BE_U2W1D5_WorkstationsRS.entities.CorporateCenter;
import davidrios.BE_U2W1D5_WorkstationsRS.entities.Employee;
import davidrios.BE_U2W1D5_WorkstationsRS.repositories.CorporateCenterDao;
import davidrios.BE_U2W1D5_WorkstationsRS.repositories.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    public Employee findById(long employeeId) throws Exception {
        return employeeDao.findById(employeeId).orElseThrow(Exception::new);
    }
}
