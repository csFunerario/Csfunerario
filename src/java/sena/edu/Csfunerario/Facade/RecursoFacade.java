

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.Recurso;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:17 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class RecursoFacade extends AbstractFacade<Recurso> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecursoFacade() {
        super(Recurso.class);
    }

}
