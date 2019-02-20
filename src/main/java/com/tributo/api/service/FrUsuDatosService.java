/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.FrUsuDatos;
import com.tributo.api.repository.FrUsuDatosRepository;
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
public class FrUsuDatosService {
    @Autowired
    FrUsuDatosRepository frUsuDatosRepository;
    
    public List<FrUsuDatos> getFrUsuDatos() {
        return frUsuDatosRepository.findAll();
    }
    
    public FrUsuDatos saveFrUsuDatos(FrUsuDatos frUsuDatos) {
        return frUsuDatosRepository.save(frUsuDatos);
    }
    
    
}
