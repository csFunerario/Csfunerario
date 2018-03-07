

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
 * Hora:  11:47:13 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "planes_clasesplanes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanClasePlan.findAll", query = "SELECT p FROM PlanClasePlan p")
    , @NamedQuery(name = "PlanClasePlan.findByIdPlanClasePlan", query = "SELECT p FROM PlanClasePlan p WHERE p.idPlanClasePlan = :idPlanClasePlan")})
public class PlanClasePlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPlan_ClasePlan")
    private Integer idPlanClasePlan;
    @JoinColumn(name = "idClasePlan", referencedColumnName = "idClasePlan")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ClasePlan idClasePlan;
    @JoinColumn(name = "idPlan", referencedColumnName = "idPlan")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Plan idPlan;

    public PlanClasePlan() {
    }

    public PlanClasePlan(Integer idPlanClasePlan) {
        this.idPlanClasePlan = idPlanClasePlan;
    }

    public Integer getIdPlanClasePlan() {
        return idPlanClasePlan;
    }

    public void setIdPlanClasePlan(Integer idPlanClasePlan) {
        this.idPlanClasePlan = idPlanClasePlan;
    }

    public ClasePlan getIdClasePlan() {
        return idClasePlan;
    }

    public void setIdClasePlan(ClasePlan idClasePlan) {
        this.idClasePlan = idClasePlan;
    }

    public Plan getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Plan idPlan) {
        this.idPlan = idPlan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlanClasePlan != null ? idPlanClasePlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanClasePlan)) {
            return false;
        }
        PlanClasePlan other = (PlanClasePlan) object;
        if ((this.idPlanClasePlan == null && other.idPlanClasePlan != null) || (this.idPlanClasePlan != null && !this.idPlanClasePlan.equals(other.idPlanClasePlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.PlanClasePlan[ idPlanClasePlan=" + idPlanClasePlan + " ]";
    }

}
