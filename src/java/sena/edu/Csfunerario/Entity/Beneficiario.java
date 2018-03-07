

package sena.edu.Csfunerario.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Fecha: 20/02/2018
 * Hora:  11:47:11 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "beneficiarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Beneficiario.findAll", query = "SELECT b FROM Beneficiario b")
    , @NamedQuery(name = "Beneficiario.findByIdBeneficiario", query = "SELECT b FROM Beneficiario b WHERE b.idBeneficiario = :idBeneficiario")
    , @NamedQuery(name = "Beneficiario.findByTipoDocumento", query = "SELECT b FROM Beneficiario b WHERE b.tipoDocumento = :tipoDocumento")
    , @NamedQuery(name = "Beneficiario.findByNombre", query = "SELECT b FROM Beneficiario b WHERE b.nombre = :nombre")
    , @NamedQuery(name = "Beneficiario.findByApellido", query = "SELECT b FROM Beneficiario b WHERE b.apellido = :apellido")
    , @NamedQuery(name = "Beneficiario.findByFechaNacimiento", query = "SELECT b FROM Beneficiario b WHERE b.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Beneficiario.findByEdad", query = "SELECT b FROM Beneficiario b WHERE b.edad = :edad")
    , @NamedQuery(name = "Beneficiario.findByGenero", query = "SELECT b FROM Beneficiario b WHERE b.genero = :genero")
    , @NamedQuery(name = "Beneficiario.findByDireccion", query = "SELECT b FROM Beneficiario b WHERE b.direccion = :direccion")
    , @NamedQuery(name = "Beneficiario.findByCiudad", query = "SELECT b FROM Beneficiario b WHERE b.ciudad = :ciudad")
    , @NamedQuery(name = "Beneficiario.findByCorreo", query = "SELECT b FROM Beneficiario b WHERE b.correo = :correo")
    , @NamedQuery(name = "Beneficiario.findByParentesco", query = "SELECT b FROM Beneficiario b WHERE b.parentesco = :parentesco")
    , @NamedQuery(name = "Beneficiario.findByEstado", query = "SELECT b FROM Beneficiario b WHERE b.estado = :estado")
                })
public class Beneficiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBeneficiario")
    private Integer idBeneficiario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "numeroIdentificacion")
    private String numeroIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Edad")
    private int edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "telefonoFijo")
    private String telefonoFijo;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "telefonoCelular")
    private String telefonoCelular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "parentesco")
    private String parentesco;
    @Column(name = "estado")
    private Boolean estado;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario idUsuario;

    public Beneficiario() {
    }

    public Beneficiario(Integer idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }

    public Beneficiario(Integer idBeneficiario, String tipoDocumento, String numeroIdentificacion, String nombre, String apellido, Date fechaNacimiento, int edad, String genero, String direccion, String ciudad, String telefonoFijo, String telefonoCelular, String correo, String parentesco) {
        this.idBeneficiario = idBeneficiario;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.correo = correo;
        this.parentesco = parentesco;
    }

    public Integer getIdBeneficiario() {
        return idBeneficiario;
    }

    public void setIdBeneficiario(Integer idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBeneficiario != null ? idBeneficiario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beneficiario)) {
            return false;
        }
        Beneficiario other = (Beneficiario) object;
        if ((this.idBeneficiario == null && other.idBeneficiario != null) || (this.idBeneficiario != null && !this.idBeneficiario.equals(other.idBeneficiario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.Beneficiario[ idBeneficiario=" + idBeneficiario + " ]";
    }

}
