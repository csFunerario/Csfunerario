

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.RecursoReservaServicio;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:18 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class RecursoReservaServicioFacade extends AbstractFacade<RecursoReservaServicio> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecursoReservaServicioFacade() {
        super(RecursoReservaServicio.class);
    }

}
