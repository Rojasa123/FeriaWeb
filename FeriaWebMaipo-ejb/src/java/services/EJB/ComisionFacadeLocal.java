/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.Comision;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface ComisionFacadeLocal {

    void create(Comision comision);

    void edit(Comision comision);

    void remove(Comision comision);

    Comision find(Object id);

    List<Comision> findAll();

    List<Comision> findRange(int[] range);

    int count();
    
}
