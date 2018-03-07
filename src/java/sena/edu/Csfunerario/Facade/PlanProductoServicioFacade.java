

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.PlanProductoServicio;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:15 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class PlanProductoServicioFacade extends AbstractFacade<PlanProductoServicio> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlanProductoServicioFacade() {
        super(PlanProductoServicio.class);
    }

}
