

package sena.edu.Csfunerario.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Fecha: 20/02/2018
 * Hora:  11:47:12 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "productoservicios_facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductoServicioFactura.findAll", query = "SELECT p FROM ProductoServicioFactura p")
    , @NamedQuery(name = "ProductoServicioFactura.findByIdProductoServicioFactura", query = "SELECT p FROM ProductoServicioFactura p WHERE p.idProductoServicioFactura = :idProductoServicioFactura")})
public class ProductoServicioFactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProductoServicio_Factura")
    private Integer idProductoServicioFactura;
    @JoinColumn(name = "idFactura", referencedColumnName = "idFactura")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Factura idFactura;
    @JoinColumn(name = "idProductoServicio", referencedColumnName = "idProductoServicio")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ProductoServicio idProductoServicio;

    public ProductoServicioFactura() {
    }

    public ProductoServicioFactura(Integer idProductoServicioFactura) {
        this.idProductoServicioFactura = idProductoServicioFactura;
    }

    public Integer getIdProductoServicioFactura() {
        return idProductoServicioFactura;
    }

    public void setIdProductoServicioFactura(Integer idProductoServicioFactura) {
        this.idProductoServicioFactura = idProductoServicioFactura;
    }

    public Factura getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Factura idFactura) {
        this.idFactura = idFactura;
    }

    public ProductoServicio getIdProductoServicio() {
        return idProductoServicio;
    }

    public void setIdProductoServicio(ProductoServicio idProductoServicio) {
        this.idProductoServicio = idProductoServicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoServicioFactura != null ? idProductoServicioFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoServicioFactura)) {
            return false;
        }
        ProductoServicioFactura other = (ProductoServicioFactura) object;
        if ((this.idProductoServicioFactura == null && other.idProductoServicioFactura != null) || (this.idProductoServicioFactura != null && !this.idProductoServicioFactura.equals(other.idProductoServicioFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.ProductoServicioFactura[ idProductoServicioFactura=" + idProductoServicioFactura + " ]";
    }

}
