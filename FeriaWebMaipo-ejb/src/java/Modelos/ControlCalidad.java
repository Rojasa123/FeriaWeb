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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eroja
 */
@Entity
@Table(name = "CONTROL_CALIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ControlCalidad.findAll", query = "SELECT c FROM ControlCalidad c")
    , @NamedQuery(name = "ControlCalidad.findByIdControlCalidad", query = "SELECT c FROM ControlCalidad c WHERE c.idControlCalidad = :idControlCalidad")
    , @NamedQuery(name = "ControlCalidad.findByTemperatura", query = "SELECT c FROM ControlCalidad c WHERE c.temperatura = :temperatura")
    , @NamedQuery(name = "ControlCalidad.findByCategoriaProducto", query = "SELECT c FROM ControlCalidad c WHERE c.categoriaProducto = :categoriaProducto")
    , @NamedQuery(name = "ControlCalidad.findByNivelMaduracion", query = "SELECT c FROM ControlCalidad c WHERE c.nivelMaduracion = :nivelMaduracion")
    , @NamedQuery(name = "ControlCalidad.findByNivelDescomposicion", query = "SELECT c FROM ControlCalidad c WHERE c.nivelDescomposicion = :nivelDescomposicion")
    , @NamedQuery(name = "ControlCalidad.findByTemperaturaContainer", query = "SELECT c FROM ControlCalidad c WHERE c.temperaturaContainer = :temperaturaContainer")
    , @NamedQuery(name = "ControlCalidad.findByTiempoDesdeRecoleccion", query = "SELECT c FROM ControlCalidad c WHERE c.tiempoDesdeRecoleccion = :tiempoDesdeRecoleccion")
    , @NamedQuery(name = "ControlCalidad.findByComentario", query = "SELECT c FROM ControlCalidad c WHERE c.comentario = :comentario")})
public class ControlCalidad implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CONTROL_CALIDAD")
    private BigDecimal idControlCalidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TEMPERATURA")
    private BigInteger temperatura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "CATEGORIA_PRODUCTO")
    private String categoriaProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NIVEL_MADURACION")
    private String nivelMaduracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NIVEL_DESCOMPOSICION")
    private String nivelDescomposicion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "TEMPERATURA_CONTAINER")
    private String temperaturaContainer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIEMPO_DESDE_RECOLECCION")
    private BigInteger tiempoDesdeRecoleccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "COMENTARIO")
    private String comentario;
    @JoinColumn(name = "VENTA_EXTERNA_FK", referencedColumnName = "ID_VENTA_EXTERNA")
    @ManyToOne(optional = false)
    private VentaExterna ventaExternaFk;

    public ControlCalidad() {
    }

    public ControlCalidad(BigDecimal idControlCalidad) {
        this.idControlCalidad = idControlCalidad;
    }

    public ControlCalidad(BigDecimal idControlCalidad, BigInteger temperatura, String categoriaProducto, String nivelMaduracion, String nivelDescomposicion, String temperaturaContainer, BigInteger tiempoDesdeRecoleccion, String comentario) {
        this.idControlCalidad = idControlCalidad;
        this.temperatura = temperatura;
        this.categoriaProducto = categoriaProducto;
        this.nivelMaduracion = nivelMaduracion;
        this.nivelDescomposicion = nivelDescomposicion;
        this.temperaturaContainer = temperaturaContainer;
        this.tiempoDesdeRecoleccion = tiempoDesdeRecoleccion;
        this.comentario = comentario;
    }

    public BigDecimal getIdControlCalidad() {
        return idControlCalidad;
    }

    public void setIdControlCalidad(BigDecimal idControlCalidad) {
        this.idControlCalidad = idControlCalidad;
    }

    public BigInteger getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(BigInteger temperatura) {
        this.temperatura = temperatura;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getNivelMaduracion() {
        return nivelMaduracion;
    }

    public void setNivelMaduracion(String nivelMaduracion) {
        this.nivelMaduracion = nivelMaduracion;
    }

    public String getNivelDescomposicion() {
        return nivelDescomposicion;
    }

    public void setNivelDescomposicion(String nivelDescomposicion) {
        this.nivelDescomposicion = nivelDescomposicion;
    }

    public String getTemperaturaContainer() {
        return temperaturaContainer;
    }

    public void setTemperaturaContainer(String temperaturaContainer) {
        this.temperaturaContainer = temperaturaContainer;
    }

    public BigInteger getTiempoDesdeRecoleccion() {
        return tiempoDesdeRecoleccion;
    }

    public void setTiempoDesdeRecoleccion(BigInteger tiempoDesdeRecoleccion) {
        this.tiempoDesdeRecoleccion = tiempoDesdeRecoleccion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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
        hash += (idControlCalidad != null ? idControlCalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControlCalidad)) {
            return false;
        }
        ControlCalidad other = (ControlCalidad) object;
        if ((this.idControlCalidad == null && other.idControlCalidad != null) || (this.idControlCalidad != null && !this.idControlCalidad.equals(other.idControlCalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.ControlCalidad[ idControlCalidad=" + idControlCalidad + " ]";
    }
    
}
