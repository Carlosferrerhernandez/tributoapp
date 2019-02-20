/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;

import com.tributo.api.modelo.FrUsuUsuario;
import com.tributo.api.service.FrUsuUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
public class FrUsuUsuarioRestController {
 
@Autowired
FrUsuUsuarioService frUsuUsuarioService;


 //GETS
 
 @RequestMapping (value="/rest/frusuarios/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
 public List<FrUsuUsuario> listarUsuarios() {
     return frUsuUsuarioService.listarUsuarios();
 }   
 
 
 @RequestMapping (value="/rest/frusuarios/email/{email}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
 public List<FrUsuUsuario> listarUsuariosByEmail( @PathVariable("email") final String email) {
     return frUsuUsuarioService.getUsuariosByEmail(email);
 }   
 
 //POST
 
 @RequestMapping (value="/rest/frusuarios/save", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
 public FrUsuUsuario saveUsuarios(@RequestBody FrUsuUsuario frUsuUsuario) {
    
     return frUsuUsuarioService.saveUsuarios(frUsuUsuario);
 }  
 
 
 //PUT
 
 @RequestMapping (value="/rest/frusuarios/{id}", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
 public FrUsuUsuario updateUsuarios(@PathVariable("id") final Integer id, @RequestBody FrUsuUsuario frUsuUsuario) {
      
     return frUsuUsuarioService.actualizarUsuario(id,frUsuUsuario);
 }  
 
 //DELETE
 
 @RequestMapping (value="/rest/frusuarios/{id}", method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
 public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Integer id) {
    
     frUsuUsuarioService.borrarUsuarioById(id);

    return ResponseEntity.ok().build();
}
 
 
    
}
