

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
 * Hora:  11:47:10 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "planes_sedes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanSede.findAll", query = "SELECT p FROM PlanSede p")
    , @NamedQuery(name = "PlanSede.findByIdPlanSede", query = "SELECT p FROM PlanSede p WHERE p.idPlanSede = :idPlanSede")})
public class PlanSede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPlan_Sede")
    private Integer idPlanSede;
    @JoinColumn(name = "idPlan", referencedColumnName = "idPlan")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Plan idPlan;
    @JoinColumn(name = "idSede", referencedColumnName = "idSede")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Sede idSede;

    public PlanSede() {
    }

    public PlanSede(Integer idPlanSede) {
        this.idPlanSede = idPlanSede;
    }

    public Integer getIdPlanSede() {
        return idPlanSede;
    }

    public void setIdPlanSede(Integer idPlanSede) {
        this.idPlanSede = idPlanSede;
    }

    public Plan getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Plan idPlan) {
        this.idPlan = idPlan;
    }

    public Sede getIdSede() {
        return idSede;
    }

    public void setIdSede(Sede idSede) {
        this.idSede = idSede;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlanSede != null ? idPlanSede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanSede)) {
            return false;
        }
        PlanSede other = (PlanSede) object;
        if ((this.idPlanSede == null && other.idPlanSede != null) || (this.idPlanSede != null && !this.idPlanSede.equals(other.idPlanSede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.PlanSede[ idPlanSede=" + idPlanSede + " ]";
    }

}
