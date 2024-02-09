package davidrios.BE_U2W1D5_WorkstationsRS.services;

import davidrios.BE_U2W1D5_WorkstationsRS.entities.Employee;
import davidrios.BE_U2W1D5_WorkstationsRS.entities.Reservation;
import davidrios.BE_U2W1D5_WorkstationsRS.repositories.EmployeeDao;
import davidrios.BE_U2W1D5_WorkstationsRS.repositories.ReservationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private ReservationDao reservationDao;

    public void save(Reservation reservation) {
        reservationDao.save(reservation);
    }

    public Reservation findById(long reservationId) throws Exception {
        return reservationDao.findById(reservationId).orElseThrow(Exception::new);
    }
}
