

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
 * Hora:  11:47:11 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "planes_productoservicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanProductoServicio.findAll", query = "SELECT p FROM PlanProductoServicio p")
    , @NamedQuery(name = "PlanProductoServicio.findByIdPlanProductoServicio", query = "SELECT p FROM PlanProductoServicio p WHERE p.idPlanProductoServicio = :idPlanProductoServicio")})
public class PlanProductoServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPlan_ProductoServicio")
    private Integer idPlanProductoServicio;
    @JoinColumn(name = "idPlan", referencedColumnName = "idPlan")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Plan idPlan;
    @JoinColumn(name = "idProductoServicio", referencedColumnName = "idProductoServicio")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ProductoServicio idProductoServicio;

    public PlanProductoServicio() {
    }

    public PlanProductoServicio(Integer idPlanProductoServicio) {
        this.idPlanProductoServicio = idPlanProductoServicio;
    }

    public Integer getIdPlanProductoServicio() {
        return idPlanProductoServicio;
    }

    public void setIdPlanProductoServicio(Integer idPlanProductoServicio) {
        this.idPlanProductoServicio = idPlanProductoServicio;
    }

    public Plan getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Plan idPlan) {
        this.idPlan = idPlan;
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
        hash += (idPlanProductoServicio != null ? idPlanProductoServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanProductoServicio)) {
            return false;
        }
        PlanProductoServicio other = (PlanProductoServicio) object;
        if ((this.idPlanProductoServicio == null && other.idPlanProductoServicio != null) || (this.idPlanProductoServicio != null && !this.idPlanProductoServicio.equals(other.idPlanProductoServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.PlanProductoServicio[ idPlanProductoServicio=" + idPlanProductoServicio + " ]";
    }

}
