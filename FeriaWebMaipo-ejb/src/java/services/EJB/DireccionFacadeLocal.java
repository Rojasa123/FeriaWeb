/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.Direccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface DireccionFacadeLocal {

    void create(Direccion direccion);

    void edit(Direccion direccion);

    void remove(Direccion direccion);

    Direccion find(Object id);

    List<Direccion> findAll();

    List<Direccion> findRange(int[] range);

    int count();
    
}
