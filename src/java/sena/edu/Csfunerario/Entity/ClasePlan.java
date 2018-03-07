

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
 * Hora:  11:47:11 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "clasesplanes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClasePlan.findAll", query = "SELECT c FROM ClasePlan c")
    , @NamedQuery(name = "ClasePlan.findByIdClasePlan", query = "SELECT c FROM ClasePlan c WHERE c.idClasePlan = :idClasePlan")
    , @NamedQuery(name = "ClasePlan.findByNombre", query = "SELECT c FROM ClasePlan c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "ClasePlan.findByPrecio", query = "SELECT c FROM ClasePlan c WHERE c.precio = :precio")})
public class ClasePlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idClasePlan")
    private Integer idClasePlan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private float precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClasePlan", fetch = FetchType.EAGER)
    private List<PlanClasePlan> planClasePlanList;

    public ClasePlan() {
    }

    public ClasePlan(Integer idClasePlan) {
        this.idClasePlan = idClasePlan;
    }

    public ClasePlan(Integer idClasePlan, String nombre, float precio) {
        this.idClasePlan = idClasePlan;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getIdClasePlan() {
        return idClasePlan;
    }

    public void setIdClasePlan(Integer idClasePlan) {
        this.idClasePlan = idClasePlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @XmlTransient
    public List<PlanClasePlan> getPlanClasePlanList() {
        return planClasePlanList;
    }

    public void setPlanClasePlanList(List<PlanClasePlan> planClasePlanList) {
        this.planClasePlanList = planClasePlanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClasePlan != null ? idClasePlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasePlan)) {
            return false;
        }
        ClasePlan other = (ClasePlan) object;
        if ((this.idClasePlan == null && other.idClasePlan != null) || (this.idClasePlan != null && !this.idClasePlan.equals(other.idClasePlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.ClasePlan[ idClasePlan=" + idClasePlan + " ]";
    }

}
