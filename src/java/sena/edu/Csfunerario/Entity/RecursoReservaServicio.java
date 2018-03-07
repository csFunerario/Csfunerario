

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
@Table(name = "recursos_reservaservicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RecursoReservaServicio.findAll", query = "SELECT r FROM RecursoReservaServicio r")
    , @NamedQuery(name = "RecursoReservaServicio.findByIdRecursoReservaServicio", query = "SELECT r FROM RecursoReservaServicio r WHERE r.idRecursoReservaServicio = :idRecursoReservaServicio")})
public class RecursoReservaServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRecurso_ReservaServicio")
    private Integer idRecursoReservaServicio;
    @JoinColumn(name = "idRecurso", referencedColumnName = "idRecurso")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Recurso idRecurso;
    @JoinColumn(name = "idReservaServicio", referencedColumnName = "idReservaServicio")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ReservaServicio idReservaServicio;

    public RecursoReservaServicio() {
    }

    public RecursoReservaServicio(Integer idRecursoReservaServicio) {
        this.idRecursoReservaServicio = idRecursoReservaServicio;
    }

    public Integer getIdRecursoReservaServicio() {
        return idRecursoReservaServicio;
    }

    public void setIdRecursoReservaServicio(Integer idRecursoReservaServicio) {
        this.idRecursoReservaServicio = idRecursoReservaServicio;
    }

    public Recurso getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(Recurso idRecurso) {
        this.idRecurso = idRecurso;
    }

    public ReservaServicio getIdReservaServicio() {
        return idReservaServicio;
    }

    public void setIdReservaServicio(ReservaServicio idReservaServicio) {
        this.idReservaServicio = idReservaServicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRecursoReservaServicio != null ? idRecursoReservaServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecursoReservaServicio)) {
            return false;
        }
        RecursoReservaServicio other = (RecursoReservaServicio) object;
        if ((this.idRecursoReservaServicio == null && other.idRecursoReservaServicio != null) || (this.idRecursoReservaServicio != null && !this.idRecursoReservaServicio.equals(other.idRecursoReservaServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.RecursoReservaServicio[ idRecursoReservaServicio=" + idRecursoReservaServicio + " ]";
    }

}
