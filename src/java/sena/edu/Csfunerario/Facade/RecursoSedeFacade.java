

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.RecursoSede;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:18 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class RecursoSedeFacade extends AbstractFacade<RecursoSede> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecursoSedeFacade() {
        super(RecursoSede.class);
    }

}
