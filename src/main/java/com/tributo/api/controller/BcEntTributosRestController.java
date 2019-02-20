/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;


import com.tributo.api.modelo.BcEntTributos;
import com.tributo.api.service.BcEntTributosService;
import java.util.List;
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
public class BcEntTributosRestController {
    
    @Autowired
    BcEntTributosService bcEntTributosService;
    
    
    @RequestMapping (value="/rest/bcenttributos/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<BcEntTributos> listarBcEntTributos() {
        return bcEntTributosService.getBcEntTributos();
    }
    
    
    @RequestMapping (value="/rest/bcenttributos/activas/{identidad}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<BcEntTributos> getBcEntTributosByIdEntidadActivas(@PathVariable("identidad") final Integer identidad) {
        return bcEntTributosService.getBcEntTributosByIdEntidadActivas(identidad);
    }
    
    
    @RequestMapping (value="/rest/bcenttributos/{identidad}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<BcEntTributos> getBcEntTributosByIdEntidad(@PathVariable("identidad") final Integer identidad) {
        return bcEntTributosService.getBcEntTributosByIdEntidad(identidad);
    }
    
    
    @RequestMapping (value="/rest/bcenttributos/id/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<BcEntTributos> getBcEntTributosById(@PathVariable("id") final Integer id) {
        return bcEntTributosService.getBcEntTributosById(id);
    }
    
    
    
      //POST
    
    @RequestMapping (value="/rest/bcenttributos/save", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
    public BcEntTributos saveBcEntTributos(@RequestBody BcEntTributos bcEntTributos) {

        bcEntTributosService.saveBcEntTributos(bcEntTributos);

        return bcEntTributos;
    }  
    
    
    
}
