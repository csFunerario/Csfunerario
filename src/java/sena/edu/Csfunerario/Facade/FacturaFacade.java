

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.Factura;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:13 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class FacturaFacade extends AbstractFacade<Factura> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacturaFacade() {
        super(Factura.class);
    }

}
