/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.Pais;
import com.tributo.api.repository.PaisRepository;
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
public class PaisService {
    @Autowired
    PaisRepository paisRepository;
    
    public List<Pais> listaPaises () {
        
        return paisRepository.findAll();
        
    }
    
    public Pais savePais(Pais pais) {
        return paisRepository.save(pais);
    }
    
    
}
