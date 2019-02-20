/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.controller.ResourceNotFoundException;
import com.tributo.api.modelo.FrUsuUsuario;
import com.tributo.api.repository.FrUsuUsuarioRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ricardo
 */
@Service
@Transactional
public class FrUsuUsuarioService {
    
    @Autowired
    FrUsuUsuarioRepository frUsuUsuarioRepository;
    
    
    //Listar todos los Usuarios
    public List<FrUsuUsuario> listarUsuarios () {
        
        return frUsuUsuarioRepository.findAll();
    }
    
    
    //Listar usuarios por email
    public List<FrUsuUsuario> getUsuariosByEmail (String email) {
        
        return frUsuUsuarioRepository.getUsuUsuariosByEmail(email);
    }
    
    //Grabar Usuarios
    public FrUsuUsuario saveUsuarios(FrUsuUsuario frUsuUsuario) {
        frUsuUsuario.setFechacreacion(new Date());
        return frUsuUsuarioRepository.save(frUsuUsuario);
        
    }
    
    //Actualizar Usuario
    public FrUsuUsuario actualizarUsuario(Integer id , FrUsuUsuario frUsuUsuario) {
        
        if (frUsuUsuarioRepository.findById(id)==null ){
           
             //Sacar una excepción
            
        }else {
            return frUsuUsuarioRepository.save(frUsuUsuario);
        }
        
        return frUsuUsuario;
        
    }
    
    
    //Borrar Usuario
    public void borrarUsuarioById(Integer id) {
        
        frUsuUsuarioRepository.deleteById(id);
        
    }
    
    
}
