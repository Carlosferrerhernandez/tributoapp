/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;


import com.tributo.api.modelo.BcEntParametros;
import com.tributo.api.service.BcEntParametrosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricardo
 */
@RestController
public class BcEntParametrosRestController {
    
    @Autowired
    BcEntParametrosService bcEntParametrosService;
    
    
    @RequestMapping (value="/rest/bcentparametros/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<BcEntParametros> listarBcEntParametros() {
        return bcEntParametrosService.getBcEntParametros();
    }
    
    
    //POST
    
    @RequestMapping (value="/rest/bcentparametros/save", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
    public BcEntParametros saveBcEntParametros(@RequestBody BcEntParametros bcEntParametros) {

        return bcEntParametrosService.saveBcEntParametros(bcEntParametros);
    }  
    
}
