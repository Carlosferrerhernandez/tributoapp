/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.BcEntTributos;
import com.tributo.api.repository.BcEntTributosRepository;
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
public class BcEntTributosService {
    
  @Autowired
  BcEntTributosRepository bcEntTributosRepository;  
    
    public List<BcEntTributos>  getBcEntTributos() {
        return bcEntTributosRepository.findAll();
     } 
    
    public List<BcEntTributos>  getBcEntTributosByIdEntidadActivas(Integer identidad) {
        return bcEntTributosRepository.finbBcEntTributosByIdEntidadActivas(identidad);
     }
    
    public List<BcEntTributos>  getBcEntTributosByIdEntidad(Integer identidad) {
        return bcEntTributosRepository.finbBcEntTributosByIdEntidad(identidad);
     }
    
    public List<BcEntTributos>  getBcEntTributosById(Integer id) {
        return bcEntTributosRepository.finbBcEntTributosById(id);
     }
    
    public BcEntTributos saveBcEntTributos(BcEntTributos bcEntTributos ) {
        return bcEntTributosRepository.save(bcEntTributos);
    }
    
     
}
