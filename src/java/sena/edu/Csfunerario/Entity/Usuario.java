

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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Fecha: 20/02/2018
 * Hora:  11:47:10 AM    
 * Autor: Janel Gongora
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuario.findByApellido", query = "SELECT u FROM Usuario u WHERE u.apellido = :apellido")
    , @NamedQuery(name = "Usuario.findByFechaNacimiento", query = "SELECT u FROM Usuario u WHERE u.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Usuario.findByEdad", query = "SELECT u FROM Usuario u WHERE u.edad = :edad")
    , @NamedQuery(name = "Usuario.findByGenero", query = "SELECT u FROM Usuario u WHERE u.genero = :genero")
    , @NamedQuery(name = "Usuario.findByDireccion", query = "SELECT u FROM Usuario u WHERE u.direccion = :direccion")
    , @NamedQuery(name = "Usuario.findByCorreo", query = "SELECT u FROM Usuario u WHERE u.correo = :correo")
    , @NamedQuery(name = "Usuario.findByClave", query = "SELECT u FROM Usuario u WHERE u.clave = :clave")
    , @NamedQuery(name = "Usuario.findByEstado", query = "SELECT u FROM Usuario u WHERE u.estado = :estado")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private Integer idUsuario;
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
    @Column(name = "fechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad")
    private int edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "direccion")
    private String direccion;
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
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.EAGER)
    private List<UsuarioPlan> usuarioPlanList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.EAGER)
    private List<ContratoAfiliacionUsuario> contratoAfiliacionUsuarioList;
    @JoinColumn(name = "idCiudad", referencedColumnName = "idCiudad")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Ciudad idCiudad;
    @JoinColumn(name = "idTipoDocumento", referencedColumnName = "idTipoDocumento")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoDocumento idTipoDocumento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.EAGER)
    private List<Transancion> transancionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.EAGER)
    private List<Beneficiario> beneficiarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.EAGER)
    private List<UsuarioRol> usuarioRolList;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String numeroIdentificacion, String nombre, String apellido, Date fechaNacimiento, int edad, String genero, String direccion, String telefonoFijo, String telefonoCelular, String correo, String clave, boolean estado) {
        this.idUsuario = idUsuario;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.correo = correo;
        this.clave = clave;
        this.estado = estado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<UsuarioPlan> getUsuarioPlanList() {
        return usuarioPlanList;
    }

    public void setUsuarioPlanList(List<UsuarioPlan> usuarioPlanList) {
        this.usuarioPlanList = usuarioPlanList;
    }

    @XmlTransient
    public List<ContratoAfiliacionUsuario> getContratoAfiliacionUsuarioList() {
        return contratoAfiliacionUsuarioList;
    }

    public void setContratoAfiliacionUsuarioList(List<ContratoAfiliacionUsuario> contratoAfiliacionUsuarioList) {
        this.contratoAfiliacionUsuarioList = contratoAfiliacionUsuarioList;
    }

    public Ciudad getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Ciudad idCiudad) {
        this.idCiudad = idCiudad;
    }

    public TipoDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @XmlTransient
    public List<Transancion> getTransancionList() {
        return transancionList;
    }

    public void setTransancionList(List<Transancion> transancionList) {
        this.transancionList = transancionList;
    }

    @XmlTransient
    public List<Beneficiario> getBeneficiarioList() {
        return beneficiarioList;
    }

    public void setBeneficiarioList(List<Beneficiario> beneficiarioList) {
        this.beneficiarioList = beneficiarioList;
    }

    @XmlTransient
    public List<UsuarioRol> getUsuarioRolList() {
        return usuarioRolList;
    }

    public void setUsuarioRolList(List<UsuarioRol> usuarioRolList) {
        this.usuarioRolList = usuarioRolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.edu.Csfunerario.Entity.Usuario[ idUsuario=" + idUsuario + " ]";
    }

}
