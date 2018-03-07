

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
@Table(name = "tiporecursos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoRecurso.findAll", query = "SELECT t FROM TipoRecurso t")
    , @NamedQuery(name = "TipoRecurso.findByIdTipoRecurso", query = "SELECT t FROM TipoRecurso t WHERE t.idTipoRecurso = :idTipoRecurso")
    , @NamedQuery(name = "TipoRecurso.findByNombre", query = "SELECT t FROM TipoRecurso t WHERE t.nombre = :nombre")})
public class TipoRecurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoRecurso")
    private Integer idTipoRecurso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoRecurso", fetch = FetchType.EAGER)
    private List<Recurso> recursoList;

    public TipoRecurso() {
    }

    public TipoRecurso(Integer idTipoRecurso) {
        this.idTipoRecurso = idTipoRecurso;
    }

    public TipoRecurso(Integer idTipoRecurso, String nombre) {
        this.idTipoRecurso = idTipoRecurso;
        this.nombre = nombre;
    }

    public Integer getIdTipoRecurso() {
        return idTipoRecurso;
    }

    public void setIdTipoRecurso(Integer idTipoRecurso) {
        this.idTipoRecurso = idTipoRecurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Recurso> getRecursoList() {
        return recursoList;
    }

    public void setRecursoList(List<Recurso> recursoList) {
        this.recursoList = recursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoRecurso != null ? idTipoRecurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoRecurso)) {
            return false;
        }
        TipoRecurso other = (TipoRecurso) object;
        if ((this.idTipoRecurso == null && other.idTipoRecurso != null) || (this.idTipoRecurso != null && !this.idTipoRecurso.equals(other.idTipoRecurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.TipoRecurso[ idTipoRecurso=" + idTipoRecurso + " ]";
    }

}
