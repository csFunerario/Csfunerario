

package sena.edu.Csfunerario.Entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Fecha: 20/02/2018
 * Hora:  11:47:12 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "reservaservicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReservaServicio.findAll", query = "SELECT r FROM ReservaServicio r")
    , @NamedQuery(name = "ReservaServicio.findByIdReservaServicio", query = "SELECT r FROM ReservaServicio r WHERE r.idReservaServicio = :idReservaServicio")
    , @NamedQuery(name = "ReservaServicio.findByHoraIglesia", query = "SELECT r FROM ReservaServicio r WHERE r.horaIglesia = :horaIglesia")
    , @NamedQuery(name = "ReservaServicio.findByHoraCementerio", query = "SELECT r FROM ReservaServicio r WHERE r.horaCementerio = :horaCementerio")
    , @NamedQuery(name = "ReservaServicio.findByHoraTransporte", query = "SELECT r FROM ReservaServicio r WHERE r.horaTransporte = :horaTransporte")})
public class ReservaServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReservaServicio")
    private Integer idReservaServicio;
    @Column(name = "horaIglesia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaIglesia;
    @Column(name = "horaCementerio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaCementerio;
    @Column(name = "horaTransporte")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaTransporte;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idReservaServicio", fetch = FetchType.EAGER)
    private List<RecursoReservaServicio> recursoReservaServicioList;

    public ReservaServicio() {
    }

    public ReservaServicio(Integer idReservaServicio) {
        this.idReservaServicio = idReservaServicio;
    }

    public Integer getIdReservaServicio() {
        return idReservaServicio;
    }

    public void setIdReservaServicio(Integer idReservaServicio) {
        this.idReservaServicio = idReservaServicio;
    }

    public Date getHoraIglesia() {
        return horaIglesia;
    }

    public void setHoraIglesia(Date horaIglesia) {
        this.horaIglesia = horaIglesia;
    }

    public Date getHoraCementerio() {
        return horaCementerio;
    }

    public void setHoraCementerio(Date horaCementerio) {
        this.horaCementerio = horaCementerio;
    }

    public Date getHoraTransporte() {
        return horaTransporte;
    }

    public void setHoraTransporte(Date horaTransporte) {
        this.horaTransporte = horaTransporte;
    }

    @XmlTransient
    public List<RecursoReservaServicio> getRecursoReservaServicioList() {
        return recursoReservaServicioList;
    }

    public void setRecursoReservaServicioList(List<RecursoReservaServicio> recursoReservaServicioList) {
        this.recursoReservaServicioList = recursoReservaServicioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReservaServicio != null ? idReservaServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReservaServicio)) {
            return false;
        }
        ReservaServicio other = (ReservaServicio) object;
        if ((this.idReservaServicio == null && other.idReservaServicio != null) || (this.idReservaServicio != null && !this.idReservaServicio.equals(other.idReservaServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.ReservaServicio[ idReservaServicio=" + idReservaServicio + " ]";
    }

}
