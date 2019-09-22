/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.InformeEstadistico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface InformeEstadisticoFacadeLocal {

    void create(InformeEstadistico informeEstadistico);

    void edit(InformeEstadistico informeEstadistico);

    void remove(InformeEstadistico informeEstadistico);

    InformeEstadistico find(Object id);

    List<InformeEstadistico> findAll();

    List<InformeEstadistico> findRange(int[] range);

    int count();
    
}
