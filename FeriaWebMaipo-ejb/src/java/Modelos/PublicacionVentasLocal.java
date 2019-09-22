/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eroja
 */
@Entity
@Table(name = "PUBLICACION_VENTAS_LOCAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PublicacionVentasLocal.findAll", query = "SELECT p FROM PublicacionVentasLocal p")
    , @NamedQuery(name = "PublicacionVentasLocal.findByIdPublicacionVentaLocal", query = "SELECT p FROM PublicacionVentasLocal p WHERE p.idPublicacionVentaLocal = :idPublicacionVentaLocal")
    , @NamedQuery(name = "PublicacionVentasLocal.findByUbicacion", query = "SELECT p FROM PublicacionVentasLocal p WHERE p.ubicacion = :ubicacion")
    , @NamedQuery(name = "PublicacionVentasLocal.findByTipoDespacho", query = "SELECT p FROM PublicacionVentasLocal p WHERE p.tipoDespacho = :tipoDespacho")
    , @NamedQuery(name = "PublicacionVentasLocal.findByCantidad", query = "SELECT p FROM PublicacionVentasLocal p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "PublicacionVentasLocal.findByDescripcion", query = "SELECT p FROM PublicacionVentasLocal p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "PublicacionVentasLocal.findByPrecio", query = "SELECT p FROM PublicacionVentasLocal p WHERE p.precio = :precio")})
public class PublicacionVentasLocal implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PUBLICACION_VENTA_LOCAL")
    private BigDecimal idPublicacionVentaLocal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "UBICACION")
    private String ubicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "TIPO_DESPACHO")
    private String tipoDespacho;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private BigInteger cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO")
    private BigInteger precio;
    @ManyToMany(mappedBy = "publicacionVentasLocalList")
    private List<CompraLocal> compraLocalList;
    @JoinColumn(name = "COMISION_FK", referencedColumnName = "ID_COMISION")
    @ManyToOne(optional = false)
    private Comision comisionFk;
    @JoinColumn(name = "PRODUCTO_FK", referencedColumnName = "ID_PRODUCTO")
    @ManyToOne(optional = false)
    private Producto productoFk;
    @JoinColumn(name = "USUARIO_FK", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario usuarioFk;

    public PublicacionVentasLocal() {
    }

    public PublicacionVentasLocal(BigDecimal idPublicacionVentaLocal) {
        this.idPublicacionVentaLocal = idPublicacionVentaLocal;
    }

    public PublicacionVentasLocal(BigDecimal idPublicacionVentaLocal, String ubicacion, String tipoDespacho, BigInteger cantidad, String descripcion, BigInteger precio) {
        this.idPublicacionVentaLocal = idPublicacionVentaLocal;
        this.ubicacion = ubicacion;
        this.tipoDespacho = tipoDespacho;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public BigDecimal getIdPublicacionVentaLocal() {
        return idPublicacionVentaLocal;
    }

    public void setIdPublicacionVentaLocal(BigDecimal idPublicacionVentaLocal) {
        this.idPublicacionVentaLocal = idPublicacionVentaLocal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoDespacho() {
        return tipoDespacho;
    }

    public void setTipoDespacho(String tipoDespacho) {
        this.tipoDespacho = tipoDespacho;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    @XmlTransient
    public List<CompraLocal> getCompraLocalList() {
        return compraLocalList;
    }

    public void setCompraLocalList(List<CompraLocal> compraLocalList) {
        this.compraLocalList = compraLocalList;
    }

    public Comision getComisionFk() {
        return comisionFk;
    }

    public void setComisionFk(Comision comisionFk) {
        this.comisionFk = comisionFk;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPublicacionVentaLocal != null ? idPublicacionVentaLocal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PublicacionVentasLocal)) {
            return false;
        }
        PublicacionVentasLocal other = (PublicacionVentasLocal) object;
        if ((this.idPublicacionVentaLocal == null && other.idPublicacionVentaLocal != null) || (this.idPublicacionVentaLocal != null && !this.idPublicacionVentaLocal.equals(other.idPublicacionVentaLocal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.PublicacionVentasLocal[ idPublicacionVentaLocal=" + idPublicacionVentaLocal + " ]";
    }
    
}
