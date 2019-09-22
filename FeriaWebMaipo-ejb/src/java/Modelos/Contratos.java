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
@Table(name = "CONTRATOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contratos.findAll", query = "SELECT c FROM Contratos c")
    , @NamedQuery(name = "Contratos.findByIdContrato", query = "SELECT c FROM Contratos c WHERE c.idContrato = :idContrato")
    , @NamedQuery(name = "Contratos.findByNombreContrato", query = "SELECT c FROM Contratos c WHERE c.nombreContrato = :nombreContrato")
    , @NamedQuery(name = "Contratos.findByTipoContrato", query = "SELECT c FROM Contratos c WHERE c.tipoContrato = :tipoContrato")
    , @NamedQuery(name = "Contratos.findByDescripcionContrato", query = "SELECT c FROM Contratos c WHERE c.descripcionContrato = :descripcionContrato")
    , @NamedQuery(name = "Contratos.findByTerminosContrato", query = "SELECT c FROM Contratos c WHERE c.terminosContrato = :terminosContrato")
    , @NamedQuery(name = "Contratos.findByCondicionesContrato", query = "SELECT c FROM Contratos c WHERE c.condicionesContrato = :condicionesContrato")})
public class Contratos implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CONTRATO")
    private BigDecimal idContrato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_CONTRATO")
    private String nombreContrato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TIPO_CONTRATO")
    private String tipoContrato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DESCRIPCION_CONTRATO")
    private String descripcionContrato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "TERMINOS_CONTRATO")
    private String terminosContrato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "CONDICIONES_CONTRATO")
    private String condicionesContrato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contratosFk")
    private List<Usuario> usuarioList;

    public Contratos() {
    }

    public Contratos(BigDecimal idContrato) {
        this.idContrato = idContrato;
    }

    public Contratos(BigDecimal idContrato, String nombreContrato, String tipoContrato, String descripcionContrato, String terminosContrato, String condicionesContrato) {
        this.idContrato = idContrato;
        this.nombreContrato = nombreContrato;
        this.tipoContrato = tipoContrato;
        this.descripcionContrato = descripcionContrato;
        this.terminosContrato = terminosContrato;
        this.condicionesContrato = condicionesContrato;
    }

    public BigDecimal getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(BigDecimal idContrato) {
        this.idContrato = idContrato;
    }

    public String getNombreContrato() {
        return nombreContrato;
    }

    public void setNombreContrato(String nombreContrato) {
        this.nombreContrato = nombreContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getDescripcionContrato() {
        return descripcionContrato;
    }

    public void setDescripcionContrato(String descripcionContrato) {
        this.descripcionContrato = descripcionContrato;
    }

    public String getTerminosContrato() {
        return terminosContrato;
    }

    public void setTerminosContrato(String terminosContrato) {
        this.terminosContrato = terminosContrato;
    }

    public String getCondicionesContrato() {
        return condicionesContrato;
    }

    public void setCondicionesContrato(String condicionesContrato) {
        this.condicionesContrato = condicionesContrato;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContrato != null ? idContrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contratos)) {
            return false;
        }
        Contratos other = (Contratos) object;
        if ((this.idContrato == null && other.idContrato != null) || (this.idContrato != null && !this.idContrato.equals(other.idContrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.Contratos[ idContrato=" + idContrato + " ]";
    }
    
}
