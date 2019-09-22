/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.ControlCalidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface ControlCalidadFacadeLocal {

    void create(ControlCalidad controlCalidad);

    void edit(ControlCalidad controlCalidad);

    void remove(ControlCalidad controlCalidad);

    ControlCalidad find(Object id);

    List<ControlCalidad> findAll();

    List<ControlCalidad> findRange(int[] range);

    int count();
    
}
