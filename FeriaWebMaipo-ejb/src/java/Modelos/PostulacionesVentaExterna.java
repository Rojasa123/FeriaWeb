/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eroja
 */
@Entity
@Table(name = "POSTULACIONES_VENTA_EXTERNA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PostulacionesVentaExterna.findAll", query = "SELECT p FROM PostulacionesVentaExterna p")
    , @NamedQuery(name = "PostulacionesVentaExterna.findByIdPostulacionVentaExterna", query = "SELECT p FROM PostulacionesVentaExterna p WHERE p.idPostulacionVentaExterna = :idPostulacionVentaExterna")
    , @NamedQuery(name = "PostulacionesVentaExterna.findByValorProducto", query = "SELECT p FROM PostulacionesVentaExterna p WHERE p.valorProducto = :valorProducto")
    , @NamedQuery(name = "PostulacionesVentaExterna.findByCantidad", query = "SELECT p FROM PostulacionesVentaExterna p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "PostulacionesVentaExterna.findByEstado", query = "SELECT p FROM PostulacionesVentaExterna p WHERE p.estado = :estado")})
public class PostulacionesVentaExterna implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    //declarar que el id se usa con una secuencia
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SQ_POSTULACION_VE")
    //declarar la secuencia
    @SequenceGenerator(name="SQ_POSTULACION_VE",sequenceName="SQ_POSTULACIONES_VENTA_EXTERNA", allocationSize=1 )
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_POSTULACION_VENTA_EXTERNA")
    private BigDecimal idPostulacionVentaExterna;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_PRODUCTO")
    private BigInteger valorProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private BigInteger cantidad;
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
    @JoinColumn(name = "VENTA_EXTERNA_FK", referencedColumnName = "ID_VENTA_EXTERNA")
    @ManyToOne(optional = false)
    private VentaExterna ventaExternaFk;

    public PostulacionesVentaExterna() {
    }

    public PostulacionesVentaExterna(BigDecimal idPostulacionVentaExterna) {
        this.idPostulacionVentaExterna = idPostulacionVentaExterna;
    }

    public PostulacionesVentaExterna(BigDecimal idPostulacionVentaExterna, BigInteger valorProducto, BigInteger cantidad, String estado) {
        this.idPostulacionVentaExterna = idPostulacionVentaExterna;
        this.valorProducto = valorProducto;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public BigDecimal getIdPostulacionVentaExterna() {
        return idPostulacionVentaExterna;
    }

    public void setIdPostulacionVentaExterna(BigDecimal idPostulacionVentaExterna) {
        this.idPostulacionVentaExterna = idPostulacionVentaExterna;
    }

    public BigInteger getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(BigInteger valorProducto) {
        this.valorProducto = valorProducto;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
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

    public VentaExterna getVentaExternaFk() {
        return ventaExternaFk;
    }

    public void setVentaExternaFk(VentaExterna ventaExternaFk) {
        this.ventaExternaFk = ventaExternaFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPostulacionVentaExterna != null ? idPostulacionVentaExterna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostulacionesVentaExterna)) {
            return false;
        }
        PostulacionesVentaExterna other = (PostulacionesVentaExterna) object;
        if ((this.idPostulacionVentaExterna == null && other.idPostulacionVentaExterna != null) || (this.idPostulacionVentaExterna != null && !this.idPostulacionVentaExterna.equals(other.idPostulacionVentaExterna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.PostulacionesVentaExterna[ idPostulacionVentaExterna=" + idPostulacionVentaExterna + " ]";
    }
    
}
