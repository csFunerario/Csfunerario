

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
@Table(name = "recursos_sedes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RecursoSede.findAll", query = "SELECT r FROM RecursoSede r")
    , @NamedQuery(name = "RecursoSede.findByIdRecursoSede", query = "SELECT r FROM RecursoSede r WHERE r.idRecursoSede = :idRecursoSede")})
public class RecursoSede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRecurso_Sede")
    private Integer idRecursoSede;
    @JoinColumn(name = "idRecurso", referencedColumnName = "idRecurso")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Recurso idRecurso;
    @JoinColumn(name = "idSede", referencedColumnName = "idSede")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Sede idSede;

    public RecursoSede() {
    }

    public RecursoSede(Integer idRecursoSede) {
        this.idRecursoSede = idRecursoSede;
    }

    public Integer getIdRecursoSede() {
        return idRecursoSede;
    }

    public void setIdRecursoSede(Integer idRecursoSede) {
        this.idRecursoSede = idRecursoSede;
    }

    public Recurso getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(Recurso idRecurso) {
        this.idRecurso = idRecurso;
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
        hash += (idRecursoSede != null ? idRecursoSede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecursoSede)) {
            return false;
        }
        RecursoSede other = (RecursoSede) object;
        if ((this.idRecursoSede == null && other.idRecursoSede != null) || (this.idRecursoSede != null && !this.idRecursoSede.equals(other.idRecursoSede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.RecursoSede[ idRecursoSede=" + idRecursoSede + " ]";
    }

}
