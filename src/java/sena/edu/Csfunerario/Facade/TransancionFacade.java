

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.Transancion;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:24 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class TransancionFacade extends AbstractFacade<Transancion> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransancionFacade() {
        super(Transancion.class);
    }

}
