

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
@Table(name = "beneficiosadicionales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeneficioAdicional.findAll", query = "SELECT b FROM BeneficioAdicional b")
    , @NamedQuery(name = "BeneficioAdicional.findByIdBeneficioAdicional", query = "SELECT b FROM BeneficioAdicional b WHERE b.idBeneficioAdicional = :idBeneficioAdicional")
    , @NamedQuery(name = "BeneficioAdicional.findByNombre", query = "SELECT b FROM BeneficioAdicional b WHERE b.nombre = :nombre")
    , @NamedQuery(name = "BeneficioAdicional.findByDescripcion", query = "SELECT b FROM BeneficioAdicional b WHERE b.descripcion = :descripcion")})
public class BeneficioAdicional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBeneficioAdicional")
    private Integer idBeneficioAdicional;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 700)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBeneficioAdicional", fetch = FetchType.EAGER)
    private List<BeneficioAdicionalPlan> beneficioAdicionalPlanList;

    public BeneficioAdicional() {
    }

    public BeneficioAdicional(Integer idBeneficioAdicional) {
        this.idBeneficioAdicional = idBeneficioAdicional;
    }

    public BeneficioAdicional(Integer idBeneficioAdicional, String nombre, String descripcion) {
        this.idBeneficioAdicional = idBeneficioAdicional;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdBeneficioAdicional() {
        return idBeneficioAdicional;
    }

    public void setIdBeneficioAdicional(Integer idBeneficioAdicional) {
        this.idBeneficioAdicional = idBeneficioAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<BeneficioAdicionalPlan> getBeneficioAdicionalPlanList() {
        return beneficioAdicionalPlanList;
    }

    public void setBeneficioAdicionalPlanList(List<BeneficioAdicionalPlan> beneficioAdicionalPlanList) {
        this.beneficioAdicionalPlanList = beneficioAdicionalPlanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBeneficioAdicional != null ? idBeneficioAdicional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeneficioAdicional)) {
            return false;
        }
        BeneficioAdicional other = (BeneficioAdicional) object;
        if ((this.idBeneficioAdicional == null && other.idBeneficioAdicional != null) || (this.idBeneficioAdicional != null && !this.idBeneficioAdicional.equals(other.idBeneficioAdicional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.BeneficioAdicional[ idBeneficioAdicional=" + idBeneficioAdicional + " ]";
    }

}
