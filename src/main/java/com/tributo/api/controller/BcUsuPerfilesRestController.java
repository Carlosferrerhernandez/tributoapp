/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;


import com.tributo.api.modelo.BcUsuPerfiles;
import com.tributo.api.service.BcUsuPerfilesService;
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
public class BcUsuPerfilesRestController {
    @Autowired
    BcUsuPerfilesService bcUsuPerfilesService;
    
    
    @RequestMapping (value="/rest/bcusuperfiles/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<BcUsuPerfiles> listarBcUsuPerfiles() {
        return bcUsuPerfilesService.getBcUsuPerfiles();
    }
    
    
     //POST
    
    @RequestMapping (value="/rest/bcusuperfiles/save", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
    public BcUsuPerfiles saveBcUsuPerfiles(@RequestBody BcUsuPerfiles bcUsuPerfiles) {
        return bcUsuPerfilesService.saveBcUsuPerfiles(bcUsuPerfiles);
    }
    
}
