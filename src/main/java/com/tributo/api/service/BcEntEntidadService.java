/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.BcEntEntidad;
import com.tributo.api.repository.BcEntEntidadRepository;
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
public class BcEntEntidadService {
     @Autowired
     BcEntEntidadRepository bcEntEntidadRepository;
     
     public List<BcEntEntidad> getBcEntEntidad () {
         return bcEntEntidadRepository.findAll() ;
     }
     
     public List<BcEntEntidad> findByNit (String nit) {
         return bcEntEntidadRepository.findByNit(nit) ;
     }
     
     public Optional<BcEntEntidad> findById (Integer id) {
         return bcEntEntidadRepository.findById(id);
     }
     
     public BcEntEntidad saveBcEntEntidad (BcEntEntidad bcEntEntidad) {
         return bcEntEntidadRepository.save(bcEntEntidad);
     }
     
     public List<BcEntEntidad> findByIdpais(Integer idpais) {
         return bcEntEntidadRepository.findByIdpais(idpais);
     } 
     
     
     public List<BcEntEntidad> findByIdpaisAndIddepartamento(Integer idpais, Integer iddepartamento){
         return bcEntEntidadRepository.findByIdpaisAndIddepartamento(idpais, iddepartamento);
     }
     
     
    
    
}
