/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;

import com.tributo.api.modelo.BcTriDetalle;
import com.tributo.api.service.BcTriDetalleService;
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
public class BcTriDetalleRestController {
    
    @Autowired
    BcTriDetalleService bcTriDetalleService;
    
    
    @RequestMapping (value="/rest/bctridetalle/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<BcTriDetalle> listarBcTriDetalle() {
        return bcTriDetalleService.getBcTriDetalle();
    }
    
        
    //POST
    
    @RequestMapping (value="/rest/bctridetalle/save", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
    public BcTriDetalle saveBcTriDetalle(@RequestBody BcTriDetalle bcTriDetalle) {
        return bcTriDetalleService.saveBcTriDetalle(bcTriDetalle);
    }  
    
}
