/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.Departamento;
import com.tributo.api.repository.DepartamentoRepository;
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
public class DepartamentoService {
    
    @Autowired
    DepartamentoRepository departamentoRepository;
    
    public List<Departamento> getDepartamento() {
        return departamentoRepository.findAll();
    }
    
    public Departamento saveDepartamento(Departamento departamento){
        return departamentoRepository.save(departamento);
    }
    
}
