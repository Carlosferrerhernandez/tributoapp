/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;

import com.tributo.api.modelo.BcUsuUsuario;
import com.tributo.api.service.BcUsuUsuarioService;
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
public class BcUsuUsuarioRestController {
    @Autowired
    BcUsuUsuarioService bcUsuUsuarioService;
    
    
    @RequestMapping (value="/rest/bcusuusuario/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<BcUsuUsuario> listarBcUsuUsuario() {
        return bcUsuUsuarioService.getBcUsuUsuario();
       }
    
    
     //POST
    
    @RequestMapping (value="/rest/bcusuusuario/save", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
    public BcUsuUsuario saveBcUsuUsuario(@RequestBody BcUsuUsuario bcUsuUsuario) {
        return bcUsuUsuarioService.saveBcUsuUsuario(bcUsuUsuario);
    }
    
    
    
}
