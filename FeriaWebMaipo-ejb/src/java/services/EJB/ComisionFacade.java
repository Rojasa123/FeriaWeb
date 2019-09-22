/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.EJB;

import Modelos.Comision;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author eroja
 */
@Stateless
public class ComisionFacade extends AbstractFacade<Comision> implements ComisionFacadeLocal {

    @PersistenceContext(unitName = "FeriaWebMaipo-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComisionFacade() {
        super(Comision.class);
    }
    
}
