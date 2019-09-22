/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.Sugerencias;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface SugerenciasFacadeLocal {

    void create(Sugerencias sugerencias);

    void edit(Sugerencias sugerencias);

    void remove(Sugerencias sugerencias);

    Sugerencias find(Object id);

    List<Sugerencias> findAll();

    List<Sugerencias> findRange(int[] range);

    int count();
    
}
