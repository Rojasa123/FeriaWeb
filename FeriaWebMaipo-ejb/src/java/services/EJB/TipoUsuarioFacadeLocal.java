/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.TipoUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface TipoUsuarioFacadeLocal {

    void create(TipoUsuario tipoUsuario);

    void edit(TipoUsuario tipoUsuario);

    void remove(TipoUsuario tipoUsuario);

    TipoUsuario find(Object id);

    List<TipoUsuario> findAll();

    List<TipoUsuario> findRange(int[] range);

    int count();
    
}
