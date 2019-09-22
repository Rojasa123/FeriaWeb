/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
 *
 * @author eroja
 */
@Entity
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuario.findByRut", query = "SELECT u FROM Usuario u WHERE u.rut = :rut")
    , @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuario.findByApellidoP", query = "SELECT u FROM Usuario u WHERE u.apellidoP = :apellidoP")
    , @NamedQuery(name = "Usuario.findByApellidoM", query = "SELECT u FROM Usuario u WHERE u.apellidoM = :apellidoM")
    , @NamedQuery(name = "Usuario.findByNumeroTelefonico", query = "SELECT u FROM Usuario u WHERE u.numeroTelefonico = :numeroTelefonico")
    , @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email")
    , @NamedQuery(name = "Usuario.findByFechaRegistro", query = "SELECT u FROM Usuario u WHERE u.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Usuario.findByContrasena", query = "SELECT u FROM Usuario u WHERE u.contrasena = :contrasena")
    , @NamedQuery(name = "Usuario.findByEstado", query = "SELECT u FROM Usuario u WHERE u.estado = :estado")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private BigDecimal idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RUT")
    private BigInteger rut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "APELLIDO_P")
    private String apellidoP;
    @Size(max = 50)
    @Column(name = "APELLIDO_M")
    private String apellidoM;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO_TELEFONICO")
    private BigInteger numeroTelefonico;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Correo electrónico no válido")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CONTRASENA")
    private String contrasena;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioFk")
    private List<Direccion> direccionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioFk")
    private List<SolicitudVentaExterna> solicitudVentaExternaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioFk")
    private List<PostulacionesTransporte> postulacionesTransporteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioFk")
    private List<PublicacionVentasLocal> publicacionVentasLocalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioFk")
    private List<PostulacionesVentaExterna> postulacionesVentaExternaList;
    @JoinColumn(name = "CONTRATOS_FK", referencedColumnName = "ID_CONTRATO")
    @ManyToOne(optional = false)
    private Contratos contratosFk;
    @JoinColumn(name = "TIPO_USUARIO_FK", referencedColumnName = "ID_TIPO_USUARIO")
    @ManyToOne(optional = false)
    private TipoUsuario tipoUsuarioFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioFk")
    private List<Sugerencias> sugerenciasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioFk")
    private List<CompraLocal> compraLocalList;

    public Usuario() {
    }

    public Usuario(BigDecimal idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(BigDecimal idUsuario, BigInteger rut, String nombre, BigInteger numeroTelefonico, String email, Date fechaRegistro, String contrasena, String estado) {
        this.idUsuario = idUsuario;
        this.rut = rut;
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    public BigDecimal getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(BigDecimal idUsuario) {
        this.idUsuario = idUsuario;
    }

    public BigInteger getRut() {
        return rut;
    }

    public void setRut(BigInteger rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public BigInteger getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(BigInteger numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Direccion> getDireccionList() {
        return direccionList;
    }

    public void setDireccionList(List<Direccion> direccionList) {
        this.direccionList = direccionList;
    }

    @XmlTransient
    public List<SolicitudVentaExterna> getSolicitudVentaExternaList() {
        return solicitudVentaExternaList;
    }

    public void setSolicitudVentaExternaList(List<SolicitudVentaExterna> solicitudVentaExternaList) {
        this.solicitudVentaExternaList = solicitudVentaExternaList;
    }

    @XmlTransient
    public List<PostulacionesTransporte> getPostulacionesTransporteList() {
        return postulacionesTransporteList;
    }

    public void setPostulacionesTransporteList(List<PostulacionesTransporte> postulacionesTransporteList) {
        this.postulacionesTransporteList = postulacionesTransporteList;
    }

    @XmlTransient
    public List<PublicacionVentasLocal> getPublicacionVentasLocalList() {
        return publicacionVentasLocalList;
    }

    public void setPublicacionVentasLocalList(List<PublicacionVentasLocal> publicacionVentasLocalList) {
        this.publicacionVentasLocalList = publicacionVentasLocalList;
    }

    @XmlTransient
    public List<PostulacionesVentaExterna> getPostulacionesVentaExternaList() {
        return postulacionesVentaExternaList;
    }

    public void setPostulacionesVentaExternaList(List<PostulacionesVentaExterna> postulacionesVentaExternaList) {
        this.postulacionesVentaExternaList = postulacionesVentaExternaList;
    }

    public Contratos getContratosFk() {
        return contratosFk;
    }

    public void setContratosFk(Contratos contratosFk) {
        this.contratosFk = contratosFk;
    }

    public TipoUsuario getTipoUsuarioFk() {
        return tipoUsuarioFk;
    }

    public void setTipoUsuarioFk(TipoUsuario tipoUsuarioFk) {
        this.tipoUsuarioFk = tipoUsuarioFk;
    }

    @XmlTransient
    public List<Sugerencias> getSugerenciasList() {
        return sugerenciasList;
    }

    public void setSugerenciasList(List<Sugerencias> sugerenciasList) {
        this.sugerenciasList = sugerenciasList;
    }

    @XmlTransient
    public List<CompraLocal> getCompraLocalList() {
        return compraLocalList;
    }

    public void setCompraLocalList(List<CompraLocal> compraLocalList) {
        this.compraLocalList = compraLocalList;
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
        return "Modelos.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
