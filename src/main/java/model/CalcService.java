package model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CalcService {
    @PersistenceContext
    private EntityManager em;

    public List<?> getAllCities() {
        return em.createNativeQuery("SELECT id, name FROM cities").getResultList();
    }
}
