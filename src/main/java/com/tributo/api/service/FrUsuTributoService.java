/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.FrUsuTributo;
import com.tributo.api.repository.FrUsuTributoRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ricardo
 */
@Service
@Transactional
public class FrUsuTributoService {
    
    @Autowired
    FrUsuTributoRepository frUsuTributoRepository;
    
    public List<FrUsuTributo> getFrUsuTributo() {
        return frUsuTributoRepository.findAll();
    }
    
    public Optional<FrUsuTributo> getFrUsuTributoById( Integer id) {
        return frUsuTributoRepository.findById(id);
    }
    
    
     public FrUsuTributo saveFrUsuTributo (FrUsuTributo frUsuTributo) {
         if(frUsuTributo.getFechacrea() == null){
             frUsuTributo.setFechacrea(new Date());
         }
         return frUsuTributoRepository.save(frUsuTributo);
     }
     
    public List<FrUsuTributo> getFrUsuTributoByIdusuario( Integer idusuario) {
        return frUsuTributoRepository.findByIdusuario(idusuario);
    }
       
    
     public List<FrUsuTributo> filterFrUsuTributo( Integer idusuario, Integer identidad, Integer idtributo, String estado) {
        return frUsuTributoRepository.findByIdusuarioOrIdentidadOrIdtributoOrEstado(idusuario, identidad, idtributo, estado);
    } 
       
    
}
