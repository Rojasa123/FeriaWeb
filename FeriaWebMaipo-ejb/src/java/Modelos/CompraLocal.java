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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eroja
 */
@Entity
@Table(name = "COMPRA_LOCAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompraLocal.findAll", query = "SELECT c FROM CompraLocal c")
    , @NamedQuery(name = "CompraLocal.findByIdCompraLocal", query = "SELECT c FROM CompraLocal c WHERE c.idCompraLocal = :idCompraLocal")
    , @NamedQuery(name = "CompraLocal.findByTotal", query = "SELECT c FROM CompraLocal c WHERE c.total = :total")
    , @NamedQuery(name = "CompraLocal.findByCantidad", query = "SELECT c FROM CompraLocal c WHERE c.cantidad = :cantidad")})
public class CompraLocal implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_COMPRA_LOCAL")
    private BigDecimal idCompraLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL")
    private BigInteger total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private BigInteger cantidad;
    @JoinTable(name = "PUBLICACION_COMPRA_LOCAL", joinColumns = {
        @JoinColumn(name = "COMPRA_LOCAL_PF", referencedColumnName = "ID_COMPRA_LOCAL")}, inverseJoinColumns = {
        @JoinColumn(name = "PUBLICACION_VENTAS_LOCAL_PF", referencedColumnName = "ID_PUBLICACION_VENTA_LOCAL")})
    @ManyToMany
    private List<PublicacionVentasLocal> publicacionVentasLocalList;
    @JoinColumn(name = "USUARIO_FK", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario usuarioFk;

    public CompraLocal() {
    }

    public CompraLocal(BigDecimal idCompraLocal) {
        this.idCompraLocal = idCompraLocal;
    }

    public CompraLocal(BigDecimal idCompraLocal, BigInteger total, BigInteger cantidad) {
        this.idCompraLocal = idCompraLocal;
        this.total = total;
        this.cantidad = cantidad;
    }

    public BigDecimal getIdCompraLocal() {
        return idCompraLocal;
    }

    public void setIdCompraLocal(BigDecimal idCompraLocal) {
        this.idCompraLocal = idCompraLocal;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }

    @XmlTransient
    public List<PublicacionVentasLocal> getPublicacionVentasLocalList() {
        return publicacionVentasLocalList;
    }

    public void setPublicacionVentasLocalList(List<PublicacionVentasLocal> publicacionVentasLocalList) {
        this.publicacionVentasLocalList = publicacionVentasLocalList;
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
        hash += (idCompraLocal != null ? idCompraLocal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompraLocal)) {
            return false;
        }
        CompraLocal other = (CompraLocal) object;
        if ((this.idCompraLocal == null && other.idCompraLocal != null) || (this.idCompraLocal != null && !this.idCompraLocal.equals(other.idCompraLocal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.CompraLocal[ idCompraLocal=" + idCompraLocal + " ]";
    }
    
}
