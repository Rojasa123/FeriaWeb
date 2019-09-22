/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eroja
 */
@Entity
@Table(name = "PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "Producto.findByNombreProducto", query = "SELECT p FROM Producto p WHERE p.nombreProducto = :nombreProducto")
    , @NamedQuery(name = "Producto.findByDescripcionProducto", query = "SELECT p FROM Producto p WHERE p.descripcionProducto = :descripcionProducto")
    , @NamedQuery(name = "Producto.findByTemporada", query = "SELECT p FROM Producto p WHERE p.temporada = :temporada")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PRODUCTO")
    private BigDecimal idProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "DESCRIPCION_PRODUCTO")
    private String descripcionProducto;
    @Size(max = 50)
    @Column(name = "TEMPORADA")
    private String temporada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoFk")
    private List<SolicitudVentaExterna> solicitudVentaExternaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoFk")
    private List<PublicacionVentasLocal> publicacionVentasLocalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoFk")
    private List<PostulacionesVentaExterna> postulacionesVentaExternaList;
    @JoinColumn(name = "CATEGORIA_FK", referencedColumnName = "ID_CATEGORIA")
    @ManyToOne(optional = false)
    private Categoria categoriaFk;
    @JoinColumn(name = "UNIDAD_MEDIDA_FK", referencedColumnName = "ID_UNIDAD_MEDIDA")
    @ManyToOne(optional = false)
    private UnidadMedida unidadMedidaFk;

    public Producto() {
    }

    public Producto(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(BigDecimal idProducto, String nombreProducto, String descripcionProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
    }

    public BigDecimal getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    @XmlTransient
    public List<SolicitudVentaExterna> getSolicitudVentaExternaList() {
        return solicitudVentaExternaList;
    }

    public void setSolicitudVentaExternaList(List<SolicitudVentaExterna> solicitudVentaExternaList) {
        this.solicitudVentaExternaList = solicitudVentaExternaList;
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

    public Categoria getCategoriaFk() {
        return categoriaFk;
    }

    public void setCategoriaFk(Categoria categoriaFk) {
        this.categoriaFk = categoriaFk;
    }

    public UnidadMedida getUnidadMedidaFk() {
        return unidadMedidaFk;
    }

    public void setUnidadMedidaFk(UnidadMedida unidadMedidaFk) {
        this.unidadMedidaFk = unidadMedidaFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.Producto[ idProducto=" + idProducto + " ]";
    }
    
}
