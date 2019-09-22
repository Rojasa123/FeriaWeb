/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.ComisionAduana;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eroja
 */
@Local
public interface ComisionAduanaFacadeLocal {

    void create(ComisionAduana comisionAduana);

    void edit(ComisionAduana comisionAduana);

    void remove(ComisionAduana comisionAduana);

    ComisionAduana find(Object id);

    List<ComisionAduana> findAll();

    List<ComisionAduana> findRange(int[] range);

    int count();
    
}
