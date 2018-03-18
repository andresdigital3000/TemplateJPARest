package com.personal.servicio;

import com.personal.dao.PruebaBasicDAO;
import com.personal.modelo.PruebaBasicDTO;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andres
 */
@Path("pruebabasic")
public class PruebaServicioBasic {
    private static final List<PruebaBasicDTO> lstPruebas = PruebaBasicDAO.getPoliticas();
    //private static List<Politica> lista = new PoliticaDAO(Politica.class).findAll();
    //private static List<Politica> lista 
    //@EJB
    //protected PoliticaDAO2 questFacade;
    
    /*@GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Politica> findAll() {
        //List<Politica> lista = new PoliticaDAO(Politica.class).findAll();
        //List<Politica> lstPolitica = questFacade.getPoliticas();
    }        
         */   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPrueba()
    {
        return Response.ok(lstPruebas).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response savePrueba(PruebaBasicDAO politica) 
    {
        //lista.add(politica);
        return Response.status(Response.Status.CREATED).build();
    }
    
}
