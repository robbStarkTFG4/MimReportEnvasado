/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mim.session;

import com.mim.models.ListaNombreEquipos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marcoisaac
 */
@Stateless
public class ListaNombreEquiposFacade extends AbstractFacade<ListaNombreEquipos> {

    @PersistenceContext(unitName = "envasadoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ListaNombreEquiposFacade() {
        super(ListaNombreEquipos.class);
    }
    
}
