/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.TipoUsuario;
import services.EJB.TipoUsuarioFacadeLocal;

import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author eroja
 */
@Named(value = "tipoUsuarioBean")
@RequestScoped
public class tipoUsuarioBean {

    @EJB
    private TipoUsuarioFacadeLocal tipoUsuarioFacade;

    private String nombreTipoUsuario;
    private String descripcionTipoUsuario;

    public tipoUsuarioBean() {

    }

    public List<TipoUsuario> getTipoUsuario() {
        return tipoUsuarioFacade.findAll();
    }

    public TipoUsuarioFacadeLocal getTipoUsuarioFacade() {
        return tipoUsuarioFacade;
    }

    public void setTipoUsuarioFacade(TipoUsuarioFacadeLocal tipoUsuarioFacade) {
        this.tipoUsuarioFacade = tipoUsuarioFacade;
    }

    public String getNombreTipoUsuario() {
        return nombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

    public String getDescripcionTipoUsuario() {
        return descripcionTipoUsuario;
    }

    public void setDescripcionTipoUsuario(String descripcionTipoUsuario) {
        this.descripcionTipoUsuario = descripcionTipoUsuario;
    }

    public void crearTipoUsuario() {
        TipoUsuario tu = new TipoUsuario();
        tu.setDescripcionTipoUsuario(descripcionTipoUsuario);
        tu.setNombreTipoUsuario(nombreTipoUsuario);
        tipoUsuarioFacade.create(tu);

    }

}
