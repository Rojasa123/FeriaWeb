/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.InformeEstadistico;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author eroja
 */
@Stateless
public class InformeEstadisticoFacade extends AbstractFacade<InformeEstadistico> implements InformeEstadisticoFacadeLocal {

    @PersistenceContext(unitName = "FeriaWebMaipo-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InformeEstadisticoFacade() {
        super(InformeEstadistico.class);
    }
    
}
