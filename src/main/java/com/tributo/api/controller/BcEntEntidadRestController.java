/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;

import com.tributo.api.modelo.BcEntEntidad;
import com.tributo.api.service.BcEntEntidadService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricardo
 */
@RestController
public class BcEntEntidadRestController {
    
   @Autowired
   BcEntEntidadService bcEntEntidadService;

   //GETS
   
   
   @RequestMapping (value="/rest/bcententidad/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
   public List<BcEntEntidad> listarBcEntEntidad() {
       return bcEntEntidadService.getBcEntEntidad();
   }
   
   
   @RequestMapping (value="/rest/bcententidad/id/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
   public Optional<BcEntEntidad> findById(@PathVariable("id") final Integer id) {
       return bcEntEntidadService.findById(id);
   }
   
   
   @RequestMapping (value="/rest/bcententidad/nit/{nit}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
   public List<BcEntEntidad> findByNit(@PathVariable("nit") final String nit) {
       return bcEntEntidadService.findByNit(nit);
   }
   
   //POST
    
    @RequestMapping (value="/rest/bcententidad/save", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
    public BcEntEntidad saveBcEntEntidad(@RequestBody BcEntEntidad bcEntEntidad) {

        return bcEntEntidadService.saveBcEntEntidad(bcEntEntidad);
    }  
   
    
}
