/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
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
@Table(name = "SOLICITUD_VENTA_EXTERNA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SolicitudVentaExterna.findAll", query = "SELECT s FROM SolicitudVentaExterna s")
    , @NamedQuery(name = "SolicitudVentaExterna.findByIdSolicitudVentaExterna", query = "SELECT s FROM SolicitudVentaExterna s WHERE s.idSolicitudVentaExterna = :idSolicitudVentaExterna")
    , @NamedQuery(name = "SolicitudVentaExterna.findByFechaSolicitud", query = "SELECT s FROM SolicitudVentaExterna s WHERE s.fechaSolicitud = :fechaSolicitud")
    , @NamedQuery(name = "SolicitudVentaExterna.findByCantidadSolicitada", query = "SELECT s FROM SolicitudVentaExterna s WHERE s.cantidadSolicitada = :cantidadSolicitada")
    , @NamedQuery(name = "SolicitudVentaExterna.findByDireccion", query = "SELECT s FROM SolicitudVentaExterna s WHERE s.direccion = :direccion")
    , @NamedQuery(name = "SolicitudVentaExterna.findByEstado", query = "SELECT s FROM SolicitudVentaExterna s WHERE s.estado = :estado")})
public class SolicitudVentaExterna implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    //declarar que el id se usa con una secuencia
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SQ_VENTA")
    //declarar la secuencia
    @SequenceGenerator(name="SQ_VENTA",sequenceName="SQ_SOLICITUD_VENTA_EXTERNA", allocationSize=1 )
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SOLICITUD_VENTA_EXTERNA")
    private BigDecimal idSolicitudVentaExterna;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD_SOLICITADA")
    private BigInteger cantidadSolicitada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "PRODUCTO_FK", referencedColumnName = "ID_PRODUCTO")
    @ManyToOne(optional = false)
    private Producto productoFk;
    @JoinColumn(name = "USUARIO_FK", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario usuarioFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitudVentaExternaFk")
    private Collection<VentaExterna> ventaExternaCollection;

    public SolicitudVentaExterna() {
    }

    public SolicitudVentaExterna(BigDecimal idSolicitudVentaExterna) {
        this.idSolicitudVentaExterna = idSolicitudVentaExterna;
    }

    public SolicitudVentaExterna(BigDecimal idSolicitudVentaExterna, Date fechaSolicitud, BigInteger cantidadSolicitada, String direccion, String estado) {
        this.idSolicitudVentaExterna = idSolicitudVentaExterna;
        this.fechaSolicitud = fechaSolicitud;
        this.cantidadSolicitada = cantidadSolicitada;
        this.direccion = direccion;
        this.estado = estado;
    }

    public BigDecimal getIdSolicitudVentaExterna() {
        return idSolicitudVentaExterna;
    }

    public void setIdSolicitudVentaExterna(BigDecimal idSolicitudVentaExterna) {
        this.idSolicitudVentaExterna = idSolicitudVentaExterna;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public BigInteger getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(BigInteger cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Producto getProductoFk() {
        return productoFk;
    }

    public void setProductoFk(Producto productoFk) {
        this.productoFk = productoFk;
    }

    public Usuario getUsuarioFk() {
        return usuarioFk;
    }

    public void setUsuarioFk(Usuario usuarioFk) {
        this.usuarioFk = usuarioFk;
    }

    @XmlTransient
    public Collection<VentaExterna> getVentaExternaCollection() {
        return ventaExternaCollection;
    }

    public void setVentaExternaCollection(Collection<VentaExterna> ventaExternaCollection) {
        this.ventaExternaCollection = ventaExternaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitudVentaExterna != null ? idSolicitudVentaExterna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudVentaExterna)) {
            return false;
        }
        SolicitudVentaExterna other = (SolicitudVentaExterna) object;
        if ((this.idSolicitudVentaExterna == null && other.idSolicitudVentaExterna != null) || (this.idSolicitudVentaExterna != null && !this.idSolicitudVentaExterna.equals(other.idSolicitudVentaExterna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.SolicitudVentaExterna[ idSolicitudVentaExterna=" + idSolicitudVentaExterna + " ]";
    }
    
}
