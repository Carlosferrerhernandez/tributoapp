/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.BcUsuUsuario;
import com.tributo.api.repository.BcUsuUsuarioRepository;
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
public class BcUsuUsuarioService {
    
    @Autowired
    BcUsuUsuarioRepository bcUsuUsuarioRepository;
    
    public List<BcUsuUsuario> getBcUsuUsuario() {
        return bcUsuUsuarioRepository.findAll();
    }
    
    public BcUsuUsuario saveBcUsuUsuario(BcUsuUsuario bcUsuUsuario){
        return bcUsuUsuarioRepository.save(bcUsuUsuario);
    }
    
}
