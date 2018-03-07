

package sena.edu.Csfunerario.Facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.edu.Csfunerario.Entity.ProductoServicioFactura;

/**
 * Fecha: 20/02/2018
 * Hora:  11:48:17 AM    
 * Autor: Janel Gongora
 */
@Stateless
public class ProductoServicioFacturaFacade extends AbstractFacade<ProductoServicioFactura> {

    @PersistenceContext(unitName = "CsfunerarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoServicioFacturaFacade() {
        super(ProductoServicioFactura.class);
    }

}
