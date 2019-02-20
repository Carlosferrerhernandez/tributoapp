/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;

import com.tributo.api.modelo.Municipio;
import com.tributo.api.repository.DemoCarlos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author A6 9220
 */
@RestController
public class DemoCarlosRest {
    
    @Autowired
    DemoCarlos demorepository;
    
    
    @RequestMapping(value = "/rest/demo", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET  )
    
    public List<Municipio> listar () {
             return  demorepository.findAll();
    }
    
            
    @RequestMapping(value = "/rest/municipio/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET  )
    
    public List<Municipio> listarPorNombre ( @PathVariable("nombre") String nombre  ) {
             return  demorepository.findByNombreIgnoreCase(nombre);
    }        
    
    
}
