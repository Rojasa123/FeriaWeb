/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Usuario;
import services.EJB.UsuarioFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author eroja
 */
@Named(value = "usuarioControlador")
@SessionScoped
public class usuarioControlador implements Serializable {

    @EJB
    private UsuarioFacadeLocal usuarioFacade;
    private Usuario usuario;
    private String accion;
    
    @PostConstruct
    public void init() {
        usuario = new Usuario();
    }

    

public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
    
    public UsuarioFacadeLocal getUsuarioFacade() {
        return usuarioFacade;
    }

    public void setUsuarioFacade(UsuarioFacadeLocal usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

   
//Iniciar Sesion
    public String iniciarSesion() {
        Usuario us;

        String redireccion = null;
        try {
            us = usuarioFacade.iniciarSesion(usuario);
            if (us.getTipoUsuarioFk().getIdTipoUsuario() == 2 && us.getEstado().equals("Activo")) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                redireccion = "/vistas/vistaAdmin/inicioAdmin.xhtml";
            } else if (us.getTipoUsuarioFk().getIdTipoUsuario() == 3 && us.getEstado().equals("Activo")) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                redireccion = "/vistas/vistaClienteExtranjero/inicioClienteExtranjero.xhtml";
            } else if (us.getTipoUsuarioFk().getIdTipoUsuario() == 4 && us.getEstado().equals("Activo")) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                redireccion = "/vistas/vistaClienteLocal/inicioClienteLocal.xhtml";
            } else if (us.getTipoUsuarioFk().getIdTipoUsuario() == 5 && us.getEstado().equals("Activo")) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                redireccion = "/vistas/vistaProductor/inicioProductor.xhtml";
            } else if (us.getTipoUsuarioFk().getIdTipoUsuario() == 6 && us.getEstado().equals("Activo")) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                redireccion = "/vistas/vistaTransportista/inicioTransportista.xhtml";
            } else if (us.getTipoUsuarioFk().getIdTipoUsuario() == 7 && us.getEstado().equals("Activo")) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                redireccion = "/vistas/vistaBodeguero/inicioBodeguero.xhtml";
            } else if (us.getTipoUsuarioFk().getIdTipoUsuario() == 8 && us.getEstado().equals("Activo")) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                redireccion = "/vistas/vistaBodeguero/inicioBodeguero.xhtml";
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Su cuenta ha sido desactivada", ""));
            }

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "El Rut ingresado o Contraseña son incorrectas", ""));
        }
        return redireccion;

    }
    
    //Buscar usuario logueado
    public Usuario usuarioLogueado(){
        
        Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
       
        return us;
    }
    
   public void leer(Usuario usSeleccion){
       usuario = usSeleccion;
       this.setAccion("M");
   }

   public void actualizar(){
       usuarioFacade.edit(usuario);
   }


}
