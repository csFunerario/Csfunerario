

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
@Table(name = "beneficiosadicionales_planes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeneficioAdicionalPlan.findAll", query = "SELECT b FROM BeneficioAdicionalPlan b")
    , @NamedQuery(name = "BeneficioAdicionalPlan.findByIdBenedicioAdicionalPlan", query = "SELECT b FROM BeneficioAdicionalPlan b WHERE b.idBenedicioAdicionalPlan = :idBenedicioAdicionalPlan")})
public class BeneficioAdicionalPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBenedicioAdicional_Plan")
    private Integer idBenedicioAdicionalPlan;
    @JoinColumn(name = "idBeneficioAdicional", referencedColumnName = "idBeneficioAdicional")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private BeneficioAdicional idBeneficioAdicional;
    @JoinColumn(name = "idPlan", referencedColumnName = "idPlan")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Plan idPlan;

    public BeneficioAdicionalPlan() {
    }

    public BeneficioAdicionalPlan(Integer idBenedicioAdicionalPlan) {
        this.idBenedicioAdicionalPlan = idBenedicioAdicionalPlan;
    }

    public Integer getIdBenedicioAdicionalPlan() {
        return idBenedicioAdicionalPlan;
    }

    public void setIdBenedicioAdicionalPlan(Integer idBenedicioAdicionalPlan) {
        this.idBenedicioAdicionalPlan = idBenedicioAdicionalPlan;
    }

    public BeneficioAdicional getIdBeneficioAdicional() {
        return idBeneficioAdicional;
    }

    public void setIdBeneficioAdicional(BeneficioAdicional idBeneficioAdicional) {
        this.idBeneficioAdicional = idBeneficioAdicional;
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
        hash += (idBenedicioAdicionalPlan != null ? idBenedicioAdicionalPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeneficioAdicionalPlan)) {
            return false;
        }
        BeneficioAdicionalPlan other = (BeneficioAdicionalPlan) object;
        if ((this.idBenedicioAdicionalPlan == null && other.idBenedicioAdicionalPlan != null) || (this.idBenedicioAdicionalPlan != null && !this.idBenedicioAdicionalPlan.equals(other.idBenedicioAdicionalPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.BeneficioAdicionalPlan[ idBenedicioAdicionalPlan=" + idBenedicioAdicionalPlan + " ]";
    }

}
