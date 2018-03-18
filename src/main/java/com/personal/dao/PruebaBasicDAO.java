/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.dao;

import com.personal.modelo.PruebaBasicDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres
 */
public class PruebaBasicDAO{
    public static List<PruebaBasicDTO> getPoliticas() {
        List<PruebaBasicDTO> lista = new ArrayList();
        PruebaBasicDTO politica0 = new PruebaBasicDTO(0, "Prueba 0");
        PruebaBasicDTO politica1 = new PruebaBasicDTO(1, "Prueba 1");
        PruebaBasicDTO politica2 = new PruebaBasicDTO(2, "Prueba 2");

        lista.add(politica0);
        lista.add(politica1);
        lista.add(politica2);

        return lista;
        
    }
}
