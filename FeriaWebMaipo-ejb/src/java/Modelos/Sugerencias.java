/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "SUGERENCIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sugerencias.findAll", query = "SELECT s FROM Sugerencias s")
    , @NamedQuery(name = "Sugerencias.findByIdSugerencia", query = "SELECT s FROM Sugerencias s WHERE s.idSugerencia = :idSugerencia")
    , @NamedQuery(name = "Sugerencias.findByNombreSugerencia", query = "SELECT s FROM Sugerencias s WHERE s.nombreSugerencia = :nombreSugerencia")
    , @NamedQuery(name = "Sugerencias.findByDescripcionSugerencia", query = "SELECT s FROM Sugerencias s WHERE s.descripcionSugerencia = :descripcionSugerencia")})
public class Sugerencias implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SUGERENCIA")
    private BigDecimal idSugerencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_SUGERENCIA")
    private String nombreSugerencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "DESCRIPCION_SUGERENCIA")
    private String descripcionSugerencia;
    @JoinColumn(name = "USUARIO_FK", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario usuarioFk;

    public Sugerencias() {
    }

    public Sugerencias(BigDecimal idSugerencia) {
        this.idSugerencia = idSugerencia;
    }

    public Sugerencias(BigDecimal idSugerencia, String nombreSugerencia, String descripcionSugerencia) {
        this.idSugerencia = idSugerencia;
        this.nombreSugerencia = nombreSugerencia;
        this.descripcionSugerencia = descripcionSugerencia;
    }

    public BigDecimal getIdSugerencia() {
        return idSugerencia;
    }

    public void setIdSugerencia(BigDecimal idSugerencia) {
        this.idSugerencia = idSugerencia;
    }

    public String getNombreSugerencia() {
        return nombreSugerencia;
    }

    public void setNombreSugerencia(String nombreSugerencia) {
        this.nombreSugerencia = nombreSugerencia;
    }

    public String getDescripcionSugerencia() {
        return descripcionSugerencia;
    }

    public void setDescripcionSugerencia(String descripcionSugerencia) {
        this.descripcionSugerencia = descripcionSugerencia;
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
        hash += (idSugerencia != null ? idSugerencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sugerencias)) {
            return false;
        }
        Sugerencias other = (Sugerencias) object;
        if ((this.idSugerencia == null && other.idSugerencia != null) || (this.idSugerencia != null && !this.idSugerencia.equals(other.idSugerencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.Sugerencias[ idSugerencia=" + idSugerencia + " ]";
    }
    
}
