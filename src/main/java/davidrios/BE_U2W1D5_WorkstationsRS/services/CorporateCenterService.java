package davidrios.BE_U2W1D5_WorkstationsRS.services;

import davidrios.BE_U2W1D5_WorkstationsRS.entities.CorporateCenter;
import davidrios.BE_U2W1D5_WorkstationsRS.repositories.CorporateCenterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CorporateCenterService {
    @Autowired
    private CorporateCenterDao corporateCenterDao;

    public void save(CorporateCenter corporateCenter) {
        corporateCenterDao.save(corporateCenter);
    }

    public CorporateCenter findById(long ccId) throws Exception {
        return corporateCenterDao.findById(ccId).orElseThrow(Exception::new);
    }
}
