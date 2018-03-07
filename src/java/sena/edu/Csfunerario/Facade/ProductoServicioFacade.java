

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.ProductoServicio;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:16 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class ProductoServicioFacade extends AbstractFacade<ProductoServicio> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoServicioFacade() {
        super(ProductoServicio.class);
    }

}
