

package sena.edu.Csfunerario.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Fecha: 20/02/2018
 * Hora:  11:47:12 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "tiposplanes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoPlan.findAll", query = "SELECT t FROM TipoPlan t")
    , @NamedQuery(name = "TipoPlan.findByIdTipoPlan", query = "SELECT t FROM TipoPlan t WHERE t.idTipoPlan = :idTipoPlan")
    , @NamedQuery(name = "TipoPlan.findByNombre", query = "SELECT t FROM TipoPlan t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TipoPlan.findByCategoria", query = "SELECT t FROM TipoPlan t WHERE t.categoria = :categoria")})
public class TipoPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoPlan")
    private Integer idTipoPlan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "categoria")
    private String categoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoPlan", fetch = FetchType.EAGER)
    private List<Plan> planList;

    public TipoPlan() {
    }

    public TipoPlan(Integer idTipoPlan) {
        this.idTipoPlan = idTipoPlan;
    }

    public TipoPlan(Integer idTipoPlan, String nombre, String categoria) {
        this.idTipoPlan = idTipoPlan;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public Integer getIdTipoPlan() {
        return idTipoPlan;
    }

    public void setIdTipoPlan(Integer idTipoPlan) {
        this.idTipoPlan = idTipoPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @XmlTransient
    public List<Plan> getPlanList() {
        return planList;
    }

    public void setPlanList(List<Plan> planList) {
        this.planList = planList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoPlan != null ? idTipoPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPlan)) {
            return false;
        }
        TipoPlan other = (TipoPlan) object;
        if ((this.idTipoPlan == null && other.idTipoPlan != null) || (this.idTipoPlan != null && !this.idTipoPlan.equals(other.idTipoPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.TipoPlan[ idTipoPlan=" + idTipoPlan + " ]";
    }

}
