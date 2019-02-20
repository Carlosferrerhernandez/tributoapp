/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.Municipio;
import com.tributo.api.repository.DemoCarlos;
import com.tributo.api.repository.MunicipioRepository;
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
public class MunicipioService {
    
    @Autowired
    MunicipioRepository municipioRepository;
    
    @Autowired
    DemoCarlos repo;
    
    public List<Municipio> listarMunicipios() {
        
        return municipioRepository.findAll();
    }
    
    public Municipio saveMunicipio(Municipio municipio) {
        return municipioRepository.save(municipio);
    }
    
     public List<Municipio> listarMunicipiosPorNombre(String nombre) {
        
        return repo.findByNombre(nombre);
    }
    
    
    
    
}
